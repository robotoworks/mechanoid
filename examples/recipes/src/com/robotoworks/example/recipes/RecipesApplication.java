package com.robotoworks.example.recipes;

import android.app.Application;
import android.content.ContentUris;
import android.net.Uri;

import com.robotoworks.example.recipes.content.RecipesDBContract.Authors;
import com.robotoworks.example.recipes.content.RecipesDBContract.Ingredients;
import com.robotoworks.example.recipes.content.RecipesDBContract.Recipes;
import com.robotoworks.mechanoid.Mechanoid;

public class RecipesApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        
        Mechanoid.init(this);
        
        createRecipeData();
    }

	private void createRecipeData() {
		Recipes.delete();
        Authors.delete();
        Ingredients.delete();
        
        Uri authorJoeUri = Authors.newBuilder().setName("Joe Bloggs").insert();
        Uri authorJaneUri = Authors.newBuilder().setName("Jane Smith").insert();
        Uri authorHarryUri = Authors.newBuilder().setName("Harry Jones").insert();
        
        //
        // Omlette
        //
        Uri omletteUri = Recipes.newBuilder()
        .setTitle("Omelette")
        .setDescription("Wonderful omelette with cheese")
        .setAuthorId(ContentUris.parseId(authorJoeUri))
        .insert();
        
        long omletteId = ContentUris.parseId(omletteUri);
        
        Ingredients.newBuilder()
        .setRecipeId(omletteId)
        .setIngredient("Eggs")
        .setQuantity("3")
        .insert();
        
        Ingredients.newBuilder()
        .setRecipeId(omletteId)
        .setIngredient("Mozzarella")
        .setQuantity("100g")
        .insert();
        
        //
        // Stew
        //
        Uri stewUri = Recipes.newBuilder()
        .setTitle("Stew")
        .setDescription("Hearty stew with beef and vegtables")
        .setAuthorId(ContentUris.parseId(authorJaneUri))
        .insert();
 
        long stewId = ContentUris.parseId(stewUri);

        Ingredients.newBuilder()
        .setRecipeId(stewId)
        .setIngredient("Potatoes")
        .setQuantity("2")
        .insert();
        
        Ingredients.newBuilder()
        .setRecipeId(stewId)
        .setIngredient("Angus Beef")
        .setQuantity("500g")
        .insert();
        
        //
        // Ragu
        //
        Uri raguUri = Recipes.newBuilder()
        .setTitle("Ragu")
        .setDescription("Tasty ragu great served with rice or pasta")
        .setAuthorId(ContentUris.parseId(authorHarryUri))
        .insert();
        
        long raguId = ContentUris.parseId(raguUri);
  
        Ingredients.newBuilder()
        .setRecipeId(raguId)
        .setIngredient("Passata")
        .setQuantity("500g")
        .insert();
        
        Ingredients.newBuilder()
        .setRecipeId(raguId)
        .setIngredient("Mince")
        .setQuantity("500g")
        .insert();
        
        //
        // Vegetable Soup
        //
        Uri soupUri = Recipes.newBuilder()
        .setTitle("Vegetable Soup")
        .setDescription("Delicious traditional potato and carrot soup")
        .setAuthorId(ContentUris.parseId(authorJoeUri))
        .insert();

        long soupId = ContentUris.parseId(soupUri);
        
        Ingredients.newBuilder()
        .setRecipeId(soupId)
        .setIngredient("Chopped Carrots")
        .setQuantity("200g")
        .insert();
        
        Ingredients.newBuilder()
        .setRecipeId(soupId)
        .setIngredient("Chopped Potatoes")
        .setQuantity("200g")
        .insert();
	}
}
