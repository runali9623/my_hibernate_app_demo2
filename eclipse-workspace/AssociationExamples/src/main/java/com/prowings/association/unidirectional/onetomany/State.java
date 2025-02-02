package com.prowings.association.unidirectional.onetomany;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class State {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column
	private String name;
	@Column
	private long population;
	

	public State() {
		super();

	}


	public State(long id, String name, long population) {
		super();
		this.id = id;
		this.name = name;
		this.population = population;
	}


	public State(String name, long population) {
		super();
		this.name = name;
		this.population = population;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public long getPopulation() {
		return population;
	}


	public void setPopulation(long population) {
		this.population = population;
	}

	@Override
	public String toString() {
		return "State [id=" + id + ", name=" + name + ", population=" + population + "]";
	}

}
