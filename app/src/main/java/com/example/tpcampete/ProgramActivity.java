package com.example.tpcampete;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class ProgramActivity extends AppCompatActivity {
    private Intent returnIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_program);
    }

    @Override
    public boolean onCreateOptionsMenu(@NonNull Menu menu) {
        getMenuInflater().inflate(R.menu.program, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public void onFloatRetour(){
        returnIntent = new Intent(ProgramActivity.this, MainActivity.class);
        startActivity(returnIntent);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int option = item.getItemId();
        switch (option){
            case R.id.minitigre:
                Toast.makeText(ProgramActivity.this, "to miniTigres program", Toast.LENGTH_LONG).show();
                break;
            case R.id.science:
                Toast.makeText(ProgramActivity.this, "to science program", Toast.LENGTH_LONG).show();
                break;
            case R.id.artist:
                Toast.makeText(ProgramActivity.this, "to artist program", Toast.LENGTH_LONG).show();
                break;
            case R.id.fermier:
                Toast.makeText(ProgramActivity.this, "to fermier program", Toast.LENGTH_LONG).show();
                break;
            case R.id.dance:
                Toast.makeText(ProgramActivity.this, "to dance program", Toast.LENGTH_LONG).show();
                break;
            case R.id.artistCirque:
                Toast.makeText(ProgramActivity.this, "to artistCirque program", Toast.LENGTH_LONG).show();
                break;
            case R.id.comicStrip:
                Toast.makeText(ProgramActivity.this, "to comicStrip program", Toast.LENGTH_LONG).show();
                break;
            case R.id.music:
                Toast.makeText(ProgramActivity.this, "to music program", Toast.LENGTH_LONG).show();
                break;
            case R.id.sport:
                Toast.makeText(ProgramActivity.this, "to sport program", Toast.LENGTH_LONG).show();
                break;
            case R.id.retour:
                Toast.makeText(ProgramActivity.this, "to retour activity main", Toast.LENGTH_LONG).show();
                returnIntent = new Intent(ProgramActivity.this, MainActivity.class);
                startActivity(returnIntent);
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + option);
        }
        return super.onOptionsItemSelected(item);
    }
}