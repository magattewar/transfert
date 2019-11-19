package com.magatte.transfertargent.transfert.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Versement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Date date;
    private double montant;

    @ManyToOne
    @JoinColumn(name = "idCompte" , nullable = false)
    private Compte compte;

    @ManyToOne
    @JoinColumn(name = "idUtilisateur" , nullable = false)
    private Compte utilisateur;

    public Versement() {
    }

    public Versement(Date date, double montant, Compte compte, Compte utilisateur) {
        this.date = date;
        this.montant = montant;
        this.compte = compte;
        this.utilisateur = utilisateur;
    }

    public Compte getCompte() {
        return compte;
    }

    public void setCompte(Compte compte) {
        this.compte = compte;
    }

    public Compte getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Compte utilisateur) {
        this.utilisateur = utilisateur;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

}
