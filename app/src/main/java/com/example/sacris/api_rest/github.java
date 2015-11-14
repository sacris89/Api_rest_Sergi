package com.example.sacris.api_rest;

/**
 * Created by sacris on 11/11/2015.
 */
public class github {


    private String id;
    private String nom;

    public github(String id, String nom){

        this.id = id;
        this.nom = nom;



    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
