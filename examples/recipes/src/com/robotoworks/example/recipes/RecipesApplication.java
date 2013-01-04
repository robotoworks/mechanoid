package com.robotoworks.example.recipes;

import com.robotoworks.examples.recipes.content.RecipesDBContract.Recipes;
import com.robotoworks.mechanoid.Mechanoid;

import android.app.Application;

public class RecipesApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        
        Mechanoid.init(this);
        
        Recipes.delete();
        
        Recipes.newBuilder()
        .setTitle("Omelette")
        .setDescription("Wonderful omelette with cheese")
        .insert();
        
        Recipes.newBuilder()
        .setTitle("Stew")
        .setDescription("Hearty stew with beef and vegtables")
        .insert();
        
        Recipes.newBuilder()
        .setTitle("Ragu")
        .setDescription("Tasty ragu great served with rice or pasta")
        .insert();
        
        Recipes.newBuilder()
        .setTitle("Vegetable Soup")
        .setDescription("Delicious traditional potato and carrot soup")
        .insert();
    }
}
