package com.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Users {
	@Id
private int userId;
@Column
private String userName;

@ManyToMany

  List<Products>products;

public int getUserId() {
	return userId;
}

public void setUserId(int userId) {
	this.userId = userId;
}

public String getUserName() {
	return userName;
}

public void setUserName(String userName) {
	this.userName = userName;
}

public List<Products> getProducts() {
	return products;
}

public void setProducts(List<Products> products) {
	this.products = products;
}

@Override
public String toString() {
	return "Users [userId=" + userId + ", userName=" + userName + ", products=" + products + "]";
}

public Users(int userId, String userName, List<Products> products) {
	super();
	this.userId = userId;
	this.userName = userName;
	this.products = products;
}

public Users() {
	super();
	// TODO Auto-generated constructor stub
}
}