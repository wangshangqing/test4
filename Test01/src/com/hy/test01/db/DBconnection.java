package com.hy.test01.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnection {
	static Connection conn=null;

	static{
		String driver = "com.mysql.jdbc.Driver";
        // URLָ��Ҫ���ʵ����ݿ���scutcs
        String url = "jdbc:mysql://127.0.0.1:3306/student";
        // MySQL����ʱ���û���
        String user = "root"; 
        // MySQL����ʱ������
        String password = "lanxin";
        try { 
         // ������������
         Class.forName(driver);
         // �������ݿ�
         conn = DriverManager.getConnection(url, user, password);
	    }catch(Exception e){
	    	e.printStackTrace();
	    	System.out.println("���ݿ��������쳣");
        }
    }
	
	public static Connection getConn(){
		return conn;
	}
}
