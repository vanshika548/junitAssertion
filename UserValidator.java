package main;

import java.util.regex.Pattern;

public class UserValidator {
	
	private static final String NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$";
	private static final String EMAIL_ADDRESS_PATTERN = "^[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)*"+
	                                                   "@([0-9a-zA-Z][-]?)+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?$";

	public boolean validateFirstName(String name) {
		// TODO Auto-generated method stub
		Pattern pattern = Pattern.compile(NAME_PATTERN);
		return pattern.matcher(name).matches();
	}

	public boolean validateEmailAddress(String email) {
		// TODO Auto-generated method stub
		Pattern pattern = Pattern.compile(EMAIL_ADDRESS_PATTERN);
		return pattern.matcher(email).matches();
	}

	public boolean validateLastName(String lastName) {
		// TODO Auto-generated method stub
		Pattern pattern = Pattern.compile(NAME_PATTERN);
		return pattern.matcher(lastName).matches();
	}

}
