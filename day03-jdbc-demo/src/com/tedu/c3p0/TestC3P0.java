package com.tedu.c3p0;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.tedu.demo.JdbcUtil1;

public class TestC3P0 {
	@Test
	public void findById() {
		Connection conn=null;
		Statement stat=null;
		ResultSet rs=null;
		//创建一个连接池
		ComboPooledDataSource pool = new ComboPooledDataSource(); 
		try {
			//从线程池中获取连接
			conn=pool.getConnection();
			//注册驱动并获取连接
			conn=JdbcUtil1.getConn();
			//获取传感器并执行sql语句
			stat=conn.createStatement();
			String sql="select * from account where id=1";
			rs=stat.executeQuery(sql);
			//处理结果
			if (rs.next()) {
				int id=rs.getInt("id");
				String name =rs.getString("name");
				double money=rs.getDouble("money");
				System.out.println(id+":"+name+":"+money);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
