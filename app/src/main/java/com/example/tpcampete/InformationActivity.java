package com.example.tpcampete;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class InformationActivity extends AppCompatActivity {
    private Intent returnIntent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);
    }

    // ajouter top menu
    @Override
    public boolean onCreateOptionsMenu(@NonNull Menu menu) {
        getMenuInflater().inflate(R.menu.information, menu);
        return super.onCreateOptionsMenu(menu);
    }
    // action les option top menu
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int option = item.getItemId();
        switch (option){
            case R.id.retour:
//                returnIntent = new Intent(InformationActivity.this, MainActivity.class);
//                startActivity(returnIntent);
                onFloatRetour(null);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    public void onFloatRetour(View view) {
        returnIntent = new Intent(InformationActivity.this, MainActivity.class);
        startActivity(returnIntent);
        Toast.makeText(InformationActivity.this, "to retour activity main", Toast.LENGTH_LONG).show();
    }
}