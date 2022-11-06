package ba.unsa.etf.rpr;

public class MobilniBroj extends TelefonskiBroj{
    MobilniBroj (int mobilnaMreza, String broj){
        this.broj = new String("0" + mobilnaMreza + "\\" + broj);
    }

    @Override
    public String ispisi() {
        //System.out.println(broj);
        return broj;
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
