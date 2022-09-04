package com.myproject.healthappforelders;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class RecipeListItem extends ArrayAdapter<String> {
    private final Activity context;
    private final String[] title, timing, ingerdient, method, calorie;
    private final int[] imageId;


    public RecipeListItem(Activity context, String[] title, int[] imageId, String[] timing, String[] ingerdient, String[] method, String[] calorie) {
        super(context, R.layout.list_item, title);
        this.context = context;
        this.title = title;
        this.imageId = imageId;
        this.timing = timing;
        this.ingerdient = ingerdient;
        this.method = method;
        this.calorie = calorie;
    }

    public View getView(int position, View view, ViewGroup parent){
        LayoutInflater inflater =context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.list_item, null, true);
        TextView txtTitle = rowView.findViewById(R.id.textViewTitle);
        ImageView imageView = rowView.findViewById(R.id.image_list);

        txtTitle.setText(title[position]);
        imageView.setImageResource(imageId[position]);

        rowView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailRecipeActivity.class);
                intent.putExtra("title", title[position]);
                intent.putExtra("image", imageId[position]);
                intent.putExtra("time", timing[position]);
                intent.putExtra("ingre", ingerdient[position]);
                intent.putExtra("method", method[position]);
                intent.putExtra("calorie", calorie[position]);
                context.startActivity(intent);
            }
        });

        return rowView;
    }
}

