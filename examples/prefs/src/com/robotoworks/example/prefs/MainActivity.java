package com.robotoworks.example.prefs;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        UserPreferences prefs = UserPreferences.getInstance();

        prefs.edit()
                .putName("Joe Bloggs")
                .putAge(25)
                .commit();

        String name = prefs.getName();
        int age = prefs.getAge();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}
