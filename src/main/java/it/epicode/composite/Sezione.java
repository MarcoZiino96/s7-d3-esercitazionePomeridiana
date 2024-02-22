package it.epicode.composite;
import java.util.List;


public class Sezione implements ComponentLibro {

    private List<ComponentLibro> componenti;


    public Sezione(List<ComponentLibro> componenti) {
        this.componenti = componenti;
    }

    @Override
    public int getNumeroPagine() {
       return componenti.stream().mapToInt(ComponentLibro::getNumeroPagine).sum();
    }
}
