package core;

import entities.concretes.User;

public interface LoginService {

	void signUp(User user);
	void signIn(User user);
}
