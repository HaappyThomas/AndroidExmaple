package com.example.tpcampete.entity;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.widget.Toast;

public class DbAdapter {
    // support for DRUD
    private SQLiteDatabase database;
    private DescriptionProgramDbHelper dbHelper;
    private Context context;

    // constructor
    public DbAdapter(Context context) {
        this.context = context;
        this.dbHelper = new DescriptionProgramDbHelper(
                context,
                DescriptionProgramDbHelper.DB_NAME,
                null,
                DescriptionProgramDbHelper.VERSION);
    }

    public void openDB(){
        database = dbHelper.getWritableDatabase();
    }

    public void closeDB(){
        database.close();
    }

    /**
     * methode add program description into table
     * method ajouter description du programme dans la table
     * @param descriptionProgram
     */
    public void ajouterDescriptionProgram(DescriptionProgram descriptionProgram){
        openDB();
        ContentValues cv = new ContentValues();
        cv.put(DescriptionProgramDbHelper.COL_NAME, descriptionProgram.getNomProgram());
        cv.put(DescriptionProgramDbHelper.COL_DESC, descriptionProgram.getDescriptionProgram());
        database.insert(DescriptionProgramDbHelper.TABLE_DESC, null, cv);
        Toast.makeText(context, "Ajouter reussi", Toast.LENGTH_LONG).show();
        closeDB();
    }

    /**
     * method read program description from table
     * methode lire la description du programme de la table
     * @param programName
     * @return
     */
    public String selectinnerDescriptionProgram(String programName){
        openDB();
        // initialise description string
        StringBuilder description = new StringBuilder();
        description.append(programName);
        description.append(":\n");
        // indiquer les colonnes du select
        String[] colonnes = {DescriptionProgramDbHelper.COL_DESC};
        Cursor cursor = database.query(DescriptionProgramDbHelper.TABLE_DESC,
                colonnes, null, null, null, null, null);
        cursor.moveToFirst();
        if(!cursor.isAfterLast()){
            // add description into description string
            description.append(cursor.getString(cursor.getColumnIndexOrThrow(DescriptionProgramDbHelper.COL_DESC)));
            description.append("\n");
        }
        cursor.close();
        closeDB();
        return description.toString();
    }



}
