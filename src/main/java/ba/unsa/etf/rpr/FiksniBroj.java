package ba.unsa.etf.rpr;

public class FiksniBroj extends TelefonskiBroj{ //dijete klasa, nasljedjuje klasu Telefonski broj

    public FiksniBroj(Grad grad, String broj){ //konstruktor
        this.broj = new String("0" + grad.getNumVal( ) + "/" + broj); //broj = 123-456;
    }

    @Override
    public String ispisi() { //implementacija metode ispisi koja vraca atribut klase u obliku pogodnom za ispis
        //System.out.println(broj);
        return broj;
    }

    @Override
    public int hashCode(){
        return 0;
    } //imeplementacija metode hashCode
}
