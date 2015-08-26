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
			sql += " where idvaso = " + idVaso; 
		}
		try {
			jt = new JdbcTemplate(Fabrica.getDataSource());			
			List<Map<String, Object>> result = jt.queryForList(sql);			
			
			for(Map<String, Object> map: result){
				Vaso vaso = new Vaso();
				vaso.setId(((Integer) map.get("idvaso")).longValue());
				vaso.setDescricao((String) map.get("descricao"));
				vaso.setMAC((String) map.get("mac"));
				vaso.setTemp((int) map.get("temp"));
				vaso.setUmidSolo((int) map.get("umidsolo"));
				vaso.setUmidAr((int) map.get("umidar"));
				vaso.setLuz((int) map.get("luz"));
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
		String sql = " INSERT INTO `connected_garden`.`vaso` (`idvaso`, `descricao`, `mac`, `temp`, `umidsolo`, `umidar`, `luz`, `ativo`)" +
				" VALUES ('" 
				+ vaso.getId() +"', '" 
				+ vaso.getDescricao() +"', '"
				+ vaso.getMAC() +"', '"
				+ vaso.getTemp() +"', '"
				+ vaso.getUmidSolo() +"', '"
				+ vaso.getUmidAr() +"', '"
				+ vaso.getLuz() +"', '"
				+ vaso.getAtivo() +"')";
		
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
				" SET `descricao`='" + v.getDescricao() +
				"', `mac`='" + v.getMAC() +
				"', `temp`='" + v.getTemp() +
				"', `umidsolo`='" + v.getUmidSolo() + 
				"', `umidar`='" + v.getUmidAr() + 
				"', `luz`='" + v.getLuz() + 
				"', `ativo`='" + v.getAtivo() + 
				"' WHERE `idvaso`='" + v.getId() + "'";
		
		try {
			jt = new JdbcTemplate(Fabrica.getDataSource());
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		jt.update(sql);
		
	}
	
	public void deletVaso(int idvaso){
		
		String sql = " DELETE FROM `connected_garden`.`vaso` WHERE `idvaso`='" + idvaso + "'";
		try {
			jt = new JdbcTemplate(Fabrica.getDataSource());
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		jt.update(sql);
		
	}
	
}
