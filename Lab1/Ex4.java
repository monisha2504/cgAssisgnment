package Lab1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex4 {
	public static void main(String[] args) {
		Pattern pattern=Pattern.compile("[0-9]{3}-[0-9]{8}");
		Matcher matcher=pattern.matcher("020-26231407");
		if(matcher.matches())
		{
			System.out.println(matcher.group());
			
		}
		else
		{
			System.out.println("pattern is not matched");
		}
	
	}

}


