package oop.enkapsulacia;

public class ZoznamKnihSpravne {
    public static void main(String[] args) {

        KnihaSpravne kniha1 = new KnihaSpravne(); // objekt /instancia / s nazvom kniha1
        kniha1.setNazov("Jan");
        kniha1.setAutor("Nejaky");
        kniha1.setRokVydania(2000);
        kniha1.setCena(3.09);

        System.out.println("Vypiš detail  knihy:");
        System.out.println("----------------");
        System.out.println("Nazov knihy: " + kniha1.getNazov());
        System.out.println("Autor knihy: " + kniha1.getAutor());
        System.out.println("Cena knihy: " + kniha1.getCena());
        System.out.println("Rok vydania: " + kniha1.getRokVydania());



        KnihaSpravne kniha2 = new KnihaSpravne(); // objekt /instancia / s nazvom kniha1
        kniha2.setNazov("Ja robot");
        kniha2.setAutor("Isaac Asimov");
        kniha2.setRokVydania(2000);
        kniha2.setCena(3.09);


        System.out.println("Vypiš detail  knihy 2 :");
        System.out.println("----------------");
        System.out.println("Nazov knihy: " + kniha2.getNazov());
        System.out.println("Autor knihy: " + kniha2.getAutor());
        System.out.println("Cena knihy: " + kniha2.getCena());
        System.out.println("Rok vydania: " + kniha2.getRokVydania());


    }
}
