package ulohy;
/*Vypíšte do konzoly nasledujúci text:
        Študent Jozef Mrkvička sa narodil 03.04.2000, z maturitnej skúšky má známku 1.5 a
        od septembra 2022 nastúpi do nového zamestnania ako Java programátor.
        V Bratislave dňa 18.06.2022
        Poznámka: Dátum narodenia, známku a rok + aktuálny dátum nastavte tak, aby sa dali
        meniť v zdrojovom kóde (t.j. cez premenné).*/


import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PremenneUloha {
    public static void main(String[] args) {

       final String ANSI_RESET = "\u001B[0m";
       final String ANSI_BLACK = "\u001B[30m";
       final String ANSI_RED = "\u001B[31m";
       final String ANSI_GREEN = "\u001B[32m";
       final String ANSI_YELLOW = "\u001B[33m";
       final String ANSI_BLUE = "\u001B[34m";
       final String ANSI_PURPLE = "\u001B[35m";
       final String ANSI_CYAN = "\u001B[36m";
       final String ANSI_WHITE = "\u001B[37m";
       final String ANSI_BRIGHT_GREEN  = "\u001B[92m";



       final String RED_BOLD_BRIGHT = "\033[1;91m";

       final String SET_PLAIN_TEXT = "\033[0;0m";
       final String SET_BOLD_TEXT = "\033[0;1m";

        String meno = "Jozef";
        String priezvisko = "Mrkvička";
        String celeMeno = meno + " " + priezvisko ;

        float znamka = 1.5f;


        String denNar = "03";
        String  mesiacNar = "04";
        String  rokNar = "2000";
        String narodenie = denNar + "." + mesiacNar+ "." + rokNar ;

        String nastup = "2022";


        DecimalFormat decimalFormat=new DecimalFormat("#.0");
        double d=1234567/1000000.0;
        System.out.println(decimalFormat.format(d).replace(".",","));

        Date datum = new Date();
        SimpleDateFormat formatDatumu = new SimpleDateFormat("dd.MM.yyyy");

        // LocalDate aktualnyDatum = LocalDate.now(); - novy zapis
        //  System.out.println( "Datum: " + aktualnyDatum );

        System.out.printf( SET_PLAIN_TEXT + ANSI_RED + "Študent "  + celeMeno + " sa narodil "+ ANSI_RESET + SET_BOLD_TEXT + ANSI_RED + narodenie + ANSI_RESET + SET_PLAIN_TEXT + ANSI_YELLOW +", z maturitnej skúšky má známku "+ ANSI_RESET + SET_BOLD_TEXT + ANSI_RED +  decimalFormat.format (znamka) + ANSI_RESET + SET_PLAIN_TEXT +  ANSI_GREEN  +  " a od septembra " + ANSI_RESET +  SET_BOLD_TEXT + ANSI_BRIGHT_GREEN + nastup + ANSI_RESET + SET_PLAIN_TEXT + ANSI_BLUE +  " nastúpi do nového zamestnania ako Java programátor." + ANSI_RESET );

        System.out.println( SET_PLAIN_TEXT + ANSI_BLUE +"\nV Bratislave dňa " + formatDatumu.format(datum) + ANSI_RESET );








    }

}
