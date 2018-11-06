package com.sam.rest.myrestapi3.beans;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="HISTORY")
public class History implements Serializable{

	private static final long serialVersionUID = 3202356537738523144L;
	
	@Id
	@SequenceGenerator(name = "HISTORY_SEQUENCE", sequenceName="HISTORY_SEQUENCE", allocationSize = 1)
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "HISTORY_SEQUENCE")
	@Column(name="HISTORY_ID")
	private int historyId;
	
	@Column(name="COMPANY_NAME")
	private String companyName;
	
	@Column(name="POSITION_TITLE")
	private String position;
	
	@Column(name="DESCRIPTION")
	private String description;
	
	@Column(name="START_DATE")
	private String start;
	
	@Column(name="END_DATE")
	private String end;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="USER_ID")
	private Users user;

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}

	public int getHistoryId() {
		return historyId;
	}

	public Users getUser() {
		return user;
	}
	

}
