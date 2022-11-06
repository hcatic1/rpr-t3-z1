package ba.unsa.etf.rpr;

public abstract class TelefonskiBroj { //bazna apstraktna klasa
    protected String broj;
    public abstract String ispisi();
    public abstract int hashCode();

    public int compareTo(TelefonskiBroj broj1, TelefonskiBroj broj2){ //implementacija metode compareTo, interfejsa Comparable
        return broj1.ispisi().compareTo(broj2.ispisi());
    }
}
