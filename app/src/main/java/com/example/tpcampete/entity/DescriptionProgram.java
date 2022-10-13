package com.example.tpcampete.entity;

public class DescriptionProgram {
    private Integer idProgram;
    private String nomProgram;
    private String descriptionProgram;


    public DescriptionProgram() {
    }

    public DescriptionProgram(String nomProgram, String descriptionProgram) {
        this.nomProgram = nomProgram;
        this.descriptionProgram = descriptionProgram;
    }

    public String getNomProgram() {
        return nomProgram;
    }

    public void setNomProgram(String nomProgram) {
        this.nomProgram = nomProgram;
    }

    public String getDescriptionProgram() {
        return descriptionProgram;
    }

    public void setDescriptionProgram(String descriptionProgram) {
        this.descriptionProgram = descriptionProgram;
    }

    public Integer getIdProgram() {
        return idProgram;
    }

    @Override
    public String toString() {
        return "DescriptionProgram{" +
                "nomProgram='" + nomProgram + '\'' +
                ", descriptionProgram='" + descriptionProgram + '\'' +
                '}';
    }
}
