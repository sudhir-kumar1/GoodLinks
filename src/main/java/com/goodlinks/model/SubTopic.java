package com.goodlinks.model;
// Generated Nov 2, 2018 6:00:00 PM by Hibernate Tools 5.3.0.Beta2

import java.util.HashSet;
import java.util.Set;

/**
 * SubTopic generated by hbm2java
 */
public class SubTopic implements java.io.Serializable {

	private static final long serialVersionUID = 2469162355410857557L;
	private Integer id;
	private Topic topic;
	private String name;
	private String description;
	private Set<WebLink> webLinks = new HashSet<>(0);

	public SubTopic() {
	}

	public SubTopic(Topic topic, String name, String description, Set<WebLink> webLinks) {
		this.topic = topic;
		this.name = name;
		this.description = description;
		this.webLinks = webLinks;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Topic getTopic() {
		return this.topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
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

	public Set<WebLink> getWebLinks() {
		return this.webLinks;
	}

	public void setWebLinks(Set<WebLink> webLinks) {
		this.webLinks = webLinks;
	}

}
