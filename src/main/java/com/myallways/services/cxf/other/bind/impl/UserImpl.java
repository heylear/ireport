package com.myallways.services.cxf.other.bind.impl;

import javax.xml.bind.annotation.XmlType;

import com.myallways.services.cxf.other.bind.User;

@XmlType(name = "User")
public class UserImpl implements User {
	private String name;

	public UserImpl() {
		super();
	}

	public UserImpl(String name) {
		super();
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
