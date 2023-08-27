package ulohy;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Úloha 1: Program na priradenie známky
        Vytvorte prostredníctvom vstupu z konzoly rozhodovací test, ktorý vypíše známku A, B alebo C podľa týchto kritérií:
        Ak je percento nad 90, tak vypíše známku A
        Ak je percento nad 75, tak vypíše známku B
        Ak je percento nad 65, tak vypíše známku C
        Použite metódu pre rozhodovanie.

        Popis z pohladu pouzivatela: Program vyzve pouzivatela na ciselny vstup, t.j. pocet bodov, ktore po odobreni (stlaceni klavesy Enter) vyhodnoti a vypise zodpovedajucu znamku podla kriteria vyssie. Nasledne sa program ukonci.
        Program bude fungovat do "nekonecna" kym nazadame vstupnu hodnotu -1
*/
// TODO Doplnit "nekonecne" opakovanie programu, kym nezadame
public class PriradenieZnamky {
    public static void main(String[] args) {


      //  while(true) { // while reprezentuje cyklus s podmienkou na zaciatku while (true) je hack ktory vykonva cyklus donekonecna
          // for(;;) { nahradzá hack while(true)
        int pocetBodov = 0; // Inicializacia premennej pocetBodov na tomto mieste, aby sme ju mali platnu v celom rozsahu bloku
        Scanner skener = new Scanner(System.in); // Inicalizacia skeneru pre pouzivatelsky vstup z konzoly

       // while (pocetBodov >= 0){ // korektne programovanie vyzaduje zadanie spravnej podmeinkxy hnet na zaciatku
        while (pocetBodov != -1 && pocetBodov <= 100 ){
            System.out.println("Zadaj počet bodov:");


            try {
                pocetBodov = skener.nextInt(); // "Realny" vstup od pouzivatela
                if (pocetBodov > 90 ) System.out.println("Tvoja známka je A.");
                else if (pocetBodov > 75 && pocetBodov < 90 ) System.out.println("Tvoja známka je B.");
                else if (pocetBodov > 65 && pocetBodov < 75) System.out.println("Tvoja známka je C.");

                //  (vyraz1  || vyraz2) tzv pipe ALEBO /OR logicky vyraz
                //   (vyraz1 &&   vyraz2)   logicky vyraz A /AND
                //else if (pocetBodov == -1) System.exit(1);
                //else if (pocetBodov < 0) System.exit(1);
                //else if (pocetBodov == -1) break ; // korektna cesta  ako ukoncit cyklus prikazom break
                else System.out.println("Počtu bodov nezodpovedá žiadna známka.");
            } catch (InputMismatchException e) {
                System.out.println("Prepáč, zadal si nesprávny formát čísla, resp. typ údaju");
                //System.exit(1);
            }

        }
        skener.close();
    }
}
