package org.comit.course.controller;

import java.util.Date;

public class User {
	
		int idUser;
		String firstName;
		String lastname ;
		String username ;
		String password ;
		Date birth;
		String statuse;
		
		
		public int getIdUser() {
			return idUser;
		}
		public void setIdUser(int idUser) {
			this.idUser = idUser;
		}
		
		
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastname() {
			return lastname;
		}
		public void setLastname(String lastname) {
			this.lastname = lastname;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public Date getBirth() {
			return birth;
		}
		public void setBirth(Date birth) {
			this.birth = birth;
		}
		public String getStatuse() {
			return statuse;
		}
		public void setStatuse(String statuse) {
			this.statuse = statuse;
		}
		@Override
		public String toString() {
			return "User [idUser=" + idUser + ", firstName=" + firstName + ", lastname=" + lastname + ", username="
					+ username + ", password=" + password + ", birth=" + birth + ", statuse=" + statuse + "]";
		}
		                

		
}
