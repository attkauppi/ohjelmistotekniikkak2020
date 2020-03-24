package com.mycompany.unicafe;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class MaksukorttiTest {

    Maksukortti kortti;

    @Before
    public void setUp() {
        kortti = new Maksukortti(10);
    }
    
    @Test
    public void saldoAlussaOikein() {
        assertEquals("Kortilla on rahaa 10.0 euroa", kortti.toString());
    }

    @Test
    public void luotuKorttiOlemassa() {
        assertTrue(kortti!=null);      
    }
    
    @Test
    public void lataaminenKasvattaaSaldoaOikein() {
        
        Maksukortti kortti1 = new Maksukortti(10);
        Maksukortti kortti2 = new Maksukortti(10);
        
        kortti1.lataaRahaa(160);
        assertEquals("Kortilla on rahaa 150.0 euroa", kortti1.toString());
        
        kortti2.lataaRahaa(10);
        assertEquals("Kortilla on rahaa 20.0 euroa", kortti2.toString());
    }
}
