package com.wanggd.common;

import java.util.List;

public interface UserService {
	public void add(User u);
	public User find(String id);
	public List<User> findByName(String name);

}
