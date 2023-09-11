package oop.enkapsulacia;

public class KnihaSpravne {
    //vytvorili sme atributy /fiels/ triedy
    private String nazov;
    private String autor;
    private int rokVydania;
    private double cena;

    public String getNazov() {
        return nazov;
    }

    public void setNazov(String nazov) {
        //Aplikačna logika prip. nejak kontrola
        this.nazov = nazov;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getRokVydania() {
        return rokVydania;
    }

    public void setRokVydania(int rokVydania) {
        this.rokVydania = rokVydania;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }
}
