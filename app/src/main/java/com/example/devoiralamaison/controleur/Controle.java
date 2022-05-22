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


    public void creerProfil (Float isaVoalohany,Float isaFaharoa,  Float valinyUtilisateur, Float valinyTenaIzy, Integer operateur){
        profil = new Profil (isaVoalohany, isaFaharoa, valinyUtilisateur, valinyTenaIzy, operateur);
    }

    public float getValinyTenaIzy() {
        return profil.getValinyTenaIzy();
    }

}
