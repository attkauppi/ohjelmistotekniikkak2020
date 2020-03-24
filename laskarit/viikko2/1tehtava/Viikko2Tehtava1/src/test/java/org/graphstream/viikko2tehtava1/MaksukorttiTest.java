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
    
    public MaksukorttiTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        
    }
    
    @AfterClass
    public static void tearDownClass() {        
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void hello() {}
    
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
}