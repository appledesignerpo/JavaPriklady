package ulohy;

public class CyklyPevnymPoctomOpakovani {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(i);
        }


        System.out.println();//prazdny riadok
        for (int i = 1; i < 10; i++) {
            System.out.print(i);
        }
//vyps parne cisla, mozeme pouzi zapsi scitnia i=i+2 reps. i+2
        System.out.println();//prazdny riadok
        for (int i = 2; i <= 10; i=i+2) {
            System.out.print(i);
        }

// parne cisla odzadu

        System.out.println();//prazdny riadok
        for (int i = 10; i >= 2; i=i-2) {
            System.out.print(i+"\t"); // posuzil som \t ako tabulator odsadenie hodnot
        }

        System.out.println();//prazdny riadok

        //vnaranie cyklov
        //TODO ako vypista hodnoty od 1 -100 aby v prvom vypsial od 1 do 10 v druhom od 11 do 20 v tretom od 21 -do 30 atd
        for (int i = 1; i <=100 ; i++) {
            System.out.print(i+"\t");
          if (i % 10 == 0)System.out.println();


        }

        System.out.println("\nPodobná úloha ako vyššie s využitim 2 cyklov, resp. vnoreného");
        // Podobna uloha ako vyssie s vyuzitim 2 cyklov, resp. vnoreneho
        for (int i = 0; i <= 9; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print((10 * i + j) + "\t");
            }
            System.out.println();
        }

        // matic s udajmiu 1  do 25
        int rows = 5;
        int cols = 5;
        int[][] matrix = new int[rows][cols];

        int value = 1;

        // Naplnění matice hodnotami od 1 do 25
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = value;
                value++;
            }
        }

        // Výpis matice
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println(); // Nový řádek po každém řádku matice
        }




    }
}