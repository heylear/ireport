package com.myallways.services.cxf.other;

import javax.xml.ws.Endpoint;

import org.junit.Before;
import org.junit.Test;

import com.myallways.services.cxf.other.impl.SampleCXFServiceImpl;

public class SampleCXFServiceImplTest {

	@Before
	public void setUp() throws Exception {
		/*SampleCXFServiceImpl implementor = new SampleCXFServiceImpl();
        String address = "http://localhost/cxf/services/SampleCXFService";
        Endpoint.publish(address, implementor);*/
	}

	@Test
	public void test() {
		System.out.println("test generating!");
	}

}
