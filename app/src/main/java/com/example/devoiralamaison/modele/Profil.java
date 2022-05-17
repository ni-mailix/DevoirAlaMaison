package com.example.devoiralamaison.modele;

import android.content.Context;
import android.widget.ImageView;
import android.widget.Toast;
import com.example.devoiralamaison.R;

import com.example.devoiralamaison.vue.MainActivity;

public class Profil {

    private Float isaVoalohany;
    private Float isaFaharoa;
    private Integer operateur;
    private Float valinyTenaIzy;
    private Float valinyUtilisateur;
    private ImageView imgValiny;

    public Float getIsaVoalohany() {
        return isaVoalohany;
    }

    public Float getIsaFaharoa() {
        return isaFaharoa;
    }

    public Integer getOperateur() {
        return operateur;
    }

    public Float getValinyUtilisateur() {
        return valinyUtilisateur;
    }

    public Float getValinyTenaIzy() {
        return valinyTenaIzy;
    }

    public ImageView getImgValiny() {
        return imgValiny;
    }


    public Profil (Float isaVoalohany, Float isaFaharoa, Integer operateur, Float valinyTenaIzy, Float valinyUtilisateur)
    {
    this.isaVoalohany = isaVoalohany;
    this.isaFaharoa = isaFaharoa;
    this.operateur = operateur;
    this.calculValinyTenaIzy();
    this.valinyUtilisateur = valinyUtilisateur;
    }

    private void calculValinyTenaIzy ()
    {
    if (operateur == 1){
        valinyTenaIzy = isaVoalohany + isaFaharoa;
    }else if (operateur == 2 ){
        valinyTenaIzy = isaVoalohany - isaFaharoa;
    }else if (operateur ==3){
        valinyTenaIzy = isaVoalohany * isaFaharoa;
    }else{
        if (isaFaharoa == 0){
            //Toast.makeText(this, "Tsy mety ny division 0",Toast.LENGTH_SHORT ).show();

        } else {
            valinyTenaIzy = isaVoalohany / isaFaharoa;
        }
    }
    }

    private void fampitahana(){
        Float valinyTenaIzy;
        Float valinyUtilisateur;

        if (this.valinyTenaIzy == this.valinyUtilisateur)
        {
            imgValiny.setImageResource(R.drawable.tsara);
        } else {
            imgValiny.setImageResource(R.drawable.ratsy);
        }
    }

}

