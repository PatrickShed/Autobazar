package sk.upjs.ics.autobazar;

import java.util.List;

public interface InzeratNakladneDao {
    public void pridat(InzeratNakladne inzerat);
    
    public List<InzeratNakladne> dajVsetky();
    
    public List<InzeratNakladne> vyhladaj(String znacka, String model, String odRocnik, String doRocnik);
    
    public List<InzeratNakladne> vyhladajViac(String znacka, String model, String odRocnik, String doRocnik,int odKm, int doKm, long odCena, long doCena, boolean klimatizacia, boolean tazneZariadenie, boolean vyhrievaneSedadla);
    
    public void odstranit(InzeratNakladne inzerat);
    
    public List<InzeratNakladne> dajPodlaPouzivatela(Long idP);
}
