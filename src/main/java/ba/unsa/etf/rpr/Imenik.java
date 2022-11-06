package ba.unsa.etf.rpr;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Imenik {
    Map<String, TelefonskiBroj> imenik;
    void dodaj(String ime, TelefonskiBroj broj){
        imenik.put(ime, broj);
    }
    String dajBroj(String ime){
        return imenik.get(ime).ispisi();
    }
    String dajIme(TelefonskiBroj broj){
        for(Map.Entry<String, TelefonskiBroj> par: imenik.entrySet()){
            if(par.getValue().ispisi().equals(broj)){
                return par.getKey();
            }
        }
        throw new mojIzuzetak("Ne postoji korisnik sa datim brojem telefona");
    }
    String naSlovo(char s){
        String na = new String();
        int brojac = 0;
        for( String ime: imenik.keySet()){
            if(ime.startsWith(s + "")){
                brojac++;
                na += brojac + ". " + ime + " - " + dajBroj(ime);
            }
        }
        return na;
    }
    Set<String> izGrada(Grad g){
        Set<String> uGradu = new TreeSet<String>();
        for(String ime: imenik.keySet()){
            if(dajBroj(ime).startsWith("0"+g.getNumVal())){
                uGradu.add(ime);
            }
        }
        return uGradu;
    }
    Set<TelefonskiBroj> izGradaBrojevi(Grad g){
        Set<TelefonskiBroj> izGrada= new TreeSet<TelefonskiBroj>();
        Set<String> ljudiIzGrada = izGrada(g);
        for(String ime :ljudiIzGrada){
            izGrada.add(imenik.get(ime));
        }
        return izGrada;
    }
}
