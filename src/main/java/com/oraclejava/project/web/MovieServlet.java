package com.oraclejava.project.web;

import java.io.*;
import java.util.*;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oraclejava.project.dao.*;
import com.oraclejava.project.dto.*;

@WebServlet("/MovieServlet")
public class MovieServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String action = req.getParameter("action");
		if(action == null) {
			action = "list";//기본 액션은 목록을 가져오는게  좋다 list보여준다
		}
		switch (action) {
		case "write":
			writeMovie(req,resp);
			break;
		case "search":
			searchMovie(req,resp);
			break;
		case "detail":
			detailMovie(req,resp);
			break;
		case "list":
			listMovie(req, resp);
			break;
		}
	}
	
	private void detailMovie(HttpServletRequest req, HttpServletResponse resp)  throws ServletException, IOException{
		MovieDAO movieDAO = new MovieDAOImpl();
		
		int id = Integer.parseInt(req.getParameter("id"));
		Movie movie = movieDAO.detailMovie(id);
		req.setAttribute("movie", movie);
		req.getRequestDispatcher("/WEB-INF/view/detail.jsp").forward(req, resp);
		
	}

	private void searchMovie(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		MovieDAO movieDAO = new MovieDAOImpl();
		String title = req.getParameter("title");
		List<Movie> movieList = movieDAO.searchMovie(title);
		
		req.setAttribute("movieList", movieList);
		req.getRequestDispatcher("/WEB-INF/view/movie.jsp").forward(req, resp);
	
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String action = req.getParameter("action");
		if(action == null) {
			action = "list";
		}
		switch (action) {
		case "write":
			createMovie(req,resp);
			break;
		case "update":
			updateMovie(req,resp);
			break;
		case "list":
			listMovie(req, resp);
			break;
		}
	
	}
	
	private void updateMovie(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		if(req.getParameter("update") != null) {
		//수정 버튼을 눌렀을 경우
		MovieDAO movieDAO = new MovieDAOImpl();
		Movie movie = new Movie();
		movie.setMovie_id(Integer.parseInt(req.getParameter("movie_id")));
		movie.setTitle(req.getParameter("title"));
		movie.setPrice(Integer.parseInt(req.getParameter("price")));
		movie.setSynopsis(req.getParameter("synopsis"));
		movieDAO.updateMovie(movie);
		} else if (req.getParameter("delete") != null) {
			//삭제 버튼을 눌렀을 경우
			MovieDAO movieDAO = new MovieDAOImpl();
			movieDAO.deleteMovie(Integer.parseInt(req.getParameter("movie_id")));
		}
		resp.sendRedirect("/movie/MovieServlet");
		
		
	}

	private void createMovie(HttpServletRequest req, HttpServletResponse resp)  throws ServletException, IOException{
		
		MovieDAO movieDAO = new MovieDAOImpl();
		Movie movie = new Movie();
		movie.setTitle(req.getParameter("title"));
		movie.setPrice(Integer.parseInt(req.getParameter("price")));
		movieDAO.insertMovie(movie);
		resp.sendRedirect("/movie/MovieServlet");
	}
	
	
	private void writeMovie(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/view/write.jsp").forward(req, resp);
		
		
	}

	private void listMovie(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		MovieDAO movieDAO = new MovieDAOImpl();
		List<Movie> movieList = movieDAO.selectMovieAll();
		
		req.setAttribute("movieList", movieList);
		req.getRequestDispatcher("/WEB-INF/view/movie.jsp").forward(req, resp);
	
	}
	
	


}














