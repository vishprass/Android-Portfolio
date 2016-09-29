package com.example.vishnuprasadssattigeri.vishnusattigeriportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Popular Movies Button
        Button popularMovies = (Button)findViewById(R.id.popular_movies);
        popularMovies.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                showToast("Popular Movies Coming Soon");
            }
        });

        //Popular Movies Button
        Button capstone = (Button)findViewById(R.id.capstone);
        capstone.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                showToast("Coming Soon");
            }
        });

        //Popular Movies Button
        Button stockHawk = (Button)findViewById(R.id.stock_hawk);
        stockHawk.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                showToast("Stock Hawk Coming Soon");
            }
        });

        //Popular Movies Button
        Button buildItBigger = (Button)findViewById(R.id.build_it_bigger);
        buildItBigger.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                showToast("Coming Soon");
            }
        });

        //Popular Movies Button
        Button yourApp = (Button)findViewById(R.id.your_app);
        yourApp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                showToast("Coming Soon");
            }
        });

        //Popular Movies Button
        Button goUbiquitous = (Button)findViewById(R.id.go_ubiquitous);
        goUbiquitous.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                showToast("Coming Soon");
            }
        });
    }

    //This method is used to display toast
    protected void showToast(String message){

        CharSequence text = message;
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(getApplicationContext(), text, duration);
        toast.show();
    }
}
