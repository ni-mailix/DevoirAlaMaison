package com.example.devoiralamaison.modele;

import android.widget.ImageView;

//import com.example.devoiralamaison.vue.MainActivity;

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
/*
    public Integer getOperateur() {
        return new ;
    }*/
    public Float getValinyUtilisateur() {
        return valinyUtilisateur;
    }

    public Float getValinyTenaIzy() {
        return valinyTenaIzy;
    }

    public ImageView getImgValiny() {
        return imgValiny;
    }


    public Profil (Float isaVoalohany, Float isaFaharoa, Float valinyUtilisateur, Float valinyTenaIzy, Integer operateur)
    {
    this.isaVoalohany = isaVoalohany;
    this.isaFaharoa = isaFaharoa;
    this.operateur = 0;
    this.valinyUtilisateur = valinyUtilisateur;
    this.calculValinyTenaIzy();
    }

    private  void  calculValinyTenaIzy ()
    {
    if (operateur == 1){
        valinyTenaIzy = isaVoalohany + isaFaharoa;
    }else if (operateur == 2 ){
        valinyTenaIzy = isaVoalohany - isaFaharoa;
    }else if (operateur ==3){
        valinyTenaIzy = isaVoalohany * isaFaharoa;
    }else{
        /*
        if (isaFaharoa == 0){
            Toast.makeText(this, "Tsy mety ny division 0",Toast.LENGTH_SHORT ).show();
/*
            AlertDialog alertDialog = new Builder(this, "Division 0 tsy mety")
//set icon
                //    .setIcon(android.R.drawable.ic_dialog_alert)//set title
                    .setTitle("Division 0")//set message
                    .setMessage("Tsy mety ny division 0")
                    .show();


        } else {*/
            valinyTenaIzy = isaVoalohany / isaFaharoa;
       // }
    }
   // return valinyTenaIzy;
    }


}

