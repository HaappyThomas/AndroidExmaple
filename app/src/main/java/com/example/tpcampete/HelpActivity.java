package com.example.tpcampete;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.tpcampete.entity.Message;

public class HelpActivity extends AppCompatActivity {
    private Intent returnIntent;
    private EditText editTextNom, editTextEmail, editTextMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);

        setWidgets();
    }

    private void setWidgets() {
        editTextNom = findViewById(R.id.editTextPersonName);
        editTextEmail = findViewById(R.id.editTextPersonEmail);
        editTextMessage = findViewById(R.id.editTextMessage);
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
            case R.id.ajouter:
                onEnoyer(null);
                break;
            case R.id.retour:
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

        // create entity and send to server
        Message message = new Message();
        message.setNom(editTextNom.getText().toString());
        message.setEmail(editTextEmail.getText().toString());
        message.setMessage(editTextMessage.getText().toString());
        sendMessage(message);
    }

    private void sendMessage(Message message) {
        // todo: send to server

        // clean input data
        editTextNom.setText("");
        editTextEmail.setText("");
        editTextMessage.setText("");

        Toast.makeText(HelpActivity.this, "Message est envoyé:\n" + message.toString(), Toast.LENGTH_SHORT).show();
    }
}