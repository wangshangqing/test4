package com.hy.test01.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hy.test01.bean.Sp;
import com.hy.test01.db.DBconnection;

public class StudentDao {
	public List<Sp> queryAllSp(){
		Connection conn=DBconnection.getConn();
		String sql="select * from sp";
		List<Sp> list=new ArrayList<Sp>();
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()){
				Sp sp=new Sp();
				sp.setId(rs.getInt(1));
				sp.setSname(rs.getString(2));
				list.add(sp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	/**
	 * 添加商品
	 * @param sp
	 */
	public void addGoods(Sp sp){
		Connection conn=DBconnection.getConn();
		String sql="insert into sp(sname,price,count,typeid,notsell) values(?,?,?,?,?)";
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1,sp.getSname());
			ps.setFloat(2,sp.getPrice());
			ps.setInt(3,sp.getCount());
			ps.setInt(4,sp.getTypeid());
			ps.setInt(5, sp.getNotSell());
			int num=ps.executeUpdate();
			if(num>=1){
				System.out.println("保存成功");
			}else{
				System.out.println("保存失败");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	/**
	 * 
	 * @return2018年4月19日List<Sp>
	 */
	public Sp querySpById(int id){
		Connection conn=DBconnection.getConn();
		String sql="select * from sp where id=?";
		Sp sp=new Sp();
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setInt(1,id);
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()){
				sp.setId(rs.getInt(1));
				sp.setSname(rs.getString(2));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return sp;
	}
}
