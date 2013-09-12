package com.kai.mavenspring.dao;

import java.util.List;
import java.util.Map;

import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

import com.kai.mavenspring.bean.Favorate;
import com.kai.mavenspring.idao.IFavorateDAO;

public class JdbcTemplateFavorateDAO implements IFavorateDAO {
	private JdbcTemplate jdbcTemplate;
    
    public void setDataSource(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

	public List<Favorate> findAll(int pageSize, int page) {
		// TODO Auto-generated method stub
		return null;
	}

	public Favorate find(Integer id) {
		List list = jdbcTemplate.queryForList("SELECT * FROM favorate WHERE id=?", id);
		
		for(int i = 0; i < list.size(); i++){
			Map map = (Map)list.get(i);
			Integer fid = new Integer(map.get("id").toString());
            String name = map.get("name").toString();
            String location = map.get("location").toString();
            String address = map.get("address").toString();
            String tel = map.get("tel").toString();
            String url = map.get("url").toString();
            
            Favorate favorate = new Favorate();
            favorate.setId(fid);
            favorate.setName(name);
            favorate.setLocation(location);
            favorate.setAddress(address);
            favorate.setTel(tel);
            favorate.setUrl(url);
            return favorate;
		}
		
		return null;
	}

	public void insert(Favorate favorate) {
		// TODO Auto-generated method stub

	}

	public void update(Favorate favorate) {
		// TODO Auto-generated method stub

	}

	public void delete(Favorate favorate) {
		// TODO Auto-generated method stub

	}

}
