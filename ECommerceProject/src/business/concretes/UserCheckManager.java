package business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import business.abstracts.UserCheckService;
import entities.concretes.User;

public class UserCheckManager implements UserCheckService{

	List<String> listofEmails = new ArrayList<String>();
	
	@Override
	public boolean checkName(User user) {
		if(user.getFirstName().isEmpty() || user.getLastName().isEmpty()) {
			System.out.println("User name or last name is empty!");
			return false;
		} else {
			if(user.getFirstName().length() < 2 && user.getLastName().length() < 2) {
				System.out.println("User name or last name at least 2 character!");
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean checkpassword(User user) {
		if(user.getPassword().isEmpty() || user.getPassword().length() < 6) {
			System.out.println("Password is empty or at least 6 character!");
			return false;
		}
		return true;
	}

	@Override
	public boolean checkEmail(User user) {
		if(listofEmails.contains(user.getEmail())) {
			System.out.println("Mail address is been taken!");
			return false;
		}
		
		String regex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
		Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		
		if(user.getEmail().isEmpty()) {
			System.out.println("Email empty!");
			return false;
		} else {
			if(pattern.matcher(user.getEmail()).find() == false) {
				System.out.println("Email is not in the format!");
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean isValid(User user) {
		if(checkEmail(user) && checkName(user) && checkpassword(user)) {
			listofEmails.add(user.getEmail());
			return true;
		}
		return false;
	}

	
	
}














