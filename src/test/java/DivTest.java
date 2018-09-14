package test;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

import main.java.FunKw;

class DivTest {

	@Test
	public void divisionTest() {
	
		 int result = FunKw.division(4,3);
	        int expectedResult = 3;
	        assertEquals(result, expectedResult);
	        
	}

}
