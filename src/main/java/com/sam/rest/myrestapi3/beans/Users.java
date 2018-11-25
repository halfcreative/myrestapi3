package com.sam.rest.myrestapi3.beans;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="USERS")
public class Users implements Serializable{

	
	private static final long serialVersionUID = 1284422860935852482L;

	@Id
	@SequenceGenerator(name = "USER_SEQUENCE", sequenceName="USER_SEQUENCE", allocationSize = 1)
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "USER_SEQUENCE")
	@Column(name="USER_ID")
	private int id;
	
	@Column(name="NAME")
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Users() {
		super();
	}

	public int getUserId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
