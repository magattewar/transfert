package com.magatte.transfertargent.transfert.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Compte {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String numero;
    private float solde;

    @OneToOne
    @JoinColumn(name = "compte")
    private Utilisateur utilisateur;

    @ManyToOne
    @JoinColumn(name = "comptes")
    private Utilisateur partenaire;

    @OneToMany(mappedBy = "compte")
    private List<Versement> versements;

    public Compte() {
    }

    public Compte(String numero, float solde, Utilisateur utilisateur, Utilisateur partenaire, List<Versement> versements) {
        this.numero = numero;
        this.solde = solde;
        this.utilisateur = utilisateur;
        this.partenaire = partenaire;
        this.versements = versements;
    }



    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public Utilisateur getPartenaire() {
        return partenaire;
    }

    public void setPartenaire(Utilisateur partenaire) {
        this.partenaire = partenaire;
    }

    public List<Versement> getVersements() {
        return versements;
    }

    public void setVersements(List<Versement> versements) {
        this.versements = versements;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }


    public void setNumero(String numero) {
        this.numero = numero;
    }

    public float getSolde() {
        return solde;
    }

    public void setSolde(float solde) {
        this.solde = solde;
    }


}
