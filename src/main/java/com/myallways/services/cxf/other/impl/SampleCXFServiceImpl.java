package com.myallways.services.cxf.other.impl;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.jws.WebService;

import com.myallways.services.cxf.other.ISampleCXFService;
import com.myallways.services.cxf.other.bind.User;

@WebService(endpointInterface = "com.myallways.services.cxf.other.ISampleCXFService", serviceName = "SampleCXFService")
public class SampleCXFServiceImpl implements ISampleCXFService {
	Map<Integer, User> users = new LinkedHashMap<Integer, User>();

	public String sayHi(String text) {
		System.out.println("sayHi called");
		return "Hello " + text;
	}

	public String sayHiToUser(User user) {
		System.out.println("sayHiToUser called");
		users.put(users.size() + 1, user);
		return "Hello " + user.getName();
	}

	public Map<Integer, User> getUsers() {
		System.out.println("getUsers called");
		return users;
	}

}
