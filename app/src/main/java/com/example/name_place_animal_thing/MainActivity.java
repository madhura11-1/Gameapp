package com.example.name_place_animal_thing;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import com.wajahatkarim3.easyflipview.EasyFlipView;

public class MainActivity extends AppCompatActivity {

    private Button b1;
    public static database_helper database;
    private EasyFlipView flip1,flip2,flip3,flip4,flip5,flip6,flip7,flip8,flip9;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         b1= findViewById(R.id.button1);
        database = Room.databaseBuilder(getApplicationContext(),database_helper.class,"databaseforapp").allowMainThreadQueries().build();
        flip1= findViewById(R.id.flip1);
        flip2=findViewById(R.id.flip2);
        flip3 = findViewById(R.id.flip3);
        flip4 =findViewById(R.id.flip4);
        flip5= findViewById(R.id.flip5);
        flip6=findViewById(R.id.flip6);
        flip7 = findViewById(R.id.flip7);
        flip8 =findViewById(R.id.flip8);
        flip9 =findViewById(R.id.flip9);
        int flag=1;
        if(flag==1) {
            if (flip1.isFlipEnabled()) {
                flip2.setFlipEnabled(false);
                flip3.setFlipEnabled(false);
                flip4.setFlipEnabled(false);
                flip5.setFlipEnabled(false);
                flip6.setFlipEnabled(false);
                flip7.setFlipEnabled(false);
                flip8.setFlipEnabled(false);
                flip9.setFlipEnabled(false);
                flag=0;
            } else if (flip2.isFlipEnabled()) {
                flip1.setFlipEnabled(false);
                flip3.setFlipEnabled(false);
                flip4.setFlipEnabled(false);
                flip5.setFlipEnabled(false);
                flip6.setFlipEnabled(false);
                flip7.setFlipEnabled(false);
                flip8.setFlipEnabled(false);
                flip9.setFlipEnabled(false);

                flag=0;

            }
            if (flip3.isFlipEnabled()) {
                flip2.setFlipEnabled(false);
                flip1.setFlipEnabled(false);
                flip4.setFlipEnabled(false);
                flip5.setFlipEnabled(false);
                flip6.setFlipEnabled(false);
                flip7.setFlipEnabled(false);
                flip8.setFlipEnabled(false);
                flip9.setFlipEnabled(false);
                flag=0;


            } else if (flip4.isFlipEnabled()) {
                flip2.setFlipEnabled(false);
                flip3.setFlipEnabled(false);
                flip1.setFlipEnabled(false);
                flip5.setFlipEnabled(false);
                flip6.setFlipEnabled(false);
                flip7.setFlipEnabled(false);
                flip8.setFlipEnabled(false);
                flip9.setFlipEnabled(false);
                flag=0;

            } else if (flip5.isFlipEnabled()) {
                flip2.setFlipEnabled(false);
                flip3.setFlipEnabled(false);
                flip4.setFlipEnabled(false);
                flip1.setFlipEnabled(false);
                flip6.setFlipEnabled(false);
                flip7.setFlipEnabled(false);
                flip8.setFlipEnabled(false);
                flip9.setFlipEnabled(false);
                flag=0;

            } else if (flip6.isFlipEnabled()) {
                flip2.setFlipEnabled(false);
                flip3.setFlipEnabled(false);
                flip4.setFlipEnabled(false);
                flip5.setFlipEnabled(false);
                flip1.setFlipEnabled(false);
                flip7.setFlipEnabled(false);
                flip8.setFlipEnabled(false);
                flip9.setFlipEnabled(false);
                flag=0;

            } else if (flip7.isFlipEnabled()) {
                flip2.setFlipEnabled(false);
                flip3.setFlipEnabled(false);
                flip4.setFlipEnabled(false);
                flip5.setFlipEnabled(false);
                flip6.setFlipEnabled(false);
                flip1.setFlipEnabled(false);
                flip8.setFlipEnabled(false);
                flip9.setFlipEnabled(false);
                flag=0;

            } else if (flip8.isFlipEnabled()) {
                flip2.setFlipEnabled(false);
                flip3.setFlipEnabled(false);
                flip4.setFlipEnabled(false);
                flip5.setFlipEnabled(false);
                flip6.setFlipEnabled(false);
                flip7.setFlipEnabled(false);
                flip1.setFlipEnabled(false);
                flip9.setFlipEnabled(false);
                flag=0;

            } else if (flip9.isFlipEnabled()) {
                flip2.setFlipEnabled(false);
                flip3.setFlipEnabled(false);
                flip4.setFlipEnabled(false);
                flip5.setFlipEnabled(false);
                flip6.setFlipEnabled(false);
                flip7.setFlipEnabled(false);
                flip8.setFlipEnabled(false);
                flip1.setFlipEnabled(false);
                flag=0;

            }
        }


         b1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                   startActivity(intent);
             }
         });

    }
}
