package com.taskmanager.ITTaskManagmentSystem.DTO;

import java.util.Objects;

import jakarta.persistence.Column;

public class UserDTO {
	private Integer userId;

	private String userName;

	private String passWord;

	private String email;
 
	private String role;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public int hashCode() {
		return Objects.hash(email, passWord, role, userId, userName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserDTO other = (UserDTO) obj;
		return Objects.equals(email, other.email) && Objects.equals(passWord, other.passWord)
				&& Objects.equals(role, other.role) && Objects.equals(userId, other.userId)
				&& Objects.equals(userName, other.userName);
	}

	public UserDTO(Integer userId, String userName, String passWord, String email, String role) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.passWord = passWord;
		this.email = email;
		this.role = role;
	}
	
	

}
