import java.util.ArrayList;

public class DynamickePolia {
    public static void main(String[] args) {
        ArrayList<String> auta = new ArrayList();
        auta.add("Volvo");
        auta.add("BMW");
        auta.add("Ford");
        auta.add("Mazda");
        auta.add("Skoda");
       /* System.out.println(auta);*/
        System.out.printf("Všetky auta:");
        System.out.print(auta.get(0) + ", " + auta.get(1) + ", ");
        /*System.out.print(auta.get(1));*/

      /* for (String konkretneAuto:auta){
           System.out.println(konkretneAuto + " ");
    }*/
}
}
