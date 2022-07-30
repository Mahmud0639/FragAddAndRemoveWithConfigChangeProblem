package com.manuni.fragaddandremovewithconfigchangeproblem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    MyFirstFragment myFirstFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addFragment(View view) {
        myFirstFragment = new MyFirstFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.container,myFirstFragment).commit();
    }

    public void removeFragment(View view) {
        //here we have one problem while application configuration changing occurred. That is fragment will not be removed.
        if (myFirstFragment != null) {
            getSupportFragmentManager().beginTransaction().remove(myFirstFragment).commit();
        }
    }
}