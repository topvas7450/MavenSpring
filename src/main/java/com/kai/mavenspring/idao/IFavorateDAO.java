package com.kai.mavenspring.idao;

import java.util.List;

import com.kai.mavenspring.bean.Favorate;

/**
 * 
 * @author jones
 *
 */
public interface IFavorateDAO {
	public List<Favorate> findAll(int pageSize, int page);
	public Favorate find(Integer id);
	public void insert(Favorate favorate);
	public void update(Favorate favorate);
	public void delete(Favorate favorate);
}
