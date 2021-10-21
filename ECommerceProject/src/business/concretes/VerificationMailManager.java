package business.concretes;

import java.util.ArrayList;
import java.util.List;

import business.abstracts.VerificationService;
import entities.concretes.User;

public class VerificationMailManager implements VerificationService{

	List<String> verificatedEmails = new ArrayList<String>();
	
	@Override
	public void sendMail(User user) {
		System.out.println(user.getEmail() + " Send mail");
		verifyEmail(user);
	}

	@Override
	public void verifyEmail(User user) {
		verificatedEmails.add(user.getEmail());
		
	}

	@Override
	public boolean isVerificated(User user) {
		if(verificatedEmails.contains(user.getEmail())) {
			return true;
		}
		return false;
	}

}
