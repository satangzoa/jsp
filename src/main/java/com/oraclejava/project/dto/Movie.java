package com.oraclejava.project.dto;

public class Movie { //table movie
	
	private int movie_id; //��ȭ ���̵�
	private String title; // ��ȭ ����
	private int price; // ��ȭ ����
	private String synopsis; // �ٰŸ�
	
	//gettter.setter �߰�
	
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
	public String getSynopsis() {
		return synopsis;
	}
	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}
	
	
	
	
}
