package com.example.recyclerview;

import java.io.Serializable;

public class Recipe implements Serializable {

    private String title;
    private String description;
    private String recipe;
    private String image;

    public  Recipe (String title, String description, String recipe, String image) {
        this.title = title;
        this.description = description;
        this.recipe = recipe;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getRecipe() {
        return recipe;
    }

    public String getImage() {
        return image;
    }
}
