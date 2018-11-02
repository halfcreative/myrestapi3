package com.sam.rest.myrestapi3.beans;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="TECH")
public class Tech implements Serializable {

	private static final long serialVersionUID = -3508242250727285505L;

	@Id
	@SequenceGenerator(name = "TECH_SEQUENCE", sequenceName="TECH_SEQUENCE", allocationSize = 1)
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "TECH_SEQUENCE")
	@Column(name="TECH_ID")
	private int techId;
	
	@Column(name="NAME")
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTechId() {
		return techId;
	}

}
