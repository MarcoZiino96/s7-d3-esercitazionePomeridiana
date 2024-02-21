package it.epicode.composite;
import java.util.List;


public class Sezione implements InterfacePagina {

    private List<InterfacePagina> pagine;
    private int numeroPagine;

    public List<InterfacePagina> getPagine() {
        return pagine;
    }

    public void setPagine(List<InterfacePagina> pagine) {
        this.pagine = pagine;
    }

    @Override
    public String toString() {
        return "Sezione{" +
                "pagine=" + pagine +
                ", numeroPagine=" + numeroPagine +
                '}';
    }

    public Sezione(List<InterfacePagina> pagine, int numeroPagine) {
        this.pagine = pagine;
        this.numeroPagine = pagine.size();
    }

    @Override
    public void stampaPagina() {
        System.out.println(pagine.size());
    }
}
