package com.magatte.transfertargent.transfert.model;


import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Transaction {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Date date;
    private double montant;
    private String type;
    private String code;
    @ManyToOne
    @JoinColumn(name = "clientExpediteur")
    private Client expediteur;

    @Nullable
    @ManyToOne
    @JoinColumn(name = "clientRecepteur")
    private Client destinataire;
    private double comm;
    private double commExp;
    private double commDest;
    private double commSys;
    private double taxe;

    @ManyToOne
    @JoinColumn(name = "userExpediteur")
    private Utilisateur userExpediteur;
    @Nullable
    @ManyToOne
    @JoinColumn(name = "userRemetteur", nullable = true)
    private Utilisateur userRememetteur;


    public Transaction() {
    }

    public Transaction(Date date, double montant, String type, String code, Client expediteur, @Nullable Client destinataire, double comm, double commExp, double commDest, double commSys, double taxe, Utilisateur userExpediteur, @Nullable Utilisateur userRememetteur) {
        this.date = date;
        this.montant = montant;
        this.type = type;
        this.code = code;
        this.expediteur = expediteur;
        this.destinataire = destinataire;
        this.comm = comm;
        this.commExp = commExp;
        this.commDest = commDest;
        this.commSys = commSys;
        this.taxe = taxe;
        this.userExpediteur = userExpediteur;
        this.userRememetteur = userRememetteur;
    }



    public Utilisateur getUserExpediteur() {
        return userExpediteur;
    }

    public void setUserExpediteur(Utilisateur userExpediteur) {
        this.userExpediteur = userExpediteur;
    }

    @Nullable
    public Utilisateur getUserRememetteur() {
        return userRememetteur;
    }

    public void setUserRememetteur(@Nullable Utilisateur userRememetteur) {
        this.userRememetteur = userRememetteur;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Client getExpediteur() {
        return expediteur;
    }

    public void setExpediteur(Client expediteur) {
        this.expediteur = expediteur;
    }

    public Client getDestinataire() {
        return destinataire;
    }

    public void setDestinataire(Client destinataire) {
        this.destinataire = destinataire;
    }

    public double getComm() {
        return comm;
    }

    public void setComm(double comm) {
        this.comm = comm;
    }

    public double getCommExp() {
        return commExp;
    }

    public void setCommExp(double commExp) {
        this.commExp = commExp;
    }

    public double getCommDest() {
        return commDest;
    }

    public void setCommDest(double commDest) {
        this.commDest = commDest;
    }

    public double getCommSys() {
        return commSys;
    }

    public void setCommSys(double commSys) {
        this.commSys = commSys;
    }

    public double getTaxe() {
        return taxe;
    }

    public void setTaxe(double taxe) {
        this.taxe = taxe;
    }

}
