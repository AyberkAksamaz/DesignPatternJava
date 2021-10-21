package dataAccess.concretes;

import java.util.List;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class HibernateUserDao implements UserDao{

	@Override
	public void add(User user) {
		System.out.println("User added with Hibernate.");
		
	}

	@Override
	public void delete(User user) {
		System.out.println("User deleted with Hibernate.");
		
	}

	@Override
	public void update(User user) {
		System.out.println("User updated with Hibernate.");
		
	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
