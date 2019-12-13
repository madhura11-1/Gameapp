package com.example.name_place_animal_thing;

import androidx.annotation.RequiresPermission;
import androidx.room.Dao;
import androidx.room.Insert;

@Dao
public interface dataaccessobject {

    @Insert
    public void writedata(user use);
}
