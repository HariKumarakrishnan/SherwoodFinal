package com.example.hackathonproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);



        Button btnStock = (Button)findViewById(R.id.stock);
        Button btnProfile = (Button)findViewById(R.id.profile);


        btnStock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intToStock = new Intent(HomeActivity.this, Stock.class);
                startActivity(intToStock);
            }
        });

        btnProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intToProfile = new Intent(HomeActivity.this, EditProfile.class);
                startActivity(intToProfile);
            }
        });


    }

}