// kazdy program zacina  triedou  klucove slovo class + public
// nazov triedy koresponduje s konvenciou Camel budme pouzivat velke a male pismena a viacere slova oddelime velkymi pismenami

public class HelloWorld {
    public static void main(String[] args) { //metoda main dolezita pre spustenie programu

   

        System.out.println("\nHello, \nWorld!");
        System.out.println("Anton Kostrab");
        System.out.println("Java Developer Junior");
        System.out.print("Nejaky text č.1");
        System.out.print("\n\n\nNejaký text č.2"); //AltGR + q vpise  znak \n vlozy novy riadok
        System.out.print("\n\tOdsadený text");
        //TODO vyskusat dalsie escape character spolu s ukazkami dalsich 3 kombinacii
        System.out.print("\n\t\'Citacia\'");
        System.out.print("\n\t\"Citacia2\"");
        System.out.println("\n\t\"\sCitacia3\s\"");

        System.out.print("Lomka: \\ ");


//        System.out.print("YYY");
        System.out.println("YYY\rXXX");

        System.out.println(20);
        System.out.println(1.2);

    }
}
//TESTY -altGR +n  hodi zlozenu zatvorku }, sout dopise samo /System.out.println/