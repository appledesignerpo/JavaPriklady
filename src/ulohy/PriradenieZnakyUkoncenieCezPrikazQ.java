package ulohy;

import java.util.Scanner;

import static java.lang.Character.isLetter;

public class PriradenieZnakyUkoncenieCezPrikazQ {
    public static void main(String[] args) {
        while(true){//Nekonecny cyklus
            Scanner skener = new Scanner(System.in);
            System.out.println("zadaj pocet bodov");
            String pocetBodov = skener.nextLine(); // nextline pre akolvke string cze cislo alebo text v tomto pripade berie ako text

            //akym sposobom ukoncime whlie hint: vpisany pismenom q
            if (pocetBodov.equals("q"))   break;

            int  pocetBodovAkoInt = Integer.parseInt(pocetBodov);
            if(pocetBodovAkoInt > 90) System.out.println("tvoja znamka je A");
            else if(pocetBodovAkoInt  > 75) System.out.println("tvoja znamka je B");
            else if(pocetBodovAkoInt  > 65) System.out.println("tvoja znamka je C");
            else System.out.println("Neviem priraddit znamku k danemu poctu bodov");

        }
    }
}
