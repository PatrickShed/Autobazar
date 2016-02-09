/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.upjs.ics.autobazar;

import java.util.List;

/**
 *
 * @author Patrik
 */
public interface InzeratKaravanDao {
    public void pridat(InzeratKaravan inzerat);
    
    public List<InzeratKaravan> dajVsetky();
    
    public List<InzeratKaravan> vyhladaj(String znacka, String model, String odRocnik, String doRocnik);
    
    public List<InzeratKaravan> vyhladajViac(String znacka, String model, String odRocnik, String doRocnik, int odKm, int doKm, long odCena, long doCena, boolean klimatizacia, boolean tazneZariadenie, boolean vyhrievaneSedadla);
    
    public void odstranit(InzeratKaravan inzerat);
    
    public List<InzeratKaravan> dajPodlaPouzivatela(Long idP);
}
