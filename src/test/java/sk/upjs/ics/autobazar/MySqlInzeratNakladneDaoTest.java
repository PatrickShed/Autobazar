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

public class MySqlInzeratNakladneDaoTest {
    
    public MySqlInzeratNakladneDaoTest() {
    }
    
    /**
     * Test of pridat method, of class MySqlInzeratNakladneDao.
     */
    @Test
    public void testPridat() {
        System.out.println("pridat");
        InzeratNakladne inzerat = new InzeratNakladne();
        inzerat.setZnacka("Volvo");
        inzerat.setModel("s40");
        inzerat.setRocnik("2002");
        inzerat.setObjem(2000L);
        inzerat.setKm(132456L);
        inzerat.setPrevodovka("manual");
        inzerat.setVykon(120L);
        inzerat.setCena(1800L);
        inzerat.setDatumPridania(Date.from(Instant.now()));
        inzerat.setIdP(1L);
        MySqlInzeratNakladneDao instance = new MySqlInzeratNakladneDao();
        int x = instance.dajVsetky().size();
        instance.pridat(inzerat);
        assertEquals(x, instance.dajVsetky().size()-1);
    }

    /**
     * Test of dajVsetky method, of class MySqlInzeratNakladneDao.
     */
    @Test
    public void testDajVsetky() {
        System.out.println("dajVsetky");
        MySqlInzeratNakladneDao instance = new MySqlInzeratNakladneDao();
        List<InzeratNakladne> expResult = null;
        List<InzeratNakladne> result = instance.dajVsetky();
        assertTrue(!result.isEmpty());
    }

    /**
     * Test of vyhladaj method, of class MySqlInzeratNakladneDao.
     */
    @Test
    public void testVyhladaj() {
       System.out.println("vyhladaj");
        MySqlInzeratNakladneDao instance = new MySqlInzeratNakladneDao();
        List<InzeratNakladne> expResult = instance.dajVsetky();
        InzeratNakladne inzerat = expResult.get(expResult.size()-1);
        List<InzeratNakladne> result = instance.vyhladaj(inzerat.getZnacka(), inzerat.getModel(), inzerat.getRocnik(), inzerat.getRocnik());
        assertTrue(!result.isEmpty());
    }

    /**
     * Test of odstranit method, of class MySqlInzeratNakladneDao.
     */
    @Test
    public void testOdstranit() {
        System.out.println("odstranit");
        InzeratNakladne inzerat = new InzeratNakladne();
        inzerat.setZnacka("Volvo");
        inzerat.setModel("s40");
        inzerat.setRocnik("2002");
        inzerat.setObjem(2000L);
        inzerat.setKm(132456L);
        inzerat.setPrevodovka("manual");
        inzerat.setVykon(120L);
        inzerat.setCena(1800L);
        inzerat.setDatumPridania(Date.from(Instant.now()));
        inzerat.setIdP(1L);
        MySqlInzeratNakladneDao instance = new MySqlInzeratNakladneDao();
        List<InzeratNakladne> expResult = instance.dajVsetky();
        inzerat.setId(expResult.get(3).getId());
        int x = instance.dajVsetky().size();
        instance.odstranit(inzerat);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(x, instance.dajVsetky().size()+1);
    }

    /**
     * Test of dajPodlaPouzivatela method, of class MySqlInzeratNakladneDao.
     */
    @Test
    public void testDajPodlaPouzivatela() {
        System.out.println("dajPodlaPouzivatela");
        Long idP = 1L;
        MySqlInzeratNakladneDao instance = new MySqlInzeratNakladneDao();        
        List<InzeratNakladne> result = instance.dajPodlaPouzivatela(idP);
        assertTrue(!result.isEmpty());
    }
    
}
