package com.example.tpcampete;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(@NonNull Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int option = item.getItemId();
        switch (option){
            case R.id.program:
                Toast.makeText(MainActivity.this, "to activity program", Toast.LENGTH_LONG).show();
                break;
            case R.id.registration:
                Toast.makeText(MainActivity.this, "to activity registration", Toast.LENGTH_LONG).show();
                break;
            case R.id.info:
                Toast.makeText(MainActivity.this, "to activity info", Toast.LENGTH_LONG).show();
                break;
            case R.id.help:
                Toast.makeText(MainActivity.this, "to activity help", Toast.LENGTH_LONG).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}