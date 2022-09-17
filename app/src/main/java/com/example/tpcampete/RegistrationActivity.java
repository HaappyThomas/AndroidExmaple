package com.example.tpcampete;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class RegistrationActivity extends AppCompatActivity {

    private Intent returnIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
    }

    // ajouter top menu
    @Override
    public boolean onCreateOptionsMenu(@NonNull Menu menu) {
        getMenuInflater().inflate(R.menu.registrattion, menu);
        return super.onCreateOptionsMenu(menu);
    }

    // action pour les options du top menu
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int option = item.getItemId();
        switch (option){
            case R.id.envoyer:
                onEnvoyer(null);
                Toast.makeText(RegistrationActivity.this, "to Message est envoyé", Toast.LENGTH_SHORT).show();
                break;
            case R.id.retour:
                onReturn(null);
                Toast.makeText(RegistrationActivity.this, "to retour activity main", Toast.LENGTH_SHORT).show();
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + option);
        }
        return super.onOptionsItemSelected(item);
    }

    // action float buttion retour
    public void onReturn(View view) {
        returnIntent = new Intent(RegistrationActivity.this, MainActivity.class);
        startActivity(returnIntent);
    }

    // action float buttion envoyer
    public void onEnvoyer(View view) {
        // todo: validation input data
        // todo: stoker les information dans SQLite local simulate inscription
        Toast.makeText(RegistrationActivity.this, "Registration success", Toast.LENGTH_SHORT).show();
    }
}