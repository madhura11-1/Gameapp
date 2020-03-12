package com.example.name_place_animal_thing;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class Main2Activity extends AppCompatActivity {

    private EditText e1,e2,e3,e4;
    private String s1,s2,s3,s4;
    Button bsave;
    /*public static database_helper database;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

       /* database = Room.databaseBuilder(getApplicationContext(),database_helper.class,"dbhelp").allowMainThreadQueries().build();*/
        e1 = findViewById(R.id.e1);
        e2 = findViewById(R.id.e2);
        e3 = findViewById(R.id.e3);
        e4 = findViewById(R.id.e4);
        bsave = findViewById(R.id.bsave);


        bsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                s1 = e1.getText().toString();
                if(s1.isEmpty())
                {
                    e1.setError("please enter");
                    e1.requestFocus();
                    return;
                }
                s2 = e2.getText().toString();
                if(s2.isEmpty())
                {
                    e2.setError("please enter");
                    e2.requestFocus();
                    return;
                }
                s3 = e3.getText().toString();
                if(s3.isEmpty())
                {
                    e3.setError("please enter");
                    e3.requestFocus();
                    return;
                }
                s4 = e4.getText().toString();
                if(s4.isEmpty())
                {
                    e4.setError("please enter");
                    e4.requestFocus();
                    return;
                }

                user us = new user(s1,s2,s3,s4);
                MainActivity.database.mydao().writedata(us);
                Toast.makeText(Main2Activity.this, "successfully completed", Toast.LENGTH_SHORT).show();


            }
        });
    }
}
