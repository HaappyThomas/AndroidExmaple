package com.example.tpcampete.entity;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DescriptionProgramDbHelper extends SQLiteOpenHelper {
    // declaration de constantes
    // for database: description
    public static final String DB_NAME = "description";
    public static final int VERSION = 1;

    // for table: tb_desc
    public static final String TABLE_DESC = "tb_desc";
    // for table colonne: id,
    public static final String COL_ID = "_id";
    public static final String COL_NAME = "nom";
    public static final String COL_DESC = "description";

    // sql for create table
    public static final String DDL_CREATE_TABLE = "create table " + TABLE_DESC + "("
            + COL_ID + " integer primary key autoincrement, "
            + COL_NAME + " TEXT, "
            + COL_DESC + " TEXT)";


    public DescriptionProgramDbHelper(@Nullable Context context,
                                      @Nullable String name,
                                      @Nullable SQLiteDatabase.CursorFactory factory,
                                      int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        // if database n'existe pas create databas
        // if table n'existe pas create table
        sqLiteDatabase.execSQL(DDL_CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
