package oop.enkapsulacia;

import java.util.ArrayList;

public class ZoznamKnihSpravneEfektivneVypisanie {
    public static void main(String[] args) {

        KnihaSpravne kniha1 = new KnihaSpravne(); // objekt /instancia / s nazvom kniha1
        kniha1.setNazov("Jan");
        kniha1.setAutor("Nejaky");
        kniha1.setRokVydania(2000);
        kniha1.setCena(3.09);

        System.out.println("Vypiš detail  knihy:");
        System.out.println("----------------");
       /* System.out.println("Nazov knihy: " + kniha1.getNazov());
        System.out.println("Autor knihy: " + kniha1.getAutor());
        System.out.println("Cena knihy: " + kniha1.getCena());
        System.out.println("Rok vydania: " + kniha1.getRokVydania());*/
        System.out.println(kniha1);



        KnihaSpravne kniha2 = new KnihaSpravne(); // objekt /instancia / s nazvom kniha1
        kniha2.setNazov("Ja robot");
        kniha2.setAutor("Isaac Asimov");
        kniha2.setRokVydania(2000);
        kniha2.setCena(3.09);


        System.out.println("Vypiš detail  knihy 2 :");
        System.out.println("----------------");
      /*  System.out.println("Nazov knihy: " + kniha2.getNazov());
        System.out.println("Autor knihy: " + kniha2.getAutor());
        System.out.println("Cena knihy: " + kniha2.getCena());
        System.out.println("Rok vydania: " + kniha2.getRokVydania());*/
        System.out.println(kniha2);



        // knihy ulozime do array listu

        ArrayList<KnihaSpravne> knihy = new ArrayList<>();
        knihy.add(kniha1);
        knihy.add(kniha2);

        // vypise obsahu knih
        for (KnihaSpravne knihaObjekt:knihy){
            /*System.out.println(konkretnaKniha); // vypise nezrrozimitelny text*/
            System.out.println(); //prazny riadok
        /*    System.out.println("Nazov knihyN: " + konkretnaKniha.getNazov());
            System.out.println("AutorN: " + konkretnaKniha.getAutor());
            System.out.println("Cena knihyN: " + konkretnaKniha.getCena());
            System.out.println("Rok vydania knihyN: " + konkretnaKniha.getRokVydania());*/
            System.out.println(knihaObjekt);
            System.out.println(); //prazny riadok
        }

    }
}
