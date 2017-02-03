package com.wanggd.common;

import java.util.List;

public interface UserService {
	
	public void add(User u);
	
	public List<User> find(String name);

}
