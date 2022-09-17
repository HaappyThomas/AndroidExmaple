package com.example.tpcampete;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class DescriptionProgramActivity extends AppCompatActivity {
    private Intent intent;
    private TextView textViewProgram, textViewDescriptionProgram;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description_program);
        setWidgets();
    }

    private void setWidgets() {
        textViewProgram = findViewById(R.id.textViewProgram);
        textViewDescriptionProgram = findViewById(R.id.textViewDescriptionProgram);
        String program = getIntent().getStringExtra("program");
        if(program != null){
            textViewProgram.setText(program);

            String descriptionProgram = "";
            // todo: lecture description program
            textViewDescriptionProgram.setText(descriptionProgram);
        }else {
            textViewProgram.setText("Program");
            textViewDescriptionProgram.setText("Program description:\n");
        }
    }

    // ajouter top menu
    @Override
    public boolean onCreateOptionsMenu(@NonNull Menu menu) {
        getMenuInflater().inflate(R.menu.description_program, menu);
        return super.onCreateOptionsMenu(menu);
    }
    // action les option top menu
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int option = item.getItemId();
        switch (option){
            case R.id.retour:
                onReturn(null);
                break;
            case R.id.ajouter:
                onAjouter(null);
        }

        return super.onOptionsItemSelected(item);
    }

    // action float button Ajouter
    public void onAjouter(View view) {
       Intent descriptionIntent = new Intent(DescriptionProgramActivity.this, RegistrationActivity.class);
       descriptionIntent.putExtra("program", getIntent().getStringExtra("program"));
       startActivity(descriptionIntent);
    }

    // action float button Ajouter
    public void onReturn(View view) {
        startActivity(new Intent(DescriptionProgramActivity.this, ProgramActivity.class));
    }
}