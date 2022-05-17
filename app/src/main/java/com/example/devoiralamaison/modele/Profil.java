package com.example.devoiralamaison.modele;

import android.content.Context;
import android.widget.ImageView;
import android.widget.Toast;
import com.example.devoiralamaison.R;

import com.example.devoiralamaison.vue.MainActivity;

public class Profil {

    // variable résultat système pour comparaison
    private Float valinyTenaIzy;

    // variable résultat utilisateur pour comparaison
    private Float valinyUtilisateur;

    // definition variable en entrée
    private Float isaVoalohany;
    private Float isaFaharoa;
    private Integer operateur;
    private ImageView imgSmiley;


    public Profil(Float isaVoalohany, Integer operateur, Float faharoa, Float isaFaharoa, Float valinyUtilisateur){
        this.isaVoalohany = isaVoalohany;
        this.operateur = operateur;
        this.isaFaharoa = isaFaharoa;
        this.valinyUtilisateur = valinyUtilisateur;
        this.calculValinyTenaIzy();
        this.Fampitahana();

    }

    //creation getter valeur variable
    public Float getIsaVoalohany(){return isaVoalohany;}
    public Float getIsaFaharoa(){return isaFaharoa;}
    public Integer getOperateur(){return operateur;}
    public Float getValinyUtilisateur(){return valinyUtilisateur;}
    public Float getValinyTenaIzy(){return valinyTenaIzy;}
    public ImageView getImgSmiley() { return imgSmiley;}

    private void calculValinyTenaIzy()
    {
        Context context = getActivity().getApplicationContext();

        if (operateur==1){
            this.valinyTenaIzy = isaVoalohany + isaFaharoa;
        }else if (operateur == 2) {
            this.valinyTenaIzy = isaVoalohany - isaFaharoa;
        }else if (operateur == 3) {
            this.valinyTenaIzy = isaVoalohany * isaFaharoa;
        }else {
            if (isaFaharoa == 0){
                Toast.makeText(context,"Tsy mety ny division 0", Toast.LENGTH_LONG).show();
            }else{
                this.valinyTenaIzy = isaVoalohany / isaFaharoa;
            }
        }
    }

    private Context getActivity() {
        return null;
    }

    public void Fampitahana(Float valinyTenaIzy, Float valinyUtilisateur){

        if (valinyTenaIzy == valinyUtilisateur){
            imgSmiley.setImageResource((R.drawable.tsara));
        }else{
            imgSmiley.setImageResource((R.drawable.tsara));
        }
    }

}
