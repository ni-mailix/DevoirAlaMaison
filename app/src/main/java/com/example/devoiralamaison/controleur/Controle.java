package com.example.devoiralamaison.controleur;

import android.widget.ImageView;

import com.example.devoiralamaison.modele.Profil;

public class Controle {

    private static Controle instance = null;
    private Profil profil;

    private Controle (){super();}

    public static final Controle getInstance() {
        if (Controle.instance == null){
            Controle.instance = new Controle();
        }
        return Controle.instance;
    }


    public void creerProfil (Float isaVoalohany, Integer operateur, Float isaFaharoa, Float valinyUtilisateur, Float valinyTenaIzy){
        profil = new Profil (isaVoalohany, operateur, isaFaharoa, valinyUtilisateur, valinyTenaIzy);
    }

    public float getValinyTenaIzy (){
        return profil.getValinyTenaIzy();
    }

    public ImageView getFampitahana(){
        return profil.getImgSmiley();
    }

}
