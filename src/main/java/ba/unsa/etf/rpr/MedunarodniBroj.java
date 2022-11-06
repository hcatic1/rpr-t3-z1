package ba.unsa.etf.rpr;

public class MedunarodniBroj extends TelefonskiBroj{
    MedunarodniBroj(String drzava, String broj){
        this.broj = new String(drzava + broj);
    }

    @Override
    public String ispisi() {
        System.out.println(broj);
        return broj;
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
