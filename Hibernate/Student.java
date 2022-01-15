package com.entity;

import javax.persistence.*;

@Entity
@Table(name="Student")
public class Student {
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private int roll;
	@Column
	private String firstname,lastname;
	@Column
	private String city;
	
	public Student(int roll, String firstname, String lastname, String city) {
		super();
		this.roll = roll;
		this.firstname = firstname;
		this.lastname = lastname;
		this.city = city;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", firstname=" + firstname + ", lastname=" + lastname + ", city=" + city
				+ ", getRoll()=" + getRoll() + ", getFirstname()=" + getFirstname() + ", getLastname()=" + getLastname()
				+ ", getCity()=" + getCity() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
}
