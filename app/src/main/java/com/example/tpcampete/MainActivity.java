package com.example.tpcampete;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Intent programIntent, infomationIntent, registrationIntent, helpIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // ajouter top menu
    @Override
    public boolean onCreateOptionsMenu(@NonNull Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    // action pour les options du top menu
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int option = item.getItemId();
        switch (option){
            case R.id.program:
//                Toast.makeText(MainActivity.this, "to activity program", Toast.LENGTH_LONG).show();
                programIntent = new Intent(MainActivity.this, ProgramActivity.class);
                startActivity(programIntent);
                break;
            case R.id.registration:
//                Toast.makeText(MainActivity.this, "to activity registration", Toast.LENGTH_LONG).show();
                registrationIntent= new Intent(MainActivity.this, RegistrationActivity.class);
                startActivity(registrationIntent);
                break;
            case R.id.infomation:
//                Toast.makeText(MainActivity.this, "to activity info", Toast.LENGTH_LONG).show();
                infomationIntent = new Intent(MainActivity.this, InformationActivity.class);
                startActivity(infomationIntent);
                break;
            case R.id.help:
//                Toast.makeText(MainActivity.this, "to activity help", Toast.LENGTH_LONG).show();
                helpIntent = new Intent(MainActivity.this, HelpActivity.class);
                startActivity(helpIntent);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + option);
        }
        return super.onOptionsItemSelected(item);
    }
}