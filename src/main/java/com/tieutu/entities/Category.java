package com.tieutu.entities;
// Generated May 20, 2017 12:46:27 AM by Hibernate Tools 5.2.1.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Category generated by hbm2java
 */
@Entity
@Table(name = "category", catalog = "store_manager")
public class Category implements java.io.Serializable {

	private int id;
	private String cateName;
	private String description;
	private Set<Items> itemses = new HashSet<Items>(0);
	private Set<Items> itemses_1 = new HashSet<Items>(0);

	public Category() {
	}

	public Category(int id, String cateName) {
		this.id = id;
		this.cateName = cateName;
	}

	public Category(int id, String cateName, String description, Set<Items> itemses, Set<Items> itemses_1) {
		this.id = id;
		this.cateName = cateName;
		this.description = description;
		this.itemses = itemses;
		this.itemses_1 = itemses_1;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "cate_name", nullable = false)
	public String getCateName() {
		return this.cateName;
	}

	public void setCateName(String cateName) {
		this.cateName = cateName;
	}

	@Column(name = "description")
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "category")
	public Set<Items> getItemses() {
		return this.itemses;
	}

	public void setItemses(Set<Items> itemses) {
		this.itemses = itemses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "category")
	public Set<Items> getItemses_1() {
		return this.itemses_1;
	}

	public void setItemses_1(Set<Items> itemses_1) {
		this.itemses_1 = itemses_1;
	}

}
