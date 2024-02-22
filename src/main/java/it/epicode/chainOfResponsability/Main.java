package it.epicode.chainOfResponsability;

public class Main {
    public static void main(String[] args) {
        Tenente tenente = new Tenente("Tenente", 1500);
        Capitano capitano = new Capitano("Capitano", 2000);
        Maggiore maggiore = new Maggiore("Maggiore", 3000);
        Colonello colonello = new Colonello("Colonello", 4000);
        Generale generale = new Generale("Generale",5000);

        tenente.setResponsabile(capitano);
        capitano.setResponsabile(maggiore);
        maggiore.setResponsabile(colonello);
        colonello.setResponsabile(generale);
       capitano.confrontaStipendi(1900);
    }
}
