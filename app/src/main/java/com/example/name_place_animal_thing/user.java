package com.example.name_place_animal_thing;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "USER_TABLE")
public class user {

    @PrimaryKey
    private String Name;

    private String Place;

    private String Animal;

    private String Thing;

    public user(){}

    public user(String name,String place,String animal,String thing)
    {
        Name = name;
        Place = place;
        Animal =animal;
        Thing = thing;
    }

    public String getName() {
        return Name;
    }

    public String getPlace() {
        return Place;
    }

    public String getAnimal() {
        return Animal;
    }

    public String getThing() {
        return Thing;
    }
}
