package Lab1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex5 {
	public static void main(String[] args) {
		Pattern pattern=Pattern.compile("\\+\\s91\\s[0-9]{2}\\s[0-9]{4}\\s[0-9]{4}");
		Matcher matcher=pattern.matcher("+ 91 20 2623 1407");
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
