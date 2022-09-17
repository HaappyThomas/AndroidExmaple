package com.example.tpcampete;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class HelpActivity extends AppCompatActivity {
    private Intent returnIntent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
    }

    // ajouter top menu
    @Override
    public boolean onCreateOptionsMenu(@NonNull Menu menu) {
        getMenuInflater().inflate(R.menu.help, menu);
        return super.onCreateOptionsMenu(menu);
    }

    // action pour les options du top menu
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int option = item.getItemId();
        switch (option){
            case R.id.envoyer:
                onEnoyer(null);
                break;
            case R.id.retour:
//                returnIntent = new Intent(HelpActivity.this, MainActivity.class);
//                startActivity(returnIntent);
                onFloatRetour(null);
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + option);
        }
        return super.onOptionsItemSelected(item);
    }


    // action float buttion retour
    public void onFloatRetour(View view) {
        returnIntent = new Intent(HelpActivity.this, MainActivity.class);
        startActivity(returnIntent);
        Toast.makeText(HelpActivity.this, "to retour activity main", Toast.LENGTH_SHORT).show();
    }

    // action float buttion envoyer
    public void onEnoyer(View view) {
        // todo: validation input data
        // todo: envoyer email
        Toast.makeText(HelpActivity.this, "Message est envoyé", Toast.LENGTH_SHORT).show();
    }
}