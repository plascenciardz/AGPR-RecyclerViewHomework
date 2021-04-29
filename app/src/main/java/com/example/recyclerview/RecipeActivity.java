package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class RecipeActivity extends AppCompatActivity {

    TextView title;
    TextView recipe;
    ImageView image;
    String numRecipe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);
        Recipe myRecipe = (Recipe) getIntent().getSerializableExtra("recipe");
        title = (TextView) findViewById(R.id.txt_title);
        recipe = (TextView) findViewById(R.id.txt_recipe);
        image = (ImageView) findViewById(R.id.image_recipe);
        title.setText(myRecipe.getTitle());
        recipe.setText(myRecipe.getRecipe());

        numRecipe = myRecipe.getImage();
        //image.setImageResource(R.drawable.recipe1);

        int id = getResources().getIdentifier(numRecipe, "drawable", getPackageName());
        image.setImageResource(id);

    }
}