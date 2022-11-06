package ba.unsa.etf.rpr;

public class MedunarodniBroj extends TelefonskiBroj{ //dijete klasa, nasljedjuje klasu TelefonskiBroj
    MedunarodniBroj(String drzava, String broj){ //konstruktor
        this.broj = new String(drzava + broj);
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
