package ulohy.rozhranie;



class Merkur implements Planeta {

    @Override
    public void planetSize() {
        System.out.println("Merkur ma priemer 5500km.");
    }

    @Override
    public void color() {
        System.out.println("Farba merkuru je siva");
    }

    public void zivot() {
        System.out.println("Na  planete Merkuj nie zivot");
    }

    public void mesiace() {
        System.out.println("Nemá žiadne mesiace");
    }

}
