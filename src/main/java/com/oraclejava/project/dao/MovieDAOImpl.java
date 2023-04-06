package com.oraclejava.project.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.oraclejava.project.dto.Movie;

public class MovieDAOImpl implements MovieDAO{ //ctrl space 누른후 override 한다
@Override
public List<Movie> selectMovieAll() {

	List<Movie> list = new ArrayList<>();
	String sql = "select * from movie";
	PreparedStatement pstmt = null;
	OracleDBConnection odc = null;
	
	try {
		odc = new OracleDBConnection();
		pstmt = odc.getConnection().prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {
			Movie movie = new Movie();
			movie.setMovie_id(rs.getInt("movie_id"));
			movie.setTitle(rs.getString("title"));
			movie.setPrice(rs.getInt("price"));
			list.add(movie);
		}
		rs.close();
		pstmt.close();
	} catch(SQLException e) {
		System.out.println("sql 에러 발생:" + e);
	} finally {
		odc.close();
	}
	
	
	return list;
}
	
}










