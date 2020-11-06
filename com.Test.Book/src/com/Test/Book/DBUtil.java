package com.Test.Book;
/**
 * 数据库连接
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
//	加载驱动程序的字段值
	static String className = "com.mysql.cj.jdbc.Driver";
//	连接数据库的URL的字段值
	static String url = "jdbc:mysql://127.0.0.1:3306/dabook?useSSL=true&serverTimezone=GMT";
//	连接数据库的用户名的字段值
	static String root = "root";
//	连接数据库的密码的字段值
	static String pwd = "jiangnan0711";
//	使用静态代码块加载驱动程序
	static {
		try {
//			加载驱动程序
			Class.forName(className);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
//	将连接数据库写成静态方法需要时直接调用
	public static Connection getCon() {
		Connection con = null;
		try {
//			使用DriverManager类的getConnection()方法与本地数据库连接
			con = DriverManager.getConnection(url,root,pwd);
			con.close();//关闭数据库
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
}
