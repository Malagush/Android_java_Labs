package com.example.lab4_sandwichclub;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Cat murzik = new Cat();
        murzik.name = "Мурзик";
        murzik.age = 9;
        murzik.color = Color.RED;

        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        Log.i("GSON", gson.toJson(murzik));
        TextView textView = findViewById(R.id.textView);

        String jsonText = "{\"name\":\"Петр\",\"color\":-16777216,\"age\":10}";
        Cat murziks = gson.fromJson(jsonText, Cat.class);
        Log.i("GSON", "Имя: " + murziks.name + "\nВозраст: " + murziks.age);

        textView.setText(gson.toJson(murzik)+"\n"+"Имя: " + murziks.name + " Возраст: " + murziks.age+"\n"+"Кот: "+murzik.name +", "+murzik.age +" лет, цвет:");

        View v = findViewById(R.id.viewcolor);
        v.setBackgroundColor(murzik.color);

    }

    public class Cat {

        public String name; // имя
        public int age; // возраст
        public int color; // цвет

    }
}