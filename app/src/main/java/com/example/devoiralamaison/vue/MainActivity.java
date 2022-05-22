package com.example.devoiralamaison.vue;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.devoiralamaison.R;
import com.example.devoiralamaison.controleur.Controle;
import com.example.devoiralamaison.modele.Profil;

import java.util.ArrayList;

//import android.content.DialogInterface;

public class MainActivity extends AppCompatActivity {


    private Controle controle;
    ListView lvOperateur;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Init();
        this.controle = Controle.getInstance();

    }

    //creation variable recevant les champs sur l'écran
    private EditText txtisaVoalohany;
    private EditText txtisaFaharoa;
    private EditText txtvalinyUtilisateur;
    private ImageView imgaddition = null;
    private ImageView imgsoustraction = null;
    private ImageView imgmultiplication = null;
    private ImageView imgdivision = null;
    private Integer operateur = 0;
    private ImageView imgValiny;

    private void Init() {
        txtisaVoalohany = findViewById(R.id.isaVoalohany);
        txtisaFaharoa = findViewById(R.id.isaFaharoa);
        //imgaddition = findViewById(R.id.imgAddition);
        //imgsoustraction = findViewById(R.id.imgSoustraction);
       // imgmultiplication = findViewById(R.id.imgMultiplication);
        //imgdivision = findViewById(R.id.imgDivision);
        txtvalinyUtilisateur = findViewById(R.id.valinyUtilisateur);
        imgValiny = (ImageView) findViewById(R.id.imgTsara);
        vOperateur();
        klikBtnValiny();

        lvOperateur = (ListView) findViewById(R.id.lvOperateur);
        ArrayList <String> arrayList = new ArrayList<>();


        arrayList.add("Addition");
        arrayList.add("Soustraction");
        arrayList.add("Multiplication");
        arrayList.add("Division");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayList);

        lvOperateur.setAdapter(arrayAdapter);

    }

    private void vOperateur(){

        lvOperateur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
            }
        });

        imgaddition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                imgsoustraction.setVisibility(View.INVISIBLE);
                imgmultiplication.setVisibility(View.INVISIBLE);
                imgdivision.setVisibility(View.INVISIBLE);

                operateur = 1;

            }
        });

        imgsoustraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                imgaddition.setVisibility(View.INVISIBLE);
                imgmultiplication.setVisibility(View.INVISIBLE);
                imgdivision.setVisibility(View.INVISIBLE);

                operateur= 2;

            }
        });

        imgmultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                imgaddition.setVisibility(View.INVISIBLE);
                imgsoustraction.setVisibility(View.INVISIBLE);
                imgdivision.setVisibility(View.INVISIBLE);

                operateur = 3;

            }
        });
        imgdivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                imgaddition.setVisibility(View.INVISIBLE);
                imgsoustraction.setVisibility(View.INVISIBLE);
                imgmultiplication.setVisibility(View.INVISIBLE);

                operateur = 4;

            }
        });
        //return operateur;
    }

    public Integer getoperateur() {
        return operateur;
    }




    //lier les valeurs créés avec le valeur en entrée graphique écran

  private void klikBtnValiny (){
/*
      if (isaFaharoa == 0){
          Toast.makeText(this, "Tsy mety ny division 0",Toast.LENGTH_SHORT ).show();
      }
       */


      findViewById(R.id.btValiny).setOnClickListener(new Button.OnClickListener() {
          @Override
          public void onClick(View view) {
              Float isaVoalohany = Float.valueOf(0);
              Float isaFaharoa = Float.valueOf(0);
              Integer operateur = getoperateur();
             // Integer operateur = 0;
              Float valinyUtilisateur = Float.valueOf(0);
              Float valinyTenaIzy = Controle.getInstance().getValinyTenaIzy();

            try {
                  isaVoalohany = Float.parseFloat(txtisaVoalohany.getText().toString());
                  isaFaharoa = Float.parseFloat(txtisaFaharoa.getText().toString());
                  valinyUtilisateur = Float.parseFloat(txtvalinyUtilisateur.getText().toString());
                  operateur = Integer.parseInt(operateur.toString());
                  valinyTenaIzy = Float.parseFloat(valinyTenaIzy.getClass().toString());
                } catch ( Exception e) {}

                 fampitahana(isaVoalohany, isaFaharoa,  valinyUtilisateur, valinyTenaIzy, operateur);
                  }

      });

}

private void fampitahana(Float isaVoalohany,  Float isaFaharoa,  Float valinyUtilisateur, Float valinyTenaIzy, Integer operateur){
    this.controle.creerProfil(isaVoalohany,  isaFaharoa,  valinyUtilisateur, valinyTenaIzy, operateur);

    float valinyTenaizysystem = this.controle.getValinyTenaIzy();

    System.out.println("1");
    System.out.println("operateur:" + operateur);
    System.out.println("valiny tena izy:" + valinyTenaizysystem);
    System.out.println("valiny utilisateur:" + valinyUtilisateur);
    if (valinyTenaizysystem == valinyUtilisateur)
    {
        System.out.println("marina");
        imgValiny.setImageResource(R.drawable.ratsy);
    } else {
        System.out.println("diso");
        imgValiny.setImageResource(R.drawable.tsara);
        }
    }


}