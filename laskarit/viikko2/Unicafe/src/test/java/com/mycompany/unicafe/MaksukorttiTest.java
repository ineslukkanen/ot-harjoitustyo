package com.mycompany.unicafe;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
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
    public void luotuKorttiOlemassa() {
        assertTrue(kortti!=null);      
    }
    @Test
    public void konstruktoriAsettaaSaldonOikein() {
        assertThat(kortti.saldo(), is(equalTo(10)));
    }
    @Test
    public void kortilleVoiLadataRahaa() {
        kortti.lataaRahaa(5);
        assertThat(kortti.saldo(), is(equalTo(15)));
    }
    @Test
    public void saldoVaheneeOikeinKunRahaaRiittavasti() {
        kortti.otaRahaa(5);
         assertThat(kortti.saldo(), is(equalTo(5)));
    }
    @Test
    public void saldoEiMuutuKunRahaaLiianVahan() {
        kortti.otaRahaa(15);
        assertThat(kortti.saldo(), is(equalTo(10)));
        
    }
    @Test
    public void otaRahaaPalauttaaTrueJosRahatRiittavat() {
        assertThat(kortti.otaRahaa(5), is(true));
    }   
        @Test
    public void otaRahaaPalauttaaFalseJosRahaaLiianVahan() {
        assertThat(kortti.otaRahaa(20), is(false));
    }
}
