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
		@Override
		public void insertMovie(Movie movie) {
			String sql = "insert into movie(movie_id,title,price) values (movie_seq.nextval, ?,?)";
			PreparedStatement pstmt = null;
			OracleDBConnection odc = null;
			
			try { 
				odc = new OracleDBConnection();
				odc.getConnection().setAutoCommit(false);//트랜젝션 시작 기록시작
				pstmt = odc.getConnection().prepareStatement(sql);
				pstmt.setString(1,movie.getTitle());
				pstmt.setInt(2,movie.getPrice());
				pstmt.executeUpdate();
				odc.getConnection().commit(); // 트랜잭션 종료
				pstmt.close();
			} catch (SQLException e) {
				System.out.println("sql 에러 발생:" + e);
			} finally {
				odc.close();
			}
		}
		
		@Override
			public Movie detailMove(int id) {
				return null;
			}
		
		@Override
			public void updateMovie(Movie movie) {
				
			}
		
		@Override
			public void deleteMovie(int id) {
				
			}
		
}

























