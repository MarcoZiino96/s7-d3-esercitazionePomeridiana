package it.epicode.composite;
import java.util.List;


public class Sezione implements ComponentLibro {

    private List<ComponentLibro> pagine;
    private int numeroPagine;

    public List<ComponentLibro> getPagine() {
        return pagine;
    }

    public void setPagine(List<ComponentLibro> pagine) {
        this.pagine = pagine;
    }

    public Sezione(List<ComponentLibro> pagine) {
        this.pagine = pagine;
        this.numeroPagine = this.pagine.size();
    }

    @Override
    public void stampaPagina() {
        System.out.println(pagine.size());
    }

    public int getNumeroPagine() {
        return numeroPagine;
    }

    @Override
    public String toString() {
        return "Sezione{"+
                "pagine=" + pagine +
                ", numeroPagine=" + numeroPagine +
                '}';
    }

    public void setNumeroPagine(int numeroPagine) {
        this.numeroPagine = numeroPagine;
    }
}
