package com.example.tpcampete;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.example.tpcampete.entity.DbAdapter;
import com.example.tpcampete.entity.DescriptionProgram;

public class DescriptionProgramActivity extends AppCompatActivity {
    private Intent intent;
    private TextView textViewProgram, textViewDescriptionProgram;
    private DbAdapter dbAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description_program);
        // create adapter
        dbAdapter = new DbAdapter(DescriptionProgramActivity.this);
        // add widgets
        setWidgets();
        // add initial data into database description
        // just for the first time
        //  addInitialDataIntoDB();
    }


    private void setWidgets() {
        textViewProgram = findViewById(R.id.textViewProgram);
        textViewDescriptionProgram = findViewById(R.id.textViewDescriptionProgram);
        String program = getIntent().getStringExtra("program");
        if(program != null){
            textViewProgram.setText(program);

            StringBuilder descriptionProgram = new StringBuilder();
            // todo: lecture description program
            try{
                descriptionProgram.append(dbAdapter.selectinnerDescriptionProgram(program));
                descriptionProgram.append("\n");
            }catch(Exception e){
                e.getStackTrace();
                descriptionProgram.append("read program description error!");
            }
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

//    private void addInitialDataIntoDB() {
//        dbAdapter.ajouterDescriptionProgram(new DescriptionProgram("miniTigre",
//                "\n" +
//                "Bienvenue aux tout-petits dans l'univers incroyable des camps !\n" +
//                "\n" +
//                "Au camp de jour Grasset, pour leurs premières expériences, " +
//                        "les petits géants de 4-5 ans ont l'occasion de goûter à une foule d'activités, " +
//                        "de découvrir des mondes imaginaires dans la douce folie des thématiques, " +
//                        "de plonger dans les projets artistiques et scientifiques mais aussi de " +
//                        "se défouler dans toutes nos installations sportives."));
//        dbAdapter.ajouterDescriptionProgram(new DescriptionProgram("science","" +
//                "Mordus de chimie, amoureux de sciences naturelles, accros de mécanique, " +
//                "robotique ou informatique (8 à 12 ans), " +
//                "nos camps de sciences vous ouvrent les portes de nos fabuleux laboratoires " +
//                "tout équipés et vous invitent à chausser vos lunettes de protection pour vous " +
//                "livrer à des expériences qui décoiffent !\n" +
//                "\n" +
//                "Nos petits génies auront l'occasion de toucher à tout ce qui pique leur curiosité, " +
//                "de réaliser de nombreuses expériences étonnantes et de découvrir le pourquoi " +
//                "du comment de phénomènes scientifiques."));
//        dbAdapter.ajouterDescriptionProgram(new DescriptionProgram("artist",
//                "Couleurs, peintures, fusain, photo, modelage, artisanat, joaillerie, " +
//                        "sculpture, land art... la seule limite doit être ton imagination !!\n" +
//                        "\n" +
//                        "À tous nos artistes en herbe, ce camp d'arts plastiques fera découvrir " +
//                        "de nouvelles façons de s'exprimer et de \"toucher\" à de nouvelles matières."));
//        dbAdapter.ajouterDescriptionProgram(new DescriptionProgram("farmer",
//                "Tu es gourmand de nature et tu n’as peur de te salir les mains ? " +
//                        "Notre camp d’agriculture urbaine est fait pour toi!\n" +
//                        "\n" +
//                        "En sa qualité de CEGEP Vert, le collège André-Grasset poursuit son expansion " +
//                        "sur la voie de l'agriculture urbaine et propose maintenant aux campeurs de devenir " +
//                        "de jeunes Fermiers Urbains en profitant de notre potager, de nos ruches, de nos serres.\n" +
//                        "\n" +
//                        "Pendant cette semaine au grand air, tu découvriras à travers tes cinq sens les " +
//                        "différentes étapes pour produire tes aliments, du jardin à l’assiette!"));
//        dbAdapter.ajouterDescriptionProgram(new DescriptionProgram("danse",
//                "Quand la musique s'empare de toi, tu ne peux t'empêcher de bouger et faire " +
//                        "un \"show\" dans ta chambre ? Ta place est parmi nos jeunes danseurs sur scène " +
//                        "le vendredi car il y a fort à parier que parents et enfants ont hâte de te voir danser ! " +
//                        "Viens monter une chorégraphie avec tes amis et notre spécialiste de la danse " +
//                        "qui va te faire découvrir toutes sortes de styles et mouvements " +
//                        "et le tout dans une super ambiance."));
//        dbAdapter.ajouterDescriptionProgram(new DescriptionProgram("circus",
//                "\n" +
//                        "Tu as l'âme d'un clown ? La souplesse d'un acrobate ? la dextérité d'un jongleur ? " +
//                        "Ou le monde du cirque te fait simplement rêver ?\n" +
//                        "\n" +
//                        "Une place dans notre camp de cirque t'attend ! Nous t'aiderons à développer le domaine " +
//                        "que tu préfères pour monter un numéro de spectacle inoubliable, et tu pourras également " +
//                        "en essayer d'autres."));
//        dbAdapter.ajouterDescriptionProgram(new DescriptionProgram("comic",
//                "Une vraie boîte à \"trucs\" pour mieux comprendre comment une bande dessinée se construit !\n" +
//                        "\n" +
//                        "Des premiers pas pour créer vos personnages, jusqu'à écrire une petite histoire " +
//                        "et la mettre en scène en passant par les techniques de dessins, mais aussi de narration visuelle.\n" +
//                        "\n" +
//                        "Enfin pour ceux qui préfèrent les pièces uniques, une initiation à l'illustration telle qu'on " +
//                        "peut la voir dans la publicité ou les journaux."));
//        dbAdapter.ajouterDescriptionProgram(new DescriptionProgram("music",
//                "Pour toi qui aimes chanter en solo ou en groupe, qui rêves de prendre part à un concours de chant, " +
//                        "à apprendre la technique derrière la performance, mais aussi de toucher à plusieurs instruments et " +
//                        "d'améliorer ton rythme, ce camp te permettra de t'attaquer au répertoire de tes artistes préférés.\n" +
//                        "\n" +
//                        "C'est aussi chaque semaine l'occasion de briller sous les feux de la rampe en montant sur scène " +
//                        "durant notre spectacle du vendredi devant les parents et les autres enfants !"));
//        dbAdapter.ajouterDescriptionProgram(new DescriptionProgram("sport",
//                "Avec notre nouveau complexe sportif qui n'attend plus que vous, c'est le retour du MaxiSports!!\n" +
//                        "\n" +
//                        "Si tu as envie de te défouler et t'attaquer à des activités plus rares, nous te proposons de plonger " +
//                        "avec nous dans une foule de sports originaux tels que le Flag, le Tchoukball, le soccer de plage, " +
//                        "le Kinball et beaucoup d'autres sports d'équipe ou individuels ! Ce programme te permettra de profiter " +
//                        "pleinement de nos immenses espaces de jeu, à savoir notre terrain de football, nos deux terrains de soccer, " +
//                        "notre terrain de soccer et volley-ball de plage, nos gymnases etc...\n" +
//                        "\n" +
//                        "Apporte ta crème solaire et enfile tes shorts, il va faire chaud en MaxiSports !"));
//    }
}