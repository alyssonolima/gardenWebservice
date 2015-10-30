package br.com.gardenWebservice.repository;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

import br.com.gardenWebservice.dao.Fabrica;
import br.com.gardenWebservice.entity.Garden;

public class GardenRepository {

	
	private JdbcTemplate jt;
	
	public List<Garden> findGarden(String query1, String query2) throws SQLException{
		StringBuilder sql = new StringBuilder(
			" SELECT * " +
			" FROM connected_garden.garden garden " +
			" inner join connected_garden.user_garden us " +
			" WHERE 1=1 " );
		
		if(!query1.isEmpty())
			sql.append(query1);
		
		if(!query2.isEmpty())
			sql.append(query2);
		
		
		jt = new JdbcTemplate(Fabrica.getDataSource());
		List<Map<String, Object>> result = jt.queryForList(sql.toString());
		List<Garden> gardens = new ArrayList<Garden>();
		
		for(Map<String, Object> map: result){
			Garden garden = new Garden();
			garden.setId((int) map.get("id_garden"));
			garden.setIdUser((int) map.get("id_user"));
			garden.setDescription((String) map.get("description"));
			garden.setObs((String) map.get("obs"));
			garden.setIpServer((String) map.get("ip_server"));
			garden.setIpConcentrator((String) map.get("ip_concentrator"));
			Boolean active = (Boolean) map.get("active");
			garden.setActive(active);
			garden.setLastUpdate((Date) map.get("last_update"));
			
			gardens.add(garden);							
			
		}
	
		return gardens;
	}
	
	public void insertGarden(Garden garden) throws SQLException{
				  
		StringBuilder sql = new StringBuilder(
				
			" INSERT INTO `connected_garden`.`garden` " +
			" (`ID_USER`, `DESCRIPTION`, `OBS`, `IP_SERVER`, `IP_CONCENTRATOR`, `LAST_UPDATE`, `ACTIVE`)  " +
			" VALUES ('" + 
			garden.getIdUser() + "', '" + 
			garden.getDescription() + "', '" + 
			garden.getObs() + "', '" + 
			garden.getIpServer() + "', '" + 
			garden.getIpConcentrator() + "', '" + 
			new Timestamp(garden.getLastUpdate().getTime()) + "', " + 
			garden.isActive() + ")"
		);
		
		jt = new JdbcTemplate(Fabrica.getDataSource());
		jt.execute(sql.toString());
		jt.getDataSource().getConnection().close();		
	}
	
	public void updateGarden(Garden garden) throws SQLException{
		StringBuilder sql = new StringBuilder(
			" UPDATE `connected_garden`.`garden` " +
			" SET `" +
			" ID_USER`= " + garden.getIdUser() + ", `" +
			" DESCRIPTION`='" + garden.getDescription() + "', `" +
			" OBS`='" + garden.getObs() + "', `" +
			" IP_SERVER`='" + garden.getIpServer() + "', `" +
			" IP_CONCENTRATOR`='" + garden.getIpConcentrator() + "', ` " +
			" LAST_UPDATE`='" + new Timestamp(garden.getLastUpdate().getTime()) + "', `" +
			" ACTIVE`= " + garden.isActive() + " " +
			" WHERE `ID_GARDEN`= " + garden.getId() + ""				
		);
		
		jt = new JdbcTemplate(Fabrica.getDataSource());
		jt.update(sql.toString());
		jt.getDataSource().getConnection().close();		
	}
	
	public void deleteGarden(int id) throws SQLException{
		StringBuilder sql = new StringBuilder(
			" DELETE FROM `connected_garden`.`garden` " +
			" WHERE `ID_GARDEN`=" + id
		);
		
		jt = new JdbcTemplate(Fabrica.getDataSource());
		jt.update(sql.toString());
		jt.getDataSource().getConnection().close();						
	}
}
