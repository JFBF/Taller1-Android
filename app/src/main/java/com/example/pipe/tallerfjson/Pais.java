package com.example.pipe.tallerfjson;

/**
 * Created by sala-bd on 15/08/2017.
 */

public class Pais {
    private String capital;
    private String nombrePais;
    private String nombrePaisInt;
    private String sigla;

    public Pais() {
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getNombrePais() {
        return nombrePais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    public String getNombrePaisInt() {
        return nombrePaisInt;
    }

    public void setNombrePaisInt(String nombrePaisInt) {
        this.nombrePaisInt = nombrePaisInt;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    @Override
    public String toString() {
        return "Pais{" +
                "Capital = '" + capital + '\'' +
                ", Nombre del País = '" + nombrePais + '\'' +
                ", Nombre del Pais Internacional= '" + nombrePaisInt + '\'' +
                ", Sigla = '" + sigla + '\'' +
                '}';
    }
}

