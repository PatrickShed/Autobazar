/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.upjs.ics.autobazar;

import java.time.Instant;
import java.util.Date;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Patrik
 */
public class MySqlInzeratKaravanDaoTest {
    
    public MySqlInzeratKaravanDaoTest() {
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

    /**
     * Test of pridat method, of class MySqlInzeratKaravanDao.
     */
    @Test
    public void testPridat() {
        System.out.println("pridat");
        InzeratKaravan inzerat = new InzeratKaravan();
        inzerat.setZnacka("Volvo");
        inzerat.setModel("s40");
        inzerat.setRocnik("2002");
        inzerat.setObjem(2000L);
        inzerat.setKm(132456L);
        inzerat.setPrevodovka("manual");
        inzerat.setVykon(120L);
        inzerat.setCena(1800L);
        inzerat.setTyp("obytne auto");
        inzerat.setHmotnost(true);
        inzerat.setKlimatizacia(true);
        inzerat.setVyhrievaneSedadla(true);
        inzerat.setTazneZariadenie(false);
        inzerat.setDatumPridania(Date.from(Instant.now()));
        inzerat.setIdP(1L);
        MySqlInzeratKaravanDao instance = new MySqlInzeratKaravanDao();
        int x = instance.dajVsetky().size();
        instance.pridat(inzerat);
        assertEquals(x, instance.dajVsetky().size()-1);
    }

    /**
     * Test of dajVsetky method, of class MySqlInzeratKaravanDao.
     */
    @Test
    public void testDajVsetky() {
        System.out.println("dajVsetky");
        MySqlInzeratKaravanDao instance = new MySqlInzeratKaravanDao();
        //List<InzeratOsobne> expResult = null;
        List<InzeratKaravan> result = instance.dajVsetky();
        assertTrue(!result.isEmpty());
    }

    /**
     * Test of vyhladajViac method, of class MySqlInzeratKaravanDao.
     */
    @Test
    public void testVyhladajViac() {
        System.out.println("vyhladaj");
        MySqlInzeratKaravanDao instance = new MySqlInzeratKaravanDao();
        List<InzeratKaravan> expResult = instance.dajVsetky();
        InzeratKaravan inzerat = expResult.get(expResult.size()-1);
        List<InzeratKaravan> result = instance.vyhladajViac(inzerat.getZnacka(), inzerat.getModel(), inzerat.getRocnik(), inzerat.getRocnik(),Integer.parseInt(inzerat.getKm().toString()),Integer.parseInt(inzerat.getKm().toString()),inzerat.getCena(),inzerat.getCena(),inzerat.isKlimatizacia(),inzerat.isTazneZariadenie(),inzerat.isVyhrievaneSedadla());
        assertTrue(!result.isEmpty());
    }

    /**
     * Test of odstranit method, of class MySqlInzeratKaravanDao.
     */
    @Test
    public void testOdstranit() {
        System.out.println("odstranit");
        InzeratKaravan inzerat = new InzeratKaravan();
        inzerat.setZnacka("Volvo");
        inzerat.setModel("s40");
        inzerat.setRocnik("2002");
        inzerat.setObjem(2000L);
        inzerat.setKm(132456L);        
        inzerat.setPrevodovka("manual");
        inzerat.setVykon(120L);
        inzerat.setCena(1800L);
        inzerat.setTyp("obytne auto");
        inzerat.setHmotnost(true);
        inzerat.setKlimatizacia(true);
        inzerat.setVyhrievaneSedadla(true);
        inzerat.setTazneZariadenie(false);
        inzerat.setDatumPridania(Date.from(Instant.now()));
        inzerat.setIdP(1L);
        MySqlInzeratKaravanDao instance = new MySqlInzeratKaravanDao();
        List<InzeratKaravan> expResult = instance.dajVsetky();
        inzerat.setId(expResult.get(0).getId());
        int x = instance.dajVsetky().size();
        instance.odstranit(inzerat);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(x, instance.dajVsetky().size()+1);
    }

    /**
     * Test of dajPodlaPouzivatela method, of class MySqlInzeratKaravanDao.
     */
    @Test
    public void testDajPodlaPouzivatela() {
        System.out.println("dajPodlaPouzivatela");
        Long idP = 1L;
        MySqlInzeratKaravanDao instance = new MySqlInzeratKaravanDao();
        List<InzeratKaravan> expResult = null;
        List<InzeratKaravan> result = instance.dajPodlaPouzivatela(idP);
        assertTrue(!result.isEmpty());        
    }

    /**
     * Test of vyhladaj method, of class MySqlInzeratKaravanDao.
     */
    @Test
    public void testVyhladaj() {
        System.out.println("vyhladaj");
        MySqlInzeratOsobneDao instance = new MySqlInzeratOsobneDao();
        List<InzeratOsobne> expResult = instance.dajVsetky();
        InzeratOsobne inzerat = expResult.get(expResult.size()-1);
        List<InzeratOsobne> result = instance.vyhladaj(inzerat.getZnacka(), inzerat.getModel(), inzerat.getRocnik(), inzerat.getRocnik());
        assertTrue(!result.isEmpty());
    }
    
}
