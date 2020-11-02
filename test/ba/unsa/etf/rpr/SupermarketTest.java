package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {

    @Test
    void dodajArtikl() {
        Supermarket k=new Supermarket();
        Artikl a = new Artikl("artikl",23,"kod");
        k.dodajArtikl(a);
        assertEquals(1,k.dajBr());
    }

    @Test
    void izbaciArtiklSaKodom() {
        Supermarket k=new Supermarket();
        Artikl a = new Artikl("artikl",23,"kod");
        k.dodajArtikl(a);
        assertEquals(1,k.dajBr());
        k.izbaciArtiklSaKodom("kod");
        assertEquals(0,k.dajBr());
    }

}