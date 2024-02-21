package it.epicode.composite;

import java.util.List;

public class Libro implements InterfacePagina{
    private List<Sezione> sezioni;
    private List<String> autori;


    @Override
    public void stampaPagina() {

    }
}
