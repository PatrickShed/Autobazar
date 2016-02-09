
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

public class MySqlInzeratOsobneDaoTest {   
    
    public MySqlInzeratOsobneDaoTest() {
    }
    
    /**
     * Test of pridat method, of class MySqlInzeratOsobneDao.
     */
    @Test
    public void testPridat() {
        System.out.println("pridat");
        InzeratOsobne inzerat = new InzeratOsobne();
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
        MySqlInzeratOsobneDao instance = new MySqlInzeratOsobneDao();
        int x = instance.dajVsetky().size();
        instance.pridat(inzerat);
        assertEquals(x, instance.dajVsetky().size()-1);
    }

    /**
     * Test of dajVsetky method, of class MySqlInzeratOsobneDao.
     */
    @Test
    public void testDajVsetky() {
        System.out.println("dajVsetky");
        MySqlInzeratOsobneDao instance = new MySqlInzeratOsobneDao();
        List<InzeratOsobne> expResult = null;
        List<InzeratOsobne> result = instance.dajVsetky();
        assertTrue(!result.isEmpty());
        
    }

    /**
     * Test of odstranit method, of class MySqlInzeratOsobneDao.
     */
    @Test
    public void testOdstranit() {
        System.out.println("odstranit");
        InzeratOsobne inzerat = new InzeratOsobne();
        inzerat.setZnacka("Volvo");
        inzerat.setModel("s40");
        inzerat.setRocnik("2002");
        inzerat.setObjem(2000L);
        inzerat.setKm(132456L);
        inzerat.setPalivo("benzin");
        inzerat.setPrevodovka("manual");
        inzerat.setVykon(120L);
        inzerat.setCena(1800L);
        inzerat.setDatumPridania(Date.from(Instant.now()));
        inzerat.setIdP(1L);
        MySqlInzeratOsobneDao instance = new MySqlInzeratOsobneDao();
        List<InzeratOsobne> expResult = instance.dajVsetky();
        inzerat.setId(expResult.get(1).getId());
        int x = instance.dajVsetky().size();
        instance.odstranit(inzerat);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(x, instance.dajVsetky().size()+1);
    }

    /**
     * Test of vyhladaj method, of class MySqlInzeratOsobneDao.
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

    /**
     * Test of dajPodlaPouzivatela method, of class MySqlInzeratOsobneDao.
     */
    @Test
    public void testDajPodlaPouzivatela() {
        System.out.println("dajPodlaPouzivatela");
        Long idP = 1L;
        MySqlInzeratOsobneDao instance = new MySqlInzeratOsobneDao();
        //List<InzeratOsobne> expResult = null;
        List<InzeratOsobne> result = instance.dajPodlaPouzivatela(idP);
        assertTrue(!result.isEmpty());
        
    }
    
}
