package it.epicode.adapter;

import java.time.LocalDate;

public class Info {
    private String name;
    private  String cognome;
    private LocalDate dataDiNascita;

    public Info(String name, String cognome, LocalDate dataDiNascita) {
        this.name = name;
        this.cognome = cognome;
        this.dataDiNascita = dataDiNascita;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public LocalDate getDataDiNascita() {
        return dataDiNascita;
    }

    public void setDataDiNascita(LocalDate dataDiNascita) {
        this.dataDiNascita = dataDiNascita;
    }
}
