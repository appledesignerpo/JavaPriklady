public class Premenne {
    public static void main(String[] args) {
        String menoZamestnanca = "Anton";
        String priezviskoZamestnanca = "Kostrab";
        String celeMeno = menoZamestnanca + " " + priezviskoZamestnanca + " je developer OK "; // spajame obsah premenych a vlastneho textu
        System.out.println(celeMeno);
//        System.out.println(menoZamestnanca + " "+ priezviskoZamestnanca + " je developer");


        int mojeCislo = 15;
        int mojeCisoVynasobene2mi = mojeCislo * 2;
        System.out.println("Pôvodne číslo je: " + mojeCislo);
        System.out.println("Pôvodne vynasobene 2x: " + mojeCisoVynasobene2mi);

        int mojCislo2;
        mojCislo2 = 25;
        System.out.println("Iny spôsob: " + mojCislo2);

        int mojeCislo3 = 15;
        mojeCislo3 = 20;  // mojeCislo3 obashuje hodnotu 20
        System.out.println(mojeCislo3);

        final int konstanta = 15; // deklaracia konstatny cez klucove slovo final
        // konstanta = 20;  // will generate an error: cannot assign a value to a final variab

        int myNum = 5;
        float myFloatNum = 5.99f; // Deklarujem desatinne cislo na koncy must have f
        double myDoubleNum = 5.99; // Deklarujem desatinne cislo je 2x vacsie ako float nemusi mat f
        char myLetter = 'D';
        boolean myBool = true;
        String myText = "Hello";

       byte cisloTypuByte = 127;
       byte cisloTypubytePoScitani = cisloTypuByte;

       System.out.println(cisloTypuByte);
       System.out.println(cisloTypubytePoScitani);

        int x = 5;
        int y = 6;
        int sum = x + y;
        System.out.println(sum); // Print the value of x + y


        int x2 = 5, y2 = 6, z2 = 50;
        System.out.println(x2 + y2 + z2);




    }
}
