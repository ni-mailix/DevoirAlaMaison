package com.example.devoiralamaison.vue;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.devoiralamaison.R;
import com.example.devoiralamaison.controleur.Controle;
import com.example.devoiralamaison.modele.Profil;

//import android.content.DialogInterface;

public class MainActivity extends AppCompatActivity {


    private Controle controle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Init();
        this.controle = Controle.getInstance();

    }

    //creation variable recevant les champs sur l'écran
    private EditText isaVoalohany;
    private EditText isaFaharoa;
    private EditText valinyUtilisateur;
    private Float valinyTenaIzy;
    private ImageView addition = null;
    private ImageView soustraction = null;
    private ImageView multiplication = null;
    private ImageView division = null;
    private Integer operateur = 0;
    private ImageView imgValiny;

    private void Init() {
        isaVoalohany = findViewById(R.id.isaVoalohany);
        isaFaharoa = findViewById(R.id.isaFaharoa);
        addition = findViewById(R.id.imgAddition);
        soustraction = findViewById(R.id.imgSoustraction);
        multiplication = findViewById(R.id.imgMultiplication);
        division = findViewById(R.id.imgDivision);
        valinyUtilisateur = findViewById(R.id.valinyUtilisateur);
        klikBtnValiny();
        vOperateur();
    }

    private Integer vOperateur(){
        addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                soustraction.setVisibility(View.INVISIBLE);
                multiplication.setVisibility(View.INVISIBLE);
                division.setVisibility(View.INVISIBLE);

                operateur = 1;

            }
        });

        soustraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                addition.setVisibility(View.INVISIBLE);
                multiplication.setVisibility(View.INVISIBLE);
                division.setVisibility(View.INVISIBLE);

                operateur= 2;

            }
        });

        multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                addition.setVisibility(View.INVISIBLE);
                soustraction.setVisibility(View.INVISIBLE);
                division.setVisibility(View.INVISIBLE);

                operateur = 3;

            }
        });
        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                addition.setVisibility(View.INVISIBLE);
                soustraction.setVisibility(View.INVISIBLE);
                multiplication.setVisibility(View.INVISIBLE);

                operateur = 4;

            }
        });
        return operateur;
    }




    //lier les valeurs créés avec le valeur en entrée graphique écran

  private void klikBtnValiny (){
      findViewById(R.id.btValiny).setOnClickListener(new Button.OnClickListener() {
          @Override
          public void onClick(View view) {
              Float isaVoalohany = Float.valueOf(0);
              Float isaFaharoa = Float.valueOf(0);
              Integer operateur = vOperateur();
              Float valinyUtilisateur = Float.valueOf(0);
              Float valinyTenaIzy = Float.valueOf(0);

            try {
                  isaVoalohany = Float.parseFloat(isaVoalohany.getClass().toString());
                  isaFaharoa = Float.parseFloat(isaFaharoa.getClass().toString());
                  operateur = Integer.parseInt(operateur.toString());
                } catch ( Exception e) {}

                 fampitahana(isaVoalohany, isaFaharoa, operateur,valinyTenaIzy, valinyUtilisateur);



                  if (valinyTenaIzy == valinyUtilisateur)
                  {
                      imgValiny.setImageResource(R.drawable.tsara);
                  } else {
                      imgValiny.setImageResource(R.drawable.ratsy);
                  }





                  }
  });

}

private void fampitahana(Float isaVoalohany,  Float isaFaharoa, Integer operateur, Float valinyTenaIzy, Float valinyUtilisateur){
    this.controle.creerProfil(isaVoalohany,  isaFaharoa, operateur, valinyTenaIzy, valinyUtilisateur);
    }

}