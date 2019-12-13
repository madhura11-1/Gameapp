package com.example.name_place_animal_thing;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button b1;
    public static database_helper database;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         b1= findViewById(R.id.button1);
        database = Room.databaseBuilder(getApplicationContext(),database_helper.class,"dbhelp").allowMainThreadQueries().build();


         b1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                   startActivity(intent);
             }
         });

    }
}
