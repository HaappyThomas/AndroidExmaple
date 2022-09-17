package com.example.tpcampete;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
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

    // ajouter top menu
    public void onFloatRetour(){
        returnIntent = new Intent(ProgramActivity.this, MainActivity.class);
        startActivity(returnIntent);
    }

    // action pour les options du top menu
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int option = item.getItemId();
        switch (option){
            case R.id.minitigre:
                onMiniTigre(null);
                break;
            case R.id.science:
                onScience(null);
                break;
            case R.id.artist:
                onArtist(null);
                break;
            case R.id.fermier:
                onFarmer(null);
                break;
            case R.id.dance:
                onDanse(null);
                break;
            case R.id.artistCirque:
                onCircus(null);
                break;
            case R.id.comicStrip:
                onComic(null);
                break;
            case R.id.music:
                onMusic(null);
                break;
            case R.id.sport:
                onSport(null);
                break;
            case R.id.retour:
                onFloatRetour(null);
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + option);
        }
        return super.onOptionsItemSelected(item);
    }

    // action image button
    public void onMiniTigre(View view) {
        Intent minitigreIntent = new Intent(ProgramActivity.this, DescriptionProgramActivity.class);
        minitigreIntent.putExtra("program", "miniTigre");
        startActivity(minitigreIntent);

        Toast.makeText(ProgramActivity.this, "to miniTigres program", Toast.LENGTH_LONG).show();
    }

    public void onScience(View view) {
        Intent scienceIntent = new Intent(ProgramActivity.this, DescriptionProgramActivity.class);
        scienceIntent.putExtra("program", "science");
        startActivity(scienceIntent);

        Toast.makeText(ProgramActivity.this, "to science program", Toast.LENGTH_LONG).show();
    }

    public void onArtist(View view) {
        Intent artistIntent = new Intent(ProgramActivity.this, DescriptionProgramActivity.class);
        artistIntent.putExtra("program", "artist");
        startActivity(artistIntent);

        Toast.makeText(ProgramActivity.this, "to artist program", Toast.LENGTH_LONG).show();
    }

    public void onFarmer(View view) {
        Intent farmerIntent = new Intent(ProgramActivity.this, DescriptionProgramActivity.class);
        farmerIntent.putExtra("program", "farmer");
        startActivity(farmerIntent);

        Toast.makeText(ProgramActivity.this, "to fermier program", Toast.LENGTH_LONG).show();
    }

    public void onDanse(View view) {
        Intent danseIntent = new Intent(ProgramActivity.this, DescriptionProgramActivity.class);
        danseIntent.putExtra("program", "danse");
        startActivity(danseIntent);

        Toast.makeText(ProgramActivity.this, "to dance program", Toast.LENGTH_LONG).show();
    }

    public void onCircus(View view) {
        Intent circusIntent = new Intent(ProgramActivity.this, DescriptionProgramActivity.class);
        circusIntent.putExtra("program", "circus");
        startActivity(circusIntent);

        Toast.makeText(ProgramActivity.this, "to artistCirque program", Toast.LENGTH_LONG).show();
    }

    public void onComic(View view) {
        Intent comicIntent = new Intent(ProgramActivity.this, DescriptionProgramActivity.class);
        comicIntent.putExtra("program", "comic");
        startActivity(comicIntent);

        Toast.makeText(ProgramActivity.this, "to comicStrip program", Toast.LENGTH_LONG).show();
    }

    public void onMusic(View view) {
        Intent musicIntent= new Intent(ProgramActivity.this, DescriptionProgramActivity.class);
        musicIntent.putExtra("program", "music");
        startActivity(musicIntent);

        Toast.makeText(ProgramActivity.this, "to music program", Toast.LENGTH_LONG).show();
    }

    public void onSport(View view) {
        Intent sportIntent = new Intent(ProgramActivity.this, DescriptionProgramActivity.class);
        sportIntent.putExtra("program", "sport");
        startActivity(sportIntent);

        Toast.makeText(ProgramActivity.this, "to sport program", Toast.LENGTH_LONG).show();
    }

    public void onFloatRetour(View view) {
        Toast.makeText(ProgramActivity.this, "to retour activity main", Toast.LENGTH_LONG).show();
        returnIntent = new Intent(ProgramActivity.this, MainActivity.class);
        startActivity(returnIntent);
    }
}