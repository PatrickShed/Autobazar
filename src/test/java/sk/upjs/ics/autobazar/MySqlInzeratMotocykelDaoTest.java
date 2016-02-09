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
 * @author PC
 */
public class MySqlInzeratMotocykelDaoTest {
    
    public MySqlInzeratMotocykelDaoTest() {
    }

    /**
     * Test of pridat method, of class MySqlInzeratMotocykelDao.
     */
    @Test
    public void testPridat() {
        System.out.println("pridat");
        InzeratMotocykel inzerat = new InzeratMotocykel();
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
        MySqlInzeratMotocykelDao instance = new MySqlInzeratMotocykelDao();
        int x = instance.dajVsetky().size();
        instance.pridat(inzerat);
        assertEquals(x, instance.dajVsetky().size()-1);
    }

    /**
     * Test of dajVsetky method, of class MySqlInzeratMotocykelDao.
     */
    @Test
    public void testDajVsetky() {
        System.out.println("dajVsetky");
        MySqlInzeratMotocykelDao instance = new MySqlInzeratMotocykelDao();
        List<InzeratMotocykel> expResult = null;
        List<InzeratMotocykel> result = instance.dajVsetky();
        assertTrue(!result.isEmpty());
    }

    /**
     * Test of vyhladaj method, of class MySqlInzeratMotocykelDao.
     */
    @Test
    public void testVyhladaj() {
        System.out.println("vyhladaj");
        MySqlInzeratMotocykelDao instance = new MySqlInzeratMotocykelDao();
        List<InzeratMotocykel> expResult = instance.dajVsetky();
        InzeratMotocykel inzerat = expResult.get(expResult.size()-1);
        List<InzeratMotocykel> result = instance.vyhladaj(inzerat.getZnacka(), inzerat.getModel(), inzerat.getRocnik(), inzerat.getRocnik());
        assertTrue(!result.isEmpty());
    }

    /**
     * Test of odstranit method, of class MySqlInzeratMotocykelDao.
     */
    @Test
    public void testOdstranit() {
        System.out.println("odstranit");
        InzeratMotocykel inzerat = new InzeratMotocykel();
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
        MySqlInzeratMotocykelDao instance = new MySqlInzeratMotocykelDao();
        List<InzeratMotocykel> expResult = instance.dajVsetky();
        inzerat.setId(expResult.get(3).getId());
        int x = instance.dajVsetky().size();
        instance.odstranit(inzerat);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(x, instance.dajVsetky().size()+1);
    }

    /**
     * Test of dajPodlaPouzivatela method, of class MySqlInzeratMotocykelDao.
     */
    @Test
    public void testDajPodlaPouzivatela() {
         System.out.println("dajPodlaPouzivatela");
        Long idP = 1L;
        MySqlInzeratMotocykelDao instance = new MySqlInzeratMotocykelDao();
        //List<InzeratMotocykel> expResult = null;
        List<InzeratMotocykel> result = instance.dajPodlaPouzivatela(idP);
        assertTrue(!result.isEmpty());
    }
    
}
