package cn.hr.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtils {
	public static Connection getConnection() {
		Connection conn = null;
		//获取连接
		try {
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
			conn = DriverManager.getConnection("jdbc:ucanaccess://Hr.accdb");
			System.out.println("ok");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("failed");
		}
		return conn;
	}
	//关闭资源
	
	//关闭结果集
	public static void close(PreparedStatement ps) {
		try {
			if(ps!=null) ps.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	//关闭语句
	//关闭连接
		public static void close(ResultSet rs) {
			try {
				if(rs!=null) rs.close();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	//关闭连接
	public static void close(Connection conn) {
		try {
			if(conn!=null) conn.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	
}
