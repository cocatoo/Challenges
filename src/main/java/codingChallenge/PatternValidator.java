package codingChallenge;

/*
Find if the given pattern is valid or not.
*/

import java.util.Stack;

public class PatternValidator {

	public static void main(String[] args) {

		String stringPattern = "((({}[]()([()]))))()";

		System.out.println(isValidPattern(stringPattern));


	}

	public static boolean isValidPattern(String pattern){

		String[] stringArr = pattern.split("");
		boolean isValid = true;

		if(stringArr.length % 2 > 0) {
			return false;
		}

		Stack stack = new Stack<>();

		for (int i = 0; i < stringArr.length; i++) {

			switch(stringArr[i]) {
			case "[" : stack.push("["); break;

			case "{" : stack.push("{"); break;

			case "(" : stack.push("("); break;

			case ")" : 	{

				if("(".equals((String) stack.pop())) {					
					break;
				}
				return false; 
			}
			case "}" :{

				if("{".equals((String) stack.pop())) {
					break;
				}
				return false; 
			}
			case "]" :	{

				if("[".equals((String) stack.pop())) {
					break;
				}
				return false; 
			}
			}
		}

		return isValid;

	}

}
