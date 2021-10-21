package core;

import entities.concretes.User;
import jGoogle.JGoogleManager;

public class JGoogleManagerAdapter implements LoginService{

	JGoogleManager googleManager = new JGoogleManager();
	@Override
	public void signUp(User user) {
		googleManager.signUp(user.getEmail(), user.getPassword());
		
	}

	@Override
	public void signIn(User user) {
		googleManager.signUp(user.getEmail(), user.getPassword());
		
	}

}
