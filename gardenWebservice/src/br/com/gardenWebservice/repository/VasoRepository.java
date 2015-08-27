package br.com.gardenWebservice.repository;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

import br.com.gardenWebservice.dao.Fabrica;
import br.com.gardenWebservice.entity.Vaso;

public class VasoRepository {
	
	private JdbcTemplate jt = new JdbcTemplate();
	
	public List<Vaso> buscaVasos(int idUser, int idVaso){
		
		List<Vaso> vasos = new ArrayList<Vaso>();
		String sql = "SELECT * FROM connected_garden.vaso";
		if(idVaso > 0){
			sql += " where id = " + idVaso; 
		}
		try {
			jt = new JdbcTemplate(Fabrica.getDataSource());			
			List<Map<String, Object>> result = jt.queryForList(sql);			
			
			for(Map<String, Object> map: result){
				Vaso vaso = new Vaso();
				vaso.setId(((Integer) map.get("id")).longValue());
				vaso.setDescricao((String) map.get("descricao"));
				vaso.setMac1((String) map.get("mac1"));
				vaso.setMac2((String) map.get("mac2"));
				vaso.setTemp((int) map.get("temp"));
				vaso.setUmidSolo((int) map.get("umidsolo"));
				vaso.setUmidAr((int) map.get("umidar"));
				vaso.setLuz((int) map.get("luz"));
				vaso.setBomba((int) map.get("bomba"));
				vaso.setBombaAT((int) map.get("bombaAT"));
				vaso.setAtivo((int) map.get("ativo"));				
								
				vasos.add(vaso);				
			}		
		
		} catch (SQLException e) {			
			e.printStackTrace();
		} finally{
			
		}		
		
		return vasos;
	}
	
	public void inserirVaso(Vaso vaso){
		String sql = " INSERT INTO `connected_garden`.`vaso` (`id`, `descricao`, `mac1`, `mac2`, `temp`, `umidSolo`, `umidAr`, `luz`, `bomba`, `bombaAT`, `ativo`) " +
				"VALUES ('" 
				+ vaso.getId() + "', '" 
				+ vaso.getDescricao() + "', '" 
				+ vaso.getMac1() + "', '" 
				+ vaso.getMac2() + "', '" 
				+ vaso.getTemp() + "', '" 
				+ vaso.getUmidSolo() + "', '" 
				+ vaso.getUmidAr() + "', '" 
				+ vaso.getLuz() + "', '" 
				+ vaso.getBomba() + "', '" 
				+ vaso.getBombaAT() + "', '" 
				+ vaso.getAtivo() + "')";
		
		try {
			jt = new JdbcTemplate(Fabrica.getDataSource());
			jt.execute(sql);
			
			//jt.getDataSource().getConnection().commit();
			//jt.getDataSource().getConnection().close();
			
		} catch (SQLException e) {			
			e.printStackTrace();
		}		
	}
	
	public void updateVaso(Vaso v){
		
		String sql = " UPDATE `connected_garden`.`vaso` " +
				"SET `" +
				"descricao`='" + v.getDescricao() + "', `" +
				"mac1`='" + v.getMac1() + "', `" +
				"mac2`='" + v.getMac2() + "', `" +
				"temp`='" + v.getTemp() + "', `" +
				"umidSolo`='" + v.getUmidSolo() + "', `" +
				"umidAr`='" + v.getUmidAr() + "', `" +
				"luz`='" + v.getLuz() + "', `" +
				"bomba`='" + v.getBomba() + "', `" +
				"bombaAT`='" + v.getBombaAT() + "', `" +
				"ativo`='" + v.getAtivo() + "' " +
				"WHERE `id`='" + v.getId() + "'";
		
		try {
			jt = new JdbcTemplate(Fabrica.getDataSource());
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		jt.update(sql);
		
	}
	
	public void deletVaso(int idvaso){
		
		String sql = " DELETE FROM `connected_garden`.`vaso` WHERE `id`='" + idvaso + "'";
		try {
			jt = new JdbcTemplate(Fabrica.getDataSource());
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		jt.update(sql);
		
	}
	
}
