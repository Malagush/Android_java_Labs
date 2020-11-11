package com.example.lab3_recyclerview;

import java.util.ArrayList;
import java.util.List;

/** Вспомогательный класс для заполнения списка */
public class DummyContent {
    /**
     * Списочный массив элементов
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();
    private static final int COUNT = 25;

    static {
        // Добавление элементов в список.
        for (int k = 1; k <= COUNT; k++) {
            StringBuilder builder = new StringBuilder();
            builder.append("Информация об элементе:   ").append(k);
            for (int j = 0; j < k; j++) {
                builder.append("\n Детальная информация. ");
            }
            ITEMS.add(new DummyItem(String.valueOf(k), "Элемент " + k, builder.toString()));
        }
    }
}
