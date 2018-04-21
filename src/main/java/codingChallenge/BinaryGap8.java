package codingChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.ToIntFunction;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BinaryGap8 {

	public static <T> void main(String[] args) {
		//2,147,483,647

		String str = Integer.toBinaryString(2_147_400_000);
		System.out.println(str);
		
		/*Pattern p = Pattern.compile("0+");
		Matcher matcher = p.matcher(str);
		ArrayList<String> al = new ArrayList<>();
		while (matcher.find()) {
			System.out.println(matcher.group());
			al.add(matcher.group());			
		}
		Collections.sort(al);
		System.out.println(al.get(al.size()-1).length());*/		
		
		int i = Arrays.stream(str.split("1+")).mapToInt(String::length).max().orElse(0);
		System.out.println(i);
		
		Arrays.stream(str.split("1+")).mapToInt(String::length).forEach(System.out :: println);;
		//System.out.println(b);
		
	}

}
