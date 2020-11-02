package ba.unsa.etf.rpr;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {

    @Test
    void dodajArtikl() {
        Korpa k=new Korpa();
        Artikl a = new Artikl("artikl",23,"kod");
        k.dodajArtikl(a);
        assertEquals(1,k.dajBr());
    }

    @Test
    void izbaciArtiklSaKodom() {
        Korpa k=new Korpa();
        Artikl a = new Artikl("artikl",23,"kod");
        k.dodajArtikl(a);
        k.izbaciArtiklSaKodom("kod");
        assertEquals(0,k.dajBr());
    }

    @Test
    void dajUkupnuCijenuArtikala() {
        Korpa k=new Korpa();
        Artikl a = new Artikl("artikl",23,"kod");
        k.dodajArtikl(a);
        assertEquals(23,k.dajUkupnuCijenuArtikala());
    }


}