package Regular_Expression;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.List;

public class JavaAlphanumericRegex {

	public static void main(String[] args) {
		List < String > names = new ArrayList < String >();
		
		names.add("Imarticus");
		names.add("Imarticus123");
		names.add("Imarticus------/////");//Incorrect
		
		String regex = "^[a-zA-Z0-9]+$";
		Pattern pattern = Pattern.compile(regex);
		for (String name: names) {
			Matcher matcher = pattern.matcher(name);
			System.out.println(matcher.matches());
		}

	}

}


