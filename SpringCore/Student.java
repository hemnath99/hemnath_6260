package com.bean;

public class Student {
		private int id;
		private String name;
		private String phone;
		
		Place place; 
		
		public Student(Place place) {
			super();
			this.place = place;
		}


		public Place getPlace() {
			return place;
		}


		public void setPlace(Place place) {
			this.place = place;
		}


		public Student(int id, String name, String phone) {
			super();
			this.id = id;
			this.name = name;
			this.phone = phone;
		}


		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + ", phone=" + phone + "]";
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


		public String getPhone() {
			return phone;
		}


		public void setPhone(String phone) {
			this.phone = phone;
		}


		public Student() {
			super();
		}

}
