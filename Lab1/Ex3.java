package Lab1;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex3 {

		public static void main(String[] args) {
			Pattern pattern=Pattern.compile("[A-za-z]+\\.\\s\\w{3}+\\s[A-za-z]+\\.");
			Matcher matcher=pattern.matcher("Mr. and Mrs.");
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
