package com.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Products {
@Id
private int productId;
@Column
private String productName;

@ManyToMany

List<Users> user;

public int getProductId() {
	return productId;
}

public void setProductId(int productId) {
	this.productId = productId;
}

public String getProductName() {
	return productName;
}

public void setProductName(String productName) {
	this.productName = productName;
}

public List<Users> getUser() {
	return user;
}

public void setUser(List<Users> user) {
	this.user = user;
}

@Override
public String toString() {
	return "Products [productId=" + productId + ", productName=" + productName + ", user=" + user + "]";
}

public Products(int productId, String productName, List<Users> user) {
	super();
	this.productId = productId;
	this.productName = productName;
	this.user = user;
}

public Products() {
	super();
	// TODO Auto-generated constructor stub
}


}
