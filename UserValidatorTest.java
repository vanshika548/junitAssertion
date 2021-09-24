package main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class UserValidatorTest {

	@Test
	void whenGivenFirstName_whenProper_shouldReturnTrue() {
		UserValidator userValidator = new UserValidator();
		boolean result = userValidator.validateFirstName("Vanshika");
		Assert.assertEquals(true, result);
	}
	
	@Test
	void whenGivenFirstName_whenShort_shouldReturnFalse() {
		UserValidator userValidator = new UserValidator();
		boolean result = userValidator.validateFirstName("Va");
		Assert.assertEquals(true, result);
	}
	
	@Test
	void whenGivenFirstName_whenWithSplChars_shouldReturnFalse() {
		UserValidator userValidator = new UserValidator();
		boolean result = userValidator.validateFirstName("Vanshi@ka");
		Assert.assertEquals(true, result);
	}
	
	@Test
	void whenGivenEmail_whenValid_shouldReturnTrue() {
		UserValidator userValidator = new UserValidator();
		boolean result = userValidator.validateEmailAddress("Vanshika678@gmail.com");
		Assert.assertEquals(true, result);
	}
	
	@Test
	void whenGivenLastName_whenValid_shouldReturnTrue() {
		UserValidator userValidator = new UserValidator();
		boolean result = userValidator.validateLastName("Rastogi");
		Assert.assertTrue( result);
	}
	
	@Test
	void whenGivenLastName_whenNotValid_shouldReturnFalse() {
		UserValidator userValidator = new UserValidator();
		boolean result = userValidator.validateLastName("Ra");
		Assert.assertFalse( result);
	}

}
