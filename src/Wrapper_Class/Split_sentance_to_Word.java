package Wrapper_Class;

public class Split_sentance_to_Word {

	public static void main(String[] args) {
		String text="Java is a fun programming language";
		
		//split string from space
		String[] result = text.split(" ");
		System.out.print("reslut = ");
		for(String str: result) {
			System.out.print(str+ "," );
		}

	}

}
