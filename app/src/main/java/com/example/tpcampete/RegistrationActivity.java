package com.example.tpcampete;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.tpcampete.entity.Registration;

public class RegistrationActivity extends AppCompatActivity {

    private Intent returnIntent;
    private RadioGroup radioGroup;
    private RadioButton radioButtonMiniTiger, radioButtonScience, radioButtonArtist,
            radioButtonFarmer, radioButtonDanse, radioButtonCircus,
            radioButtonComic, radioButtonMusic, radioButtonSport;
    private EditText editTextParentName, editTextParentTel, editTextParentEmail,
            editTextChildName, editTextChildAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        setWidgets();
    }

    private void setWidgets() {
        editTextParentName = findViewById(R.id.editTextTextParentName);
        editTextParentTel = findViewById(R.id.editTextTextParentTel);
        editTextParentEmail = findViewById(R.id.editTextTextParentEmail);
        editTextChildName = findViewById(R.id.editTextTextChildName);
        editTextChildAge = findViewById(R.id.editTextTextChildAge);

        radioGroup = findViewById(R.id.radioGroup);
        radioButtonMiniTiger = findViewById(R.id.radioButtonMiniTiger);
        radioButtonScience = findViewById(R.id.radioButtonScience);
        radioButtonArtist = findViewById(R.id.radioButtonArtist);
        radioButtonFarmer = findViewById(R.id.radioButtonFarmer);
        radioButtonDanse = findViewById(R.id.radioButtonDanse);
        radioButtonCircus = findViewById(R.id.radioButtonCircus);
        radioButtonComic = findViewById(R.id.radioButtonComic);
        radioButtonMusic = findViewById(R.id.radioButtonMusic);
        radioButtonSport = findViewById(R.id.radioButtonSport);
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
        switch (option) {
            case R.id.ajouter:
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
        // create VO and send to server
        Registration registration = new Registration();
        registration.setParentName(editTextParentName.getText().toString());
        registration.setParentTel(editTextParentTel.getText().toString());
        registration.setParentEmail(editTextParentEmail.getText().toString());
        registration.setChildName(editTextChildName.getText().toString());
        registration.setChildAge(editTextChildAge.getText().toString());
        registration.setProgramId(radioGroup.getCheckedRadioButtonId());
        // send registration to server
        sendRegistration(registration);
    }

    // method sendRegistration
    private void sendRegistration(Registration registration) {
        // todo: send to server

        // clean input data
        editTextParentName.setText("");
        editTextParentTel.setText("");
        editTextParentEmail.setText("");
        editTextChildName.setText("");
        editTextChildAge.setText("");
        radioGroup.clearCheck();

        Toast.makeText(RegistrationActivity.this, "Registration success: \n" + registration.toString(), Toast.LENGTH_SHORT).show();
    }
}