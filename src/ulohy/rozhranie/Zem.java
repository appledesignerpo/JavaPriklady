package ulohy.rozhranie;

class Zem implements Planeta {

    @Override
    public void planetSize() {
        System.out.println("Priemer zeme je 2500km.");
    }

    @Override
    public void color() {
        System.out.println("Farba planety zem je modra ako jej obloha");
    }

    public void zivot() {
        System.out.println("Na zemi je  zivot ale nicime ju");
    }

    public void mesiace() {
        System.out.println("Má 1 mesiac a ufo zakladne na nom");
    }

}
