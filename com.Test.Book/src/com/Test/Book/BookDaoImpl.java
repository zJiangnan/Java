package com.Test.Book;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * 对数据库进行增加
 * @author Z
 *
 */
public class BookDaoImpl implements BookDao {
	
	public int bookAdd(Book book) {
		Connection con = DBUtil.getCon();
		String sql = "insert bookinfo values(null,?,?,?)";
		PreparedStatement pstm;
		int r = -1;
		try {
			pstm = con.prepareStatement(sql);
			pstm.setString(1,book.getBookName());
			pstm.setString(2, book.getAuthor());
			pstm.setDouble(3, book.getPrice());
			r = pstm.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return r;
	}
	
	
}
