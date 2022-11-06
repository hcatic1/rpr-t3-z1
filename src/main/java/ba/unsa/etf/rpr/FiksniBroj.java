package ba.unsa.etf.rpr;

public class FiksniBroj extends TelefonskiBroj{

    public FiksniBroj(Grad grad, String broj){
        this.broj = new String("0" + grad.getNumVal( ) + "\\" + broj); //broj = 123-456;
    }

    @Override
    public String ispisi() {
        //System.out.println(broj);
        return broj;
    }

    @Override
    public int hashCode(){
        return 0;
    }
}
