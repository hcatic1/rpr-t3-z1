package ba.unsa.etf.rpr;

public class MobilniBroj extends TelefonskiBroj{ //dijete klasa nasljedjuje klasu TelefonskiBroj
    MobilniBroj (int mobilnaMreza, String broj){ //konstruktor
        this.broj = new String("0" + mobilnaMreza + "\\" + broj);
    }

    @Override
    public String ispisi() { //implementacija metode ispisi koja vraca atribut klase u obliku pogodnom za ispis
        //System.out.println(broj);
        return broj;
    }

    @Override
    public int hashCode() {
        return 0;
    } //implementacija metode hashCode
}
