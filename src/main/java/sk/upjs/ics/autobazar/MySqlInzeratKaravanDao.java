/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.upjs.ics.autobazar;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Patrik
 */
public class MySqlInzeratKaravanDao implements InzeratKaravanDao{
    private JdbcTemplate jdbcTemplate;
    
    public MySqlInzeratKaravanDao() {
        MysqlDataSource dataSource = InzeratFactory.INSTANCE.dataSource();        
        jdbcTemplate = InzeratFactory.INSTANCE.jdbcTemplate();
    }

    @Override
    public void pridat(InzeratKaravan inzerat) {
        String sql = "INSERT INTO inzeratKaravan VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
        jdbcTemplate.update(sql,inzerat.getIdP(),null,inzerat.getZnacka(),inzerat.getModel(),inzerat.getRocnik(),inzerat.getKm(),inzerat.getObjem(),inzerat.getPrevodovka(),inzerat.getVykon(),inzerat.getDatumPridania(), inzerat.getCena(),inzerat.getTyp(),inzerat.isHmotnost());
    }

    @Override
    public List<InzeratKaravan> dajVsetky() {
        String sql = "SELECT * FROM inzeratKaravan";
        BeanPropertyRowMapper<InzeratKaravan> mapper = BeanPropertyRowMapper.newInstance(InzeratKaravan.class);
        return jdbcTemplate.query(sql, mapper);
    }

    @Override
    public List<InzeratKaravan> vyhladaj(String znacka, String model, String odRocnik, String doRocnik) {
        String sql = "select * from inzeratKaravan where znacka = ? and model = ? and rocnik >= ? and rocnik <= ?";
        BeanPropertyRowMapper<InzeratKaravan> mapper = BeanPropertyRowMapper.newInstance(InzeratKaravan.class);
        return jdbcTemplate.query(sql, mapper,znacka,model,odRocnik,doRocnik);
    }

    @Override
    public void odstranit(InzeratKaravan inzerat) {
        String sql = "delete from inzeratKaravan where id = ?";
        jdbcTemplate.update(sql, inzerat.getId());
    }

    @Override
    public List<InzeratKaravan> dajPodlaPouzivatela(Long idP) {
        String sql = "SELECT * FROM inzeratKaravan where idP = ?";
        BeanPropertyRowMapper<InzeratKaravan> mapper = BeanPropertyRowMapper.newInstance(InzeratKaravan.class);
        return jdbcTemplate.query(sql, mapper,idP);
    }
    
}
