package com.magatte.transfertargent.transfert.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Utilisateur {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String login;
    private String pwd;
    private String nomConplet;
    private String email;
    private String photo;
    @ManyToOne
    @JoinColumn(name = "idPartenaire")
    private Partenaire partenaire;
    private String profil;

    @ManyToOne
    @JoinColumn(name = "idCompte", nullable = true)
    private Compte compte;

    @OneToMany(mappedBy = "userExpediteur")
    private List<Transaction> transactionsExpedition;

    @OneToMany(mappedBy = "userRememetteur")
    private List<Transaction> transactionsRemise;


    public Utilisateur() {
    }

    public Utilisateur(String login, String pwd, String nomConplet, String email, String photo, Partenaire partenaire, String profil, Compte compte, List<Transaction> transactionsExpedition, List<Transaction> transactionsRemise) {
        this.login = login;
        this.pwd = pwd;
        this.nomConplet = nomConplet;
        this.email = email;
        this.photo = photo;
        this.partenaire = partenaire;
        this.profil = profil;
        this.compte = compte;
        this.transactionsExpedition = transactionsExpedition;
        this.transactionsRemise = transactionsRemise;
    }



    public List<Transaction> getTransactionsExpedition() {
        return transactionsExpedition;
    }

    public void setTransactionsExpedition(List<Transaction> transactionsExpedition) {
        this.transactionsExpedition = transactionsExpedition;
    }

    public List<Transaction> getTransactionsRemise() {
        return transactionsRemise;
    }

    public void setTransactionsRemise(List<Transaction> transactionsRemise) {
        this.transactionsRemise = transactionsRemise;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getNomConplet() {
        return nomConplet;
    }

    public void setNomConplet(String nomConplet) {
        this.nomConplet = nomConplet;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Partenaire getPartenaire() {
        return partenaire;
    }

    public void setPartenaire(Partenaire partenaire) {
        this.partenaire = partenaire;
    }

    public String getProfil() {
        return profil;
    }

    public void setProfil(String profil) {
        this.profil = profil;
    }

    public Compte getCompte() {
        return compte;
    }

    public void setCompte(Compte compte) {
        this.compte = compte;
    }



}
