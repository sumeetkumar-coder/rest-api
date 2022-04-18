package com.sumeet.webservice.model;

import java.util.Arrays;

public class User {

	private String userName;

	private char[] password;

	private long contactNo;

	private String address;
	
	public User(UserBuilder ub) {
		this.userName = ub.userName;
		this.password = ub.password;
		this.contactNo = ub.contactNo;
		this.address = ub.address;
		
	}

	public static class UserBuilder {

		private String userName;

		private char[] password;

		private long contactNo;

		private String address;
		
		public UserBuilder(String userName) {
			this.userName = userName;
			
		}
		
		public UserBuilder addPassword(char[] password) {
			this.password = password;
			return this;
		}
		
		public UserBuilder addContactNo(long contactNo) {
			this.contactNo = contactNo;
			return this;
		}
		
		public UserBuilder addAddress(String address) {
			this.address = address;
			return this;
		}
		
		public User build() {
			return new User(this);
		}

	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", password=" + Arrays.toString(password) + ", contactNo=" + contactNo
				+ ", address=" + address + "]";
	}
	
	

}
