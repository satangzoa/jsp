package com.oraclejava.project.dto;

public class Movie { //table movie
	
	private int movie_id; //영화 아이디
	private String title; // 영화 제목
	private int price; // 영화 가격
	
	//gettter.setter 추가
	
	public int getMovie_id() {
		return movie_id;
	}
	public void setMovie_id(int movie_id) {
		this.movie_id = movie_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	
}
