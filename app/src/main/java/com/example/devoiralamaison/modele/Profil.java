package com.example.devoiralamaison.modele;

import android.content.Context;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;

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

            AlertDialog alertDialog = new AlertDialog.Builder(this)
//set icon
                //    .setIcon(android.R.drawable.ic_dialog_alert)//set title
                    .setTitle("Are you sure to Exit")//set message
                    .setMessage("Exiting will call finish() method")
                    .show();


        } else {
            valinyTenaIzy = isaVoalohany / isaFaharoa;
        }
    }
    }



}

