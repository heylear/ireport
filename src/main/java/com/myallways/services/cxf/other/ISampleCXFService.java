package com.myallways.services.cxf.other;

import java.util.Map;

import javax.jws.WebService;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.myallways.services.cxf.other.bind.User;
import com.myallways.services.cxf.other.bind.adapter.IntegerUserMapAdapter;

@WebService
public interface ISampleCXFService {

	String sayHi(String text);

	/*
	 * Advanced usecase of passing an Interface in. JAX-WS/JAXB does not support
	 * interfaces directly. Special XmlAdapter classes need to be written to
	 * handle them
	 */
	String sayHiToUser(User user);

	/*
	 * Map passing JAXB also does not support Maps. It handles Lists great, but
	 * Maps are not supported directly. They also require use of a XmlAdapter to
	 * map the maps into beans that JAXB can use.
	 */
	@XmlJavaTypeAdapter(IntegerUserMapAdapter.class)
	Map<Integer, User> getUsers();

}
