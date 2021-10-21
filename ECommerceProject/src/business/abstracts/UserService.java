package business.abstracts;

import entities.concretes.User;

public interface UserService {

	void signin(User user);
	void signup(User user);
}
