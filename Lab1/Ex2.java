package Lab1;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex2 {

	public static void main(String[] args) {
		Pattern pattern=Pattern.compile("[A-za-z]+\\.");
		Matcher matcher=pattern.matcher("Mrs.");
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
