package com.tedu.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.PreparedStatement;

public class JdbcUtil {
	public static Connection getConn() throws Exception {
		Class.forName("com.sql.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://jt_db?characterEncoding=utf-8","root","root");
		return conn;
	}
	public static void close(Connection conn,PreparedStatement ps,ResultSet rs) {
		if (rs!=null) {
			try {
				rs.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}finally {
				rs=null;
			}
			
		}
		if (ps!=null) {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				ps=null;
			}
		}
		if (conn!=null) {
			try {
				conn.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}finally {
				conn=null;
			}
		}
	}
}
