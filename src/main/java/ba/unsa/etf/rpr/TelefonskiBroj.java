package ba.unsa.etf.rpr;

public abstract class TelefonskiBroj {
    protected String broj;
    public abstract String ispisi();
    public abstract int hashCode();

    public int compareTo(TelefonskiBroj broj1, TelefonskiBroj broj2){
        return broj1.ispisi().compareTo(broj2.ispisi());
    }
}
