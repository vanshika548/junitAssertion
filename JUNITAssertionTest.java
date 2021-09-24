package main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class JUNITAssertionTest {

	@Test
	public void assertionTest() {
		String string1 = "Junit";
		String string2 = "Junit";	
		Object obj1 = new Object();
		Object obj2 = new Object();
		String string5 = null;
		int var1 = 1;
		int var2 = 2;
		int [] arithmeticArr1= {1,2,3};
		int [] arithmeticArr2= {1,2,3};
		
		Assert.assertEquals(string1,string2);
		Assert.assertSame(string1,string2);
		Assert.assertSame(obj1,obj2);
		Assert.assertNotSame(obj1,obj2);
		Assert.assertNotNull(string1);
		Assert.assertNull(string5);
		Assert.assertTrue(var1<var2);
		Assert.assertArrayEquals(arithmeticArr1,arithmeticArr2);
		
		
	}

}
