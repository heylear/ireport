package com.myallways.services.cxf.other.bind;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.myallways.services.cxf.other.bind.adapter.UserAdapter;

@XmlJavaTypeAdapter(UserAdapter.class)
public interface User {
	String getName();
}
