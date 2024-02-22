package it.epicode.composite;

public class Pagina implements ComponentLibro {
    private String contenuto;

    public void stampaPagina() {
        System.out.println(contenuto);
    }

    public String getContenuto() {
        return contenuto;
    }

    public void setContenuto(String contenuto) {
        this.contenuto = contenuto;
    }

    @Override
    public String toString() {
        return "Pagina{" +
                "pagina=" + contenuto +
                '}';
    }

    @Override
    public int getNumeroPagine() {
        return 1;
    }
}
