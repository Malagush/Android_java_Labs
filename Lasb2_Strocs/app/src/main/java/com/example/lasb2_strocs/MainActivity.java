package com.example.lasb2_strocs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView text1,text2;
    private String strok1,strok2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text1=findViewById(R.id.text);
        text2=findViewById(R.id.tv_result);

        strok1="Всё, что нам нужно";
        strok2 = Phaser.PhraserGen();

        text1.setText(strok1+" – это ");
    }

    public void GenClick(View view) {

        strok2 = Phaser.PhraserGen();

        text1.setText(strok1 + " – это " + strok2 +".");

        text2.setText(strok2.substring(0, 1).toUpperCase() + strok2.substring(1)+
                        " – это " + strok1.substring(0, 1).toLowerCase() + strok1.substring(1) +".");

      //  text.setText("Всё, что нам нужно – это " + Phaser.PhraserGen()+".");

        //   strok1=Phaser.PhraserGen() +" – это " + Phaser.PhraserGen()+".";
        //   strok1= strok1.substring(0, 1).toUpperCase() + strok1.substring(1);

        //   text2.setText(strok1);
    }
}