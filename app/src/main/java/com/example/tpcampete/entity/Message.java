package com.example.tpcampete.entity;

public class Message {
    private String nom, email, message;

    public Message() {
    }

    public Message(String nom, String email, String message) {
        this.nom = nom;
        this.email = email;
        this.message = message;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Message{" +
                "nom='" + nom + '\'' +
                ", email='" + email + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
