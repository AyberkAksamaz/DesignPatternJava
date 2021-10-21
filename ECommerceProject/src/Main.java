import business.abstracts.UserService;
import business.concretes.UserCheckManager;
import business.concretes.UserManager;
import business.concretes.VerificationMailManager;
import core.JGoogleManagerAdapter;
import core.LoginService;
import dataAccess.concretes.HibernateUserDao;
import entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		User user = new User(1, "ayberk", "aksamaz", "ayberk@aksamaz.com", "123456");
		UserService userManager = new UserManager(new UserCheckManager(),
												  new VerificationMailManager(),
												  new HibernateUserDao());
		
		userManager.signup(user);
		userManager.signin(user);
		
		User user2 = new User(1, "gfds", "aksamgfdsgfaz", "ayberk@aksamaz.com", "123456");
		LoginService loginService = new JGoogleManagerAdapter();
		loginService.signIn(user2);
		
	}

}
