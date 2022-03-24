package Gradle1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestTest1 {

private static Test1 obj;
	
	@Before
    public static void init()
    {
    	obj = new Test1();
    }
	
	
	@Test
	void testSum() {
	
		int actualresult = obj.sum(33, 4);
		
		int expectedResult = 37;
		
		assertEquals(expectedResult, actualresult);
		
	}


}
