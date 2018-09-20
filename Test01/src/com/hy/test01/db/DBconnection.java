package com.hy.test01.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnection {
	static Connection conn=null;

	static{
		String driver = "com.mysql.jdbc.Driver";
        // URL指向要访问的数据库名scutcs
        String url = "jdbc:mysql://127.0.0.1:3306/student";
        // MySQL配置时的用户名
        String user = "root"; 
        // MySQL配置时的密码
        String password = "lanxin";
        try { 
         // 加载驱动程序
         Class.forName(driver);
         // 连续数据库
         conn = DriverManager.getConnection(url, user, password);
	    }catch(Exception e){
	    	e.printStackTrace();
	    	System.out.println("数据库连接有异常");
        }
    }
	
	public static Connection getConn(){
		return conn;
	}
}
