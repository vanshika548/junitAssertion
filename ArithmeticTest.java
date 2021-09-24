package main;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import junit.framework.Assert;

@RunWith(Parameterized.class)
class ArithmeticTest {
	
	private int firstNumber;
	private int secondNumber;
	private int expectedResult;
	private Arithmetic arithmetic;
	
	public ArithmeticTest(int firstNumber, int secondNumber, int expectedResult) {
		super();
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
		this.expectedResult = expectedResult;
	}

	@Before
	public void initialize() {
		arithmetic = new Arithmetic();
	}
	
	@Parameterized.Parameters
	public static Collection input() {
		return Arrays.asList(new Object[][] {{1,2,3}, {11,22,33}, {111,222,333},{10,9,19},
			{100,9,109}});
	}

	@Test
	void testArithmetic() {
		System.out.println("Sum of numbers = : "+ expectedResult);
		Assert.assertEquals(expectedResult,arithmetic.sum(firstNumber,secondNumber));
	}

}
