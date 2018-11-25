package com.sam.rest.myrestapi3.beans;

import javax.persistence.*;

@Entity
@Table(name="CREDS")
public class Creds {
	
	@Id
	@SequenceGenerator(name = "CREDS_SEQUENCE", sequenceName="CREDS_SEQUENCE", allocationSize = 1)
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "CREDS_SEQUENCE")
	@Column(name="CREDS_ID")
	private int credsId;

	@Column(name="USERNAME")
	private String username;

	public void setUsername(String username) {
		this.username = username;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	@Column(name="PASSWORD")
	private String password;
	
	@OneToOne(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinColumn(name="USERS")
	private Users user;
	
	public Users getUser() {
		return user;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
