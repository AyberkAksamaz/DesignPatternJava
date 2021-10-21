package business.abstracts;

import entities.concretes.User;

public interface UserCheckService {

	 boolean checkName(User user);
	 boolean checkpassword(User user);
	 boolean checkEmail(User user);
	 boolean isValid(User user);
}
