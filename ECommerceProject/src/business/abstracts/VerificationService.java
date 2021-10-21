package business.abstracts;

import entities.concretes.User;

public interface VerificationService {

	void sendMail(User user);
	void verifyEmail(User user);
	boolean isVerificated(User user);
}
