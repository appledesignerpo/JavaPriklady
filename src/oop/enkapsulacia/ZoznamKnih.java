package oop.enkapsulacia;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ZoznamKnih {
    public static void main(String[] args) {
        //vytvorenie 1 knihy
        Kniha kniha1 = new Kniha(); // objekt /instancia / s nazvom 1
        kniha1.nazov = "Java";
        kniha1.autor = "Java Zidek";
        kniha1.cena = 2.30;
        kniha1.rokVydania = 1999;

        // Ako vypisovat obsah kniha1
        System.out.println("Názov knihy: " + kniha1.nazov);
        System.out.println("Autor knihy: " + kniha1.autor);
        System.out.println("Cena knihy: " + kniha1.cena);
        System.out.println("Rok vydania: " + kniha1.rokVydania);

        System.out.println(); //prazny riadok

        //vytvorenie 2 knihy
        Kniha kniha2 = new Kniha(); // objekt /instancia / s nazvom 1
        kniha2.nazov = "Ja robot";
        kniha2.autor = "Isaac Asimov";
       /* kniha2.cena = 2.30;
        kniha2.rokVydania = 1999;*/

        // Ako vypisovat obsah kniha2
        System.out.println("Názov knihy: " + kniha2.nazov);
        System.out.println("Autor knihy: " + kniha2.autor);
       /* System.out.println("Cena knihy: " + kniha1.cena);*/

        // knihy ulozime do array listu

        ArrayList<Kniha> knihy = new ArrayList<>();
        knihy.add(kniha1);
        knihy.add(kniha2);

        // vypsi obsah
        for (Kniha konkretnaKniha:knihy){
            /*System.out.println(konkretnaKniha); // vypise nezrrozimitelne*/
            System.out.println(); //prazny riadok
            System.out.println("Nazov knihy: " + konkretnaKniha.nazov);
            System.out.println("Autor: " + konkretnaKniha.autor);
            System.out.println("Cena knihy: " + konkretnaKniha.cena);
            System.out.println("Rok vydania knihy: " + konkretnaKniha.rokVydania);
            System.out.println(); //prazny riadok
        }


        //vypisanie
        System.out.println(knihy);
}
}
