package business.concretes;

import business.abstracts.UserCheckService;
import business.abstracts.UserService;
import business.abstracts.VerificationService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class UserManager implements UserService{

	private UserCheckService userCheckService;
	private VerificationService verificationService;
	private UserDao userDao;
	
	
	public UserManager(UserCheckService userCheckService, VerificationService verificationService, UserDao userDao) {
		super();
		this.userCheckService = userCheckService;
		this.verificationService = verificationService;
		this.userDao = userDao;
	}

	@Override
	public void signin(User user) {
		if(verificationService.isVerificated(user)) {
			System.out.println("Confirmed.\nloggin....\n");
		} else if(!verificationService.isVerificated(user)) {
			System.out.println("Email is not confirmed!!\n");
		} else {
			System.out.println("User information is incorrect!!\n");
		}
		
	}

	@Override
	public void signup(User user) {
		if(userCheckService.isValid(user)) {
			verificationService.sendMail(user);
			System.out.println(user.getFirstName() + " :User added to system..");
			userDao.add(user);
			signin(user);
		}
		
	}

}
