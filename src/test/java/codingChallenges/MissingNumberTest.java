package codingChallenges;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import codingChallenge.MissingNumber;


public class MissingNumberTest {
	
	@Before
	public void setup() {
		
	}

	
	@Test
	public void testSolution(){		
		assertEquals(8, MissingNumber.solution(new int[]{1,2,3,5,6,7,4,9}));		
	}

}
