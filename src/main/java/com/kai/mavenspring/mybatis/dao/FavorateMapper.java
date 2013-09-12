package com.kai.mavenspring.mybatis.dao;

import java.util.List;

import com.kai.mavenspring.bean.Favorate;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface FavorateMapper {
	@Insert("insert into favorate (id, name, location, address, tel, url) " +
			"values(#{id}, #{name}, #{location}, #{address}, #{tel}, #{url})")
	void insert(Favorate favorate);
	
	@Select("SELECT * FROM favorate WHERE id = #{favorateId}")
	Favorate getFavorate(@Param("favorateId") Integer id);
	
	@Select("SELECT * FROM favorate")
	List<Favorate> getFavorates();
}