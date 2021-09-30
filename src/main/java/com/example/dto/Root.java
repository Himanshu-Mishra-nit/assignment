package com.example.dto;

public class Root{
	private String cod;
	private double message;
	private int cnt;
	private java.util.List<List> list;

	public String getCod() {
		return cod;
	}

	public void setCod(String cod) {
		this.cod = cod;
	}

	public double getMessage() {
		return message;
	}

	public void setMessage(double message) {
		this.message = message;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	public java.util.List<List> getList() {
		return list;
	}

	public void setList(java.util.List<List> list) {
		this.list = list;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	private City city;
	}