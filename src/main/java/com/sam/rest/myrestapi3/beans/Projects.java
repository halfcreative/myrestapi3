package com.sam.rest.myrestapi3.beans;

import javax.persistence.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="PROJECTS")
public class Projects implements Serializable{

	private static final long serialVersionUID = -2028897003623816708L;

	@Id
	@SequenceGenerator(name = "PROJECT_SEQUENCE", sequenceName="PROJECT_SEQUENCE", allocationSize = 1)
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "PROJECT_SEQUENCE")
	@Column(name="PROJECT_ID")
	private int projectId;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="DESCRIPTION")
	private String description;
	
	@Column(name="PROJECT_URL_HOST_NAME")
	private String urlName;
	
	@Column(name="PROJECT_URL")
	private String url;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="USER_ID")
	private Users user;
	
	@ManyToMany(cascade= {CascadeType.PERSIST,CascadeType.MERGE})
	@JoinTable(name="PROJECT_TECH",joinColumns = @JoinColumn(name="PROJECT_ID"),inverseJoinColumns = @JoinColumn(name="TECH_ID"))
	private List<Tech> techs = new ArrayList<>();
	
	public void addTech(Tech tech) {
		techs.add(tech);
	}
	public void removeTech(Tech tech) {
		techs.remove(tech);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getProjectId() {
		return projectId;
	}
	public List<Tech> getTechs() {
		return techs;
	}
	public String getUrlName() {
		return urlName;
	}
	public void setUrlName(String urlName) {
		this.urlName = urlName;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
}
