package com.magatte.transfertargent.transfert.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String numPiece;
    private String nom;
    private String tel;

    @OneToMany(mappedBy = "expediteur")
    private List<Transaction> transactionsExpeditions;

    @OneToMany(mappedBy = "destinataire")
    private List<Transaction> transactionsReception;

    public Client() {
    }

    public Client(String numPiece, String nom, String tel, List<Transaction> transactionsExpeditions, List<Transaction> transactionsReception) {
        this.numPiece = numPiece;
        this.nom = nom;
        this.tel = tel;
        this.transactionsExpeditions = transactionsExpeditions;
        this.transactionsReception = transactionsReception;
    }



    public List<Transaction> getTransactionsExpeditions() {
        return transactionsExpeditions;
    }

    public void setTransactionsExpeditions(List<Transaction> transactionsExpeditions) {
        this.transactionsExpeditions = transactionsExpeditions;
    }

    public List<Transaction> getTransactionsReception() {
        return transactionsReception;
    }

    public void setTransactionsReception(List<Transaction> transactionsReception) {
        this.transactionsReception = transactionsReception;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumPiece() {
        return numPiece;
    }

    public void setNumPiece(String numPiece) {
        this.numPiece = numPiece;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}
