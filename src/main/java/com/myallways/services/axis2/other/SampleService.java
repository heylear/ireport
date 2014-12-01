package com.myallways.services.axis2.other;

import java.io.Serializable;

public class SampleService implements Serializable {

	private static final long serialVersionUID = 5680236668003869908L;
	
	
	public String sayHello(String username){
		return "Hello, Welcome, " + username;
	}
	
}
