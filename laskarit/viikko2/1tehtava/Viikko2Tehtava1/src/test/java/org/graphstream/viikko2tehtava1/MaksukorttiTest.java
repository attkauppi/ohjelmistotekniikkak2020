/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.graphstream.viikko2tehtava1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;



/**
 *
 * @author ari
 */
public class MaksukorttiTest {
    
    
    //Testiluokan konstruktori sekä metodit setUpClass
    //(suoritetaan ennen kuin testaus aloitetaan), 
    //tearDownClass (suoritetaan testauksen päätyttyä) 
    //ja tearDown (suoritetaan jokaisen testin jälkeen) 
    //on poistettu sillä testimme ei niitä tarvitse.
    
    Maksukortti kortti;
    
    @Before
    public void setUp() {
        // Suoritetaan ennen jokaista testitapausta, kun 
        // käytetään before-merkintää
        kortti = new Maksukortti(10);
    }
    

    
    @Test
    public void konstruktoriAsettaaSaldonOikein() {
//        Maksukortti kortti = new Maksukortti(10);
//        
//        String vastaus = kortti.toString();
//        
//        assertEquals("Kortilla on rahaa 10.0 euroa", vastaus);
        
        // Vaihtoehtoinen tapa
        Maksukortti kortti = new Maksukortti(10);
        assertEquals("Kortilla on rahaa 10.0 euroa", kortti.toString());
    }
    
    @Test
    public void syoEdullisestiVahentaaSaldoaOikein() {
        Maksukortti k = new Maksukortti(10);
        
        k.syoEdullisesti();
        
        assertEquals("Kortilla on rahaa 7.5 euroa", k.toString());
    }
    
    @Test
    public void syoMaukkaastiVahentaaSaldoaOikein() {
        Maksukortti k = new Maksukortti(10);
        
        k.syoMaukkaasti();
        
        assertEquals("Kortilla on rahaa 6.0 euroa", k.toString());        
    }
    
    @Test
    public void syoEdullisestiEiVieSaldoaNegatiiviseksi() {
        Maksukortti k = new Maksukortti(10);
        
        k.syoMaukkaasti();
        k.syoMaukkaasti();
        // Kortin saldo on 2 ja edullisen hinta on 2.5
        k.syoEdullisesti();
        
        assertEquals("Kortilla on rahaa 2.0 euroa", k.toString());
    }
    
    @Test
    public void kortilleVoiLadataRahaa() {
        kortti.lataaRahaa(25);
        assertEquals("Kortilla on rahaa 35.0 euroa", kortti.toString());
    }
    
    @Test
    public void kortinSaldoEiYlitaMaksimiarvoa() {
        kortti.lataaRahaa(200);
        assertEquals("Kortilla on rahaa 150.0 euroa", kortti.toString());
    }
    
    // Jäivät turhiksi, mutta rakenne tässä:
    //@BeforeClass
//    public static void setUpClass() {
//    }
//    @AfterClass
//    public static void tearDownClass() {        
//    }
//    @After
//    public void tearDown() {
//    }
//    // TODO add test methods here.
//    // The methods must be annotated with annotation @Test. For example:
//    //
//    @Test
//    public void hello() {}
}
