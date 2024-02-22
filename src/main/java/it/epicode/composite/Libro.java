package it.epicode.composite;

import java.util.List;

public class Libro implements ComponentLibro {

    private List<ComponentLibro> componenti;
    private List<String> autori;
    private int prezzo;

    @Override
    public String toString() {
        return "Libro{" +
                "sezioni=" + componenti +
                ", autori=" + autori +
                ", prezzo=" + prezzo +
                '}';
    }


    public Libro(List<ComponentLibro> componenti, List<String> autori, int prezzo) {
        this.componenti = componenti;
        this.autori = autori;
        this.prezzo = prezzo;
    }

    public List<ComponentLibro> getComponenti() {
        return componenti;
    }

    public void setComponenti(List<ComponentLibro> componenti) {
        this.componenti = componenti;
    }

    public List<String> getAutori() {
        return autori;
    }

    public void setAutori(List<String> autori) {
        this.autori = autori;
    }

    public int getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(int prezzo) {
        this.prezzo = prezzo;
    }

    @Override
    public int getNumeroPagine() {
       return componenti.stream().mapToInt(ComponentLibro::getNumeroPagine).sum();
    }
}
