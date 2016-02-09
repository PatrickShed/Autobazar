package sk.upjs.ics.autobazar;

import java.util.List;


public interface InzeratOsobneDao {
    public void pridat(InzeratOsobne inzerat);
    
    public List<InzeratOsobne> dajVsetky();
    
    public List<InzeratOsobne> vyhladaj(String znacka, String model, String odRocnik, String doRocnik);
    
    public List<InzeratOsobne> vyhladajViac(String znacka, String model, String odRocnik, String doRocnik, int odKm, int doKm, long odCena, long doCena, boolean klimatizacia, boolean tazneZariadenie, boolean vyhrievaneSedadla);
    
    public void odstranit(InzeratOsobne inzerat);
    
    public List<InzeratOsobne> dajPodlaPouzivatela(Long idP);
    
}
