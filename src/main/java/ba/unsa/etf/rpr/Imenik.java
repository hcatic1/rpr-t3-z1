package ba.unsa.etf.rpr;

import java.util.*;

public class Imenik {
    Map<String, TelefonskiBroj> imenik;

    public Imenik() {
        imenik = new TreeMap<String, TelefonskiBroj>() ;
    }

    void dodaj(String ime, TelefonskiBroj broj){
        imenik.put(ime, broj);
    } //moetoda koja izvrsava dodavanje korisnika u imenik
    String dajBroj(String ime){
        return imenik.get(ime).ispisi();
    } //metoda koja vraca broj telefona korisnika sa proslijedjenim imenom
    String dajIme(TelefonskiBroj broj){ //metoda koja vraca ime korisnika ciji je broj telefona proslijedjen
        for(Map.Entry<String, TelefonskiBroj> par: imenik.entrySet()){ //koristi se metoda kojom se dobijaju svi Entries za mapu
            if(par.getValue().ispisi().equals(broj.ispisi())){
                return par.getKey();
            }
        }
        throw new mojIzuzetak("Ne postoji korisnik sa datim brojem telefona"); //baca izuzetak ako broj telefona nije pronadjen u imeniku
    }
    String naSlovo(char s){ //metoda koja vraca imena svih korisnika cije ime pocinje na proslijedjeni char
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
    Set<String> izGrada(Grad g){ //metoda koja vraca sortirani set sa svim korisnicima iz grada koji je proslijedjen kao parametar
        Set<String> uGradu = new TreeSet<String>(); //koristi se cinjenica da je TreeSet abcedno sortiran za String
        for(String ime: imenik.keySet()){
            if(dajBroj(ime).startsWith("0"+g.getNumVal())){
                uGradu.add(ime);
            }
        }
        return uGradu;
    }
    Set<TelefonskiBroj> izGradaBrojevi(Grad g){ //metoda koja vraca set sa svim brojevima iz jednog grada
        Set<TelefonskiBroj> izGrada= new TreeSet<TelefonskiBroj>(); //koristi se cinjenica da je TreeSet sortiran prema CompareTo definisanoj metodi za
        Set<String> ljudiIzGrada = izGrada(g);
        for(String ime :ljudiIzGrada){ //za svakog korisnika iz grada broj telefona se dodaje u set izGrada
            izGrada.add(imenik.get(ime));
        }
        return izGrada;
    }
}
