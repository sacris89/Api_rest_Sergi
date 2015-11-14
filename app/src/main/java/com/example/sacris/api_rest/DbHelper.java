package com.example.sacris.api_rest;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by sacris on 11/11/2015.
 */
public class DbHelper extends SQLiteOpenHelper {


    private static final String DB_NAME = "github.sqlite";
    private static final int  SCHEMA_VERSION = 1;



    public DbHelper(Context context) {
        super(context,DB_NAME, null, SCHEMA_VERSION);


    }

    @Override
    public void onCreate(SQLiteDatabase db) {

db.execSQL(DataBaseManager.crear_Taula());

    }


    public void borrar(SQLiteDatabase db){
        db.execSQL("DROP TABLE IF EXISTS " + DB_NAME);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS " + DB_NAME);
        onCreate(db);

    }
}
