package it.epicode.composite;

public class Pagina implements InterfacePagina {
    private InterfacePagina pagina;
    @Override
    public void stampaPagina() {
        System.out.println(pagina);
    }

    @Override
    public String toString() {
        return "Pagina{" +
                "pagina=" + pagina +
                '}';
    }
}
