package com.example.name_place_animal_thing;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {user.class},version = 1,exportSchema = false)
public abstract class database_helper extends RoomDatabase {

    public abstract dataaccessobject mydao();
}
