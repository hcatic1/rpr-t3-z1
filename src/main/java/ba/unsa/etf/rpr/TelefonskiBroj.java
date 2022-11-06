package ba.unsa.etf.rpr;

public abstract class TelefonskiBroj implements Comparable<TelefonskiBroj>{ //bazna apstraktna klasa
    protected String broj;
    public abstract String ispisi();
    public abstract int hashCode();

    public int compareTo(TelefonskiBroj broj1){
        return this.ispisi().compareTo(broj1.ispisi());
    }
}
