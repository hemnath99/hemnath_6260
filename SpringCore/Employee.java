package com.bean;

import java.util.*;

public class Employee {
	private int id;
	private String name;
	private List<String>dept; 
	private Set<String> email; 
	private Map<Integer,String>dictionary;

	Place place;
	
	public Employee(Place place) {
		super();
		this.place = place;
	}


	public Place getPlace() {
		return place;
	}


	public void setPlace(Place place) {
		this.place = place;
	}


	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Employee(int id, String name, List<String> dept, Set<String> email, Map<Integer, String> dictionary) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.email = email;
		this.dictionary = dictionary;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public List<String> getDept() {
		return dept;
	}


	public void setDept(List<String> dept) {
		this.dept = dept;
	}


	public Set<String> getEmail() {
		return email;
	}


	public void setEmail(Set<String> email) {
		this.email = email;
	}


	public Map<Integer, String> getDictionary() {
		return dictionary;
	}


	public void setDictionary(Map<Integer, String> dictionary) {
		this.dictionary = dictionary;
	}
	
	
}
