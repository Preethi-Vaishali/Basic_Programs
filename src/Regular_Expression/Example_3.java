package Regular_Expression;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Arrays;
import java.util.List;

public class Example_3 {

	public static void main(String[] args) {
		List < String > words = Arrays.asList("One","Two","Three","Four","Five","Six","Seven","Maven","Amen","Eleven");
		Pattern p = Pattern.compile(".even");//reven, seven, ceven
		for(String word: words) {
			Matcher m = p.matcher(word);
			if(m.matches())
				System.out.printf("%s -> matches%n", word);
			else
				System.out.printf("%s -> does not matches%n", word);
		}
		

	}

}
