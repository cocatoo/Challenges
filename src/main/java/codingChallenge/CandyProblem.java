package codingChallenge;

/*
 * Duration : 20min
 * 
 * Problem : 
 * You are given startingAmount of candies. 
 * Whenever you eat a certain number of candies(newEvery), you get an additional candy.
 * What is the maximum number of candies you can eat?
 * 
 * For example if startingAmount = 3 and newEvery = 2, you can eat 5 candies in total:
 * Eat 2. Get 1. Remaining 2.
 * Eat 2. Get 1. Remaining 1.
 * Eat 1 * 
 */

public class CandyProblem {

	public static void main(String[] args) {
		System.out.println(countCandies(6, 2)); 		
	}

	public static int countCandies(int startingAmount, int newEvery) {		
		int a = 0;

		while(startingAmount >= newEvery) {
			startingAmount = startingAmount - newEvery + 1;
			a += newEvery;
		}

		if(startingAmount > 0) {
			a += startingAmount; 
		}

		return a;		
	}

}
