package com.myallways.services.cxf.other.bind.adapter;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import com.myallways.services.cxf.other.bind.User;
import com.sun.xml.internal.txw2.annotation.XmlElement;

@XmlType(name = "IntegerUserMap")
@XmlAccessorType(XmlAccessType.FIELD)
public class IntegerUserMap {
	
	@XmlElement(nillable = false,name = "entry")
	List<IntegerUserEntry> entries = new ArrayList<IntegerUserEntry>();
	
	static class IntegerUserEntry{
		
		@XmlElement(required = true, nillable = false)
		private
		Integer id;
		
		private User user;

		public User getUser() {
			return user;
		}

		public void setUser(User user) {
			this.user = user;
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}
		
	}
}
