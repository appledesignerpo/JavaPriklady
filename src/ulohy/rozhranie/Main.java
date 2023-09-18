package ulohy.rozhranie;



public class Main {



    public static void main(String[] args)

    {



        System.out.println("---------------------");
        Merkur myMerkur = new Merkur();  // Create  object
        myMerkur.planetSize();
        myMerkur.color();
        myMerkur.zivot();
        myMerkur.mesiace();
        System.out.println("---------------------");


        Venusa myVenusa = new Venusa();
        myVenusa.planetSize();
        myVenusa.color();
        myVenusa.zivot();
        myVenusa.mesiace();
        System.out.println("---------------------");

        Zem myZem = new Zem();
        myZem.planetSize();
        myZem.color();
        myZem.zivot();
        myZem.mesiace();
        System.out.println("---------------------");

    }



}
