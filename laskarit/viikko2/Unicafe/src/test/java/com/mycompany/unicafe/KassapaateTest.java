package com.mycompany.unicafe;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.unicafe.Maksukortti;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author inlukkan
 */
public class KassapaateTest {
    
    public KassapaateTest() {
    }
    
    Kassapaate kassa;
    Maksukortti kortti;

    @Before
    public void setUp() {
        kassa = new Kassapaate();
        kortti = new Maksukortti(1000);
    }

    @Test
    public void kassanRahaMaaraOikein() {
        assertThat(kassa.kassassaRahaa(), is(equalTo(100000)));
    }
    
    @Test
    public void kassanMyydytEdullisetLounaatOikein() {
        assertThat(kassa.edullisiaLounaitaMyyty(), is(equalTo(0)));
    }
    @Test
    public void kassanMyydytMaukkaatLounaatOikein() {
        assertThat(kassa.maukkaitaLounaitaMyyty(), is(equalTo(0)));
    }    
    @Test
    public void edullisenLounaanKateisOstoToimiiKunRahaRiittaa() {
        kassa.syoEdullisesti(500);
        assertThat(kassa.kassassaRahaa(), is(equalTo(100240))); 
    }
    @Test
    public void maukkaanLounaanKateisOstoToimiiKunRahaRiittaa() {
        kassa.syoMaukkaasti(500);
        assertThat(kassa.kassassaRahaa(), is(equalTo(100400))); 
    }
    @Test
    public void myydytEdullisetOikeinKunKateisnmaksuRiittaa() {
        kassa.syoEdullisesti(240);
        assertThat(kassa.edullisiaLounaitaMyyty(), is(equalTo(1))); 
    }
    @Test
    public void myydytMaukkaatOikeinKunKateismaksuRiittaa() {
        kassa.syoMaukkaasti(500);
        assertThat(kassa.maukkaitaLounaitaMyyty(), is(equalTo(1))); 
    }
    @Test
    public void kassanRahaMaaraEiMuutuKunKateistaLiianVahanEdulliseen() {
        kassa.syoEdullisesti(200);
        assertThat(kassa.kassassaRahaa(), is(equalTo(100000))); 
    }
    @Test
    public void myydytEdullisetEiMuutuKunKateistaLiianVahan() {
        kassa.syoEdullisesti(200);
        assertThat(kassa.edullisiaLounaitaMyyty(), is(equalTo(0))); 
    }
    @Test
    public void kassanRahaMaaraEiMuutuKunKateistaLiianVahanMaukkaaseen() {
        kassa.syoMaukkaasti(300);
        assertThat(kassa.kassassaRahaa(), is(equalTo(100000))); 
    }
    @Test
    public void myydytMaukkaatEiMuutuKunKateistaLiianVahan() {
        kassa.syoMaukkaasti(300);
        assertThat(kassa.maukkaitaLounaitaMyyty(), is(equalTo(0))); 
    }
    @Test
    public void edullisenLounaanOstoToimiiOikein() {
        kassa.syoEdullisesti(kortti);
        assertThat(kortti.otaRahaa(240), is(true));
    }
    @Test
    public void maukkaanLounaanOstoToimiiOikein() {
        kassa.syoMaukkaasti(kortti);
        assertThat(kortti.otaRahaa(400), is(true));
    }
    @Test
    public void edullisetKasvavatOikeinKorttiostolla() {
        kassa.syoEdullisesti(kortti);
        assertThat(kassa.edullisiaLounaitaMyyty(), is(equalTo(1)));
    }
    @Test
    public void maukkaatKasvavatOikeinKorttiostolla() {
        kassa.syoMaukkaasti(kortti);
        assertThat(kassa.maukkaitaLounaitaMyyty(), is(equalTo(1)));
    }
    @Test
    public void kortinSaldoOikeinKunRahaaLiianVahanEdulliseen() {
        kortti = new Maksukortti(100);
        kassa.syoEdullisesti(kortti);
        assertThat(kortti.saldo(), is(equalTo(100)));
    }
    @Test
    public void kortinSaldoOikeinKunRahaaLiianVahanMaukkaaseen() {
        kortti = new Maksukortti(100);
        kassa.syoMaukkaasti(kortti);
        assertThat(kortti.saldo(), is(equalTo(100)));
    }
    @Test
    public void kassanSaldoOikeinKunRahaaLiianVahanEdulliseen() {
        kortti = new Maksukortti(100);
        kassa.syoEdullisesti(kortti);
        assertThat(kassa.kassassaRahaa(), is(equalTo(100000)));
    }
    @Test
    public void kassanSaldoOikeinKunRahaaLiianVahanMaukkaaseen() {
        kortti = new Maksukortti(100);
        kassa.syoMaukkaasti(kortti);
        assertThat(kassa.kassassaRahaa(), is(equalTo(100000)));
    }
    @Test
    public void myydytEdullisetOikeinKunRahaaLiianVahan() {
        kortti = new Maksukortti(100);
        kassa.syoEdullisesti(kortti);
        assertThat(kassa.edullisiaLounaitaMyyty(), is(equalTo(0)));
    }
    @Test
    public void myydytMaukkaatOikeinKunRahaaLiianVahan() {
        kortti = new Maksukortti(100);
        kassa.syoMaukkaasti(kortti);
        assertThat(kassa.maukkaitaLounaitaMyyty(), is(equalTo(0)));
    }  
    @Test
    public void korttiPalauttaaFalseKunLiianVahanEdulliseen() {
        kortti = new Maksukortti(100);
        kassa.syoEdullisesti(kortti);
        assertThat(kortti.otaRahaa(240), is(false));
    }
    @Test
    public void korttiPalauttaaFalseKunLiianVahanMaukkaaseen() {
        kortti = new Maksukortti(100);
        kassa.syoMaukkaasti(kortti);
        assertThat(kortti.otaRahaa(400), is(false));
    }
    @Test
    public void kassanSaldoKasvaaOikeinRahaaLadattaessa() {
        kassa.lataaRahaaKortille(kortti, 200);
        assertThat(kassa.kassassaRahaa(), is(equalTo(100200)));
    }
}
