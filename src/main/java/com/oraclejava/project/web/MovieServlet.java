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
			action = "list";//�⺻ �׼��� ����� �������°�  ���� list�����ش�
		}
		switch (action) {
		case "write":
			writeMovie(req,resp);
			break;
		case "list":
			listMovie(req, resp);
			break;
		}
	}
	
	private void writeMovie(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/view/movie.jsp").forward(req, resp);
		
		
	}

	private void listMovie(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		MovieDAO movieDAO = new MovieDAOImpl();
		List<Movie> movieList = movieDAO.selectMovieAll();
		
		req.setAttribute("movieList", movieList);
		req.getRequestDispatcher("/WEB-INF/view/movie.jsp").forward(req, resp);
	
	}
	
}














