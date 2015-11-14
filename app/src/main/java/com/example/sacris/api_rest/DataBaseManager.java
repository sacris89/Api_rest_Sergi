package com.example.sacris.api_rest;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by sacris on 11/11/2015.
 */
public class DataBaseManager {

    public static final String TABLE_NAME = "tb_Github";
    public static final String ID = "_id";
    public static final String CN_id = "id";
    public static final String CN_name = "name";

    private DbHelper helper;
    private SQLiteDatabase db;

    public DataBaseManager(Context context){
        helper = new DbHelper(context);
        db = helper.getWritableDatabase();

    //   db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);

    }


    public static final String crear_Taula(){
        String sql = "create table "+ TABLE_NAME + " (" + ID + " integer primary key autoincrement, " + CN_id + " text not null, " + CN_name + " text);";
        return sql;
    }

public  ContentValues setContentValues(github github){
    ContentValues valors = new ContentValues();
    valors.put(CN_id,github.getId());
    valors.put(CN_name, github.getNom());
    return valors;
}


    public    github[]  rebreDades(){

        Cursor c = db.query(TABLE_NAME,null,null,null,null,null,null);
        int total = c.getCount();
        c.moveToFirst();
        github[] dades = new github[total];
        int x = 0;
        while(!c.isAfterLast()){
            github g = new github(  c.getString(0),c.getString(2));

            dades[x] = g;
            x++;
            c.moveToNext();
        }
        c.close();

        return dades;
    }


    public void insertar(ContentValues valors){

db.insert(TABLE_NAME, null, valors);

    }


   public void deelte_Taula(){

       db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
       db.execSQL(crear_Taula());

   }


}
