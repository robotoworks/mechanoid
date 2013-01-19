package com.robotoworks.example.recipes;

import com.robotoworks.examples.recipes.content.RecipesDBContract.Authors;
import com.robotoworks.examples.recipes.content.RecipesDBContract.Recipes;
import com.robotoworks.mechanoid.Mechanoid;

import android.app.Application;
import android.content.ContentUris;
import android.net.Uri;

public class RecipesApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        
        Mechanoid.init(this);
        
        Recipes.delete();
        Authors.delete();
        
        Uri authorJoeUri = Authors.newBuilder().setName("Joe Bloggs").insert();
        Uri authorJaneUri = Authors.newBuilder().setName("Jane Smith").insert();
        Uri authorHarryUri = Authors.newBuilder().setName("Harry Jones").insert();
        
        Recipes.newBuilder()
        .setTitle("Omelette")
        .setDescription("Wonderful omelette with cheese")
        .setAuthorId(ContentUris.parseId(authorJoeUri))
        .insert();
        
        Recipes.newBuilder()
        .setTitle("Stew")
        .setDescription("Hearty stew with beef and vegtables")
        .setAuthorId(ContentUris.parseId(authorJaneUri))
        .insert();
        
        Recipes.newBuilder()
        .setTitle("Ragu")
        .setDescription("Tasty ragu great served with rice or pasta")
        .setAuthorId(ContentUris.parseId(authorHarryUri))
        .insert();
        
        Recipes.newBuilder()
        .setTitle("Vegetable Soup")
        .setDescription("Delicious traditional potato and carrot soup")
        .setAuthorId(ContentUris.parseId(authorJoeUri))
        .insert();
    }
}
