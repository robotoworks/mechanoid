package com.robotoworks.example.recipes;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.View;

public class MainActivity extends FragmentActivity {

    private static final String TAG_EXAMPLE = "example";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        if(getSupportFragmentManager().findFragmentByTag(TAG_EXAMPLE) != null) {
            findViewById(R.id.buttons).setVisibility(View.GONE);
        }
    }
    
    public void onExampleClick(View v) {
        String fragName = null;
        
        switch(v.getId()) {
        case R.id.button_recipes_simple:
            fragName = RecipeListFragment.class.getName();
            break;
        case R.id.button_recipes_with_author:
        	fragName = RecipesWithAuthorListFragment.class.getName();
        	break;
        case R.id.button_recipes_and_ingredients:
        	fragName = RecipesAndIngredientsListFragment.class.getName();
        	break;
        }
        
        getSupportFragmentManager()
        .beginTransaction()
        .add(android.R.id.content, Fragment.instantiate(this, fragName), TAG_EXAMPLE)
        .addToBackStack(null)
        .commit();
        
        findViewById(R.id.buttons).setVisibility(View.GONE);
    }
    
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        findViewById(R.id.buttons).setVisibility(View.VISIBLE);
    }
}
