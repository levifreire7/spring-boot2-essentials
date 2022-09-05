package com.levifreire.springboot2essentials.domain;

import java.io.Serializable;

public class Anime implements Serializable {
	private static final long serialVersionUID = 1L;

	private String name;

	public Anime(String name) {
		this.setName(name);
	}

	public Anime() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
