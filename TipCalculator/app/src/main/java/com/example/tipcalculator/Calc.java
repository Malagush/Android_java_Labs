package com.example.tipcalculator;



public class Calc {
    private double billAmount; // Сумма счёта
    private double percent; // Процент чаевых
    private double tip; // Сумма чаевых
    private double total; // Итоговая сумма

    public static double calculateTip(double billAmount, double percent) { return billAmount*percent; }
    public static double calculateTotal(double billAmount, double percent) { return billAmount*(1+percent); }


    public double getBillAmount() { return billAmount; }
    public void setBillAmount(double billAmount) { this.billAmount = billAmount; }

    public double getPercent() { return percent; }
    public void setPercent(double percent) { this.percent = percent; }

    public double getTip() { return tip; }
    public void setTip(double tip) { this.tip = tip; }

    public double getTotal() { return total; }
    public void setTotal(double total) { this.total = total; }

}
