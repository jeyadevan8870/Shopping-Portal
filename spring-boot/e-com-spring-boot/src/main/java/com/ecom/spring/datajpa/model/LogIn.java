package com.ecom.spring.datajpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "login")
public class LogIn {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "userName")
	private String userName;
	@Column(name = "password")
	private String password;
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public LogIn() {}
	

	public LogIn(String userName,String password) {
		this.userName = userName;
		this.password = password;
		
	}
	 @Override
		public String toString() {
			return "LogIn [id=" + id + ", userName=" + userName + ", password=" + password + "]";
		}

}
