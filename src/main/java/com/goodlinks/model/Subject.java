package com.goodlinks.model;
// Generated Nov 2, 2018 6:00:00 PM by Hibernate Tools 5.3.0.Beta2

import java.util.HashSet;
import java.util.Set;

/**
 * Subject generated by hbm2java
 */
public class Subject implements java.io.Serializable {

	private static final long serialVersionUID = -228343150716753130L;
	private Integer id;
	private String name;
	private String description;
	private Set<Topic> topics = new HashSet<Topic>(0);

	public Subject() {
	}

	public Subject(String name, String description, Set<Topic> topics) {
		this.name = name;
		this.description = description;
		this.topics = topics;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<Topic> getTopics() {
		return this.topics;
	}

	public void setTopics(Set<Topic> topics) {
		this.topics = topics;
	}

}
