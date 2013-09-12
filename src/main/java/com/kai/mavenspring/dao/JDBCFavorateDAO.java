package com.kai.mavenspring.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.kai.mavenspring.bean.Favorate;
import com.kai.mavenspring.idao.IFavorateDAO;

public class JDBCFavorateDAO implements IFavorateDAO {
	private DataSource dataSource;
	   
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

	public void delete(Favorate favorate) {
		// TODO Auto-generated method stub

	}

	public Favorate find(Integer id) {
		Connection conn = null;
		PreparedStatement  pstmt = null;
		Favorate favorate = null;
        try {
        	String sql = "select * from favorate where id=?";
            conn = dataSource.getConnection();
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, id);
            
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
	            favorate = new Favorate();
	            favorate.setId(rs.getInt("id"));
	            favorate.setName(rs.getString("name"));
	            favorate.setLocation(rs.getString("location"));
	            favorate.setAddress(rs.getString("address"));
	            favorate.setTel(rs.getString("tel"));
	            favorate.setUrl(rs.getString("url"));
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if(pstmt != null) {
                try {
                    pstmt.close();
                }  
                catch(SQLException e) {
                    e.printStackTrace();
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                }
                catch(SQLException e) {
                    e.printStackTrace();
                }
            }
        }
		return favorate;
	}
	
	public List<Favorate> findAll(int pageSize, int page) {
		Connection conn = null;
		PreparedStatement  pstmt = null;
		List<Favorate> list = new ArrayList<Favorate>();
        try {
        	String sql = "select * from favorate";
            conn = dataSource.getConnection();
            pstmt = conn.prepareStatement(sql);
            
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
            	Favorate favorate = new Favorate();
	            favorate.setId(rs.getInt("id"));
	            favorate.setName(rs.getString("name"));
	            favorate.setLocation(rs.getString("location"));
	            favorate.setAddress(rs.getString("address"));
	            favorate.setTel(rs.getString("tel"));
	            favorate.setUrl(rs.getString("url"));
	            
	            list.add(favorate);
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if(pstmt != null) {
                try {
                    pstmt.close();
                }  
                catch(SQLException e) {
                    e.printStackTrace();
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                }
                catch(SQLException e) {
                    e.printStackTrace();
                }
            }
        }
		return list;
	}

	public void insert(Favorate favorate) {
		Connection conn = null;
		PreparedStatement  pstmt = null;
        try {
        	String sql = "INSERT INTO favorate(name,location,address,tel,url) VALUES(?,?,?,?,?)";
            conn = dataSource.getConnection();
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, favorate.getName());
            pstmt.setString(2, favorate.getLocation());
            pstmt.setString(3, favorate.getAddress());
            pstmt.setString(4, favorate.getTel());
            pstmt.setString(5, favorate.getUrl());
            
            pstmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if(pstmt != null) {
                try {
                    pstmt.close();
                }  
                catch(SQLException e) {
                    e.printStackTrace();
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                }
                catch(SQLException e) {
                    e.printStackTrace();
                }
            }
        } 
	}

	public void update(Favorate favorate) {
		// TODO Auto-generated method stub

	}	

}
