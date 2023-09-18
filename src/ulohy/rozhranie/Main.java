package ulohy.rozhranie;


import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
public class Main {



    public static void main(String[] args)



    {



        System.out.println("---------------------");
        Merkur myMerkur = new Merkur();  // Create  object
        myMerkur.planetSize();
        myMerkur.color();
        myMerkur.zivot();
        System.out.println("---------------------");


        Venusa myVenusa = new Venusa();
        myVenusa.planetSize();
        myVenusa.color();
        myVenusa.zivot();
        System.out.println("---------------------");
        Zem myZem = new Zem();
        myZem.planetSize();
        myZem.color();
        myZem.zivot();
        System.out.println("---------------------");

    }



}
