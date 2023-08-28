package ulohy;

public class Polia {
    public static void main(String[] args) {
        // Deklariacia pola s nazvom cars ktore obshauje  4 znacky
        String cars[]  = {"Volvo", "BMW", "Ford", "Mazda"};
        // vypis 1 znacku
        System.out.println(cars[0]);
        // vypis poseldnu
        System.out.println(cars[3]);
        //zmena znacky 1 auta
        cars[0] = "Opel";
        //a vypis tuto zmenu
        System.out.println(cars[0]);
        // pocet vsetky znaciek aut a poli je
        System.out.println(cars.length);
        //vypis vsetky znacky aut v poli
        System.out.println("Vypisete značky aut: ");
        System.out.println("---------------");
        // POuzitie cyklu s pevnym poctom opakovanim a prikatu lengh ktory zistuje dlzku pola


    }
}
