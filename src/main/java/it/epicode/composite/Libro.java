package it.epicode.composite;

import java.util.List;

public class Libro implements ComponentLibro {
    private List<Sezione> sezioni;
    private List<String> autori;
    private int prezzo;

    @Override
    public String toString() {
        return "Libro{" +
                "sezioni=" + sezioni +
                ", autori=" + autori +
                ", prezzo=" + prezzo +
                '}';
    }

    public List<Sezione> getSezioni() {
        return sezioni;
    }

    public void setSezioni(List<Sezione> sezioni) {
        this.sezioni = sezioni;
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

    public Libro(List<Sezione> sezioni, List<String> autori, int prezzo) {
        this.sezioni = sezioni;
        this.autori = autori;
        this.prezzo = prezzo;
    }

    public void getNumeroPagine(){
        System.out.println(sezioni.stream().mapToInt(Sezione::getNumeroPagine).sum());
    }
    @Override
    public void stampaPagina() {
        sezioni.stream().map(Sezione::getPagine).forEach(System.out::println);
    }

}
