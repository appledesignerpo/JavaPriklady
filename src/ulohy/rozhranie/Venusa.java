package ulohy.rozhranie;

class Venusa implements Planeta {

    @Override
    public void planetSize() {
        System.out.println("Priemer venuse je  1900km");
    }

    @Override
    public void color() {
        System.out.println("Farba planety je Hneda");
    }

    public void zivot() {
        System.out.println("Na venusi nie je zivot - dokazene roverom");
    }

}
