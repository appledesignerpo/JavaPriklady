package ulohy;

public class Polia {
    public static void main(String[] args) {
        // Deklariacia pola s nazvom cars ktore obshauje  4 znacky
        String znackyAut[]  = {"Volvo", "BMW", "Ford", "Mazda"};

        // vypis 1 znacku
        System.out.println(znackyAut[0]);

        // vypis poseldnu
        System.out.println(znackyAut[3]);

        //zmena znacky 1 auta
        znackyAut[0] = "Opel";

        //a vypis tuto zmenu
        System.out.println(znackyAut[0]);

        // pocet vsetky znaciek aut a poli je
        System.out.println(znackyAut.length);

        //vypis vsetky znacky aut v poli
        System.out.println("Vypisete značky aut: ");
        System.out.println("---------------");

        // Pouzijeme cyklus s pevnym poctom opakovani a prikazu length, ktory zistuje dlzku pola
        for (int i = 0; i < znackyAut.length; i++) {
            System.out.println(znackyAut[i]);
            // mozeme v cykle vykonat aj viacero prikazov
        }

        System.out.println();
        //vypis vsetky znacky aut v poli cez foreach
        System.out.println("Vypisete značky aut cez foreach: ");
        System.out.println("---------------");
        for (String konkretnaZnacka:znackyAut){
            System.out.println(konkretnaZnacka);
    }

    }
}
