package com.Test.Book;
/**
 * ���ݿ�����
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
//	��������������ֶ�ֵ
	static String className = "com.mysql.cj.jdbc.Driver";
//	�������ݿ��URL���ֶ�ֵ
	static String url = "jdbc:mysql://127.0.0.1:3306/dabook?useSSL=true&serverTimezone=GMT";
//	�������ݿ���û������ֶ�ֵ
	static String root = "root";
//	�������ݿ��������ֶ�ֵ
	static String pwd = "jiangnan0711";
//	ʹ�þ�̬����������������
	static {
		try {
//			������������
			Class.forName(className);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
//	���������ݿ�д�ɾ�̬������Ҫʱֱ�ӵ���
	public static Connection getCon() {
		Connection con = null;
		try {
//			ʹ��DriverManager���getConnection()�����뱾�����ݿ�����
			con = DriverManager.getConnection(url,root,pwd);
			con.close();//�ر����ݿ�
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
}
