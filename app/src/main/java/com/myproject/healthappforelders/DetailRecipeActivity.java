package com.myproject.healthappforelders;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailRecipeActivity extends AppCompatActivity {
    String title, timing, ingredient, method, calorie;
    int image;
    TextView name, time, ingre, met, cal;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_recipe);
        Intent intent = this.getIntent();
        if(intent != null){
            title = intent.getStringExtra("title");
            image = intent.getIntExtra("image", R.drawable.milk);
            timing = intent.getStringExtra("time");
            ingredient = intent.getStringExtra("ingre");
            method = intent.getStringExtra("method");
            calorie = intent.getStringExtra("calorie");
        }
        imageView = findViewById(R.id.recipe_img);
        name = findViewById(R.id.recipe_name);
        time = findViewById(R.id.time);
        ingre = findViewById(R.id.ingredient);
        met = findViewById(R.id.method);
        cal = findViewById(R.id.calorie_count);

        imageView.setImageResource(image);
        name.setText(title);
        time.setText(timing);
        ingre.setText(ingredient);
        met.setText(method);
        cal.setText(calorie);
    }
}