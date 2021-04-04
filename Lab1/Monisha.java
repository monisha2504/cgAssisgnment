package Lab1;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Monisha {

	public static void main(String[] args) {
		Pattern pattern=Pattern.compile("[A-Za-z]+\\.");
		Matcher matcher=pattern.matcher("Mr.");
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
