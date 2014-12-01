package com.myallways.services.cxf.other.bind.adapter;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import com.myallways.services.cxf.other.bind.User;
import com.myallways.services.cxf.other.bind.impl.UserImpl;

public class UserAdapter extends XmlAdapter<UserImpl, User>{

	@Override
	public UserImpl marshal(User v) throws Exception {
		if(v instanceof UserImpl)
			return (UserImpl) v;
		return new UserImpl(v.getName());
	}

	@Override
	public User unmarshal(UserImpl v) throws Exception {
		return v;
	}
	
}
