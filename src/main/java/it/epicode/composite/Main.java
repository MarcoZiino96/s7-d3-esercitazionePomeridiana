package it.epicode.composite;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pagina page= new Pagina();
        page.setContenuto("ciao ecc..");
        page.stampaPagina();
        Pagina page1= new Pagina();
        page1.setContenuto("hello ecc..");
        page1.stampaPagina();
        Pagina page2= new Pagina();
        page2.setContenuto("halo ecc..");
        page2.stampaPagina();

        Pagina page3= new Pagina();
        page3.setContenuto("ciao ecc..");
        page3.stampaPagina();
        Pagina page4= new Pagina();
        page4.setContenuto("hello ecc..");
        page4.stampaPagina();
        Pagina page5= new Pagina();
        page5.setContenuto("halo ecc..");
        page5.stampaPagina();

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");

        Sezione sottosezione = new Sezione(List.of(page1,page2,page3));
        Sezione sottosezione1 = new Sezione(List.of(page4,page5));

        Sezione sezione = new Sezione(List.of(page,page1,page2,sottosezione,sottosezione1));
        Sezione sezione1 = new Sezione(List.of(page3,page4,page5));

        System.out.println(sezione);
        System.out.println(sezione.getNumeroPagine());

        System.out.println(sezione1);
        System.out.println(sezione1.getNumeroPagine());


        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");

        Libro libro= new Libro(List.of(sezione,sezione1), List.of("marco","emanuele"), 25);
        System.out.println(libro);
        System.out.println(libro.getNumeroPagine());
    }
}
