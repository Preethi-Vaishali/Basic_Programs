import java.util.Scanner;

public class To_find_All_IN_Char {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("String x= ");
		String str= s.nextLine();
		char ch[]= str.toCharArray();
		int up =0, low =0, vow =0, con =0, white=0, spl=0, dig=0;
		for(int i=0; i<ch.length; i++) {
				if(Character.isLetter(ch[i])) {
			if(Character.isUpperCase(ch[i]) && up==0) {
				System.out.println("Capital letter= "+(i+1));
				up++;
			}
			else if(Character.isLowerCase(ch[i])&& low==0) {
				System.out.println("Small letter= "+(i+1));
				low++;
			}
			}
			else if (Character.isDigit(ch[i])) {
					dig++;
				}
			else if(ch[i]==' '&& white ==0){
					System.out.println("Space= "+(i+1));
					white++;
					
				}
						
			if (vow ==0 || con ==0)
				{
				if((ch[i] == 'A' || ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'E' || ch[i] == 'i' || ch[i] == 'I'
					|| ch[i] == 'o' || ch[i] == 'O' || ch[i] == 'u' || ch[i] == 'U') && vow==0)
			{
				System.out.println("Vowel= "+(i+1));
				vow++;
				}
			
				else if(con ==0)
			{
					System.out.println("Consonant= "+(i+1));
					con++;
				}
			}
			if (ch[i]!= ' '&& spl ==0 && !Character.isLetter(ch[i]) && !Character.isDigit(ch[i])) {
				System.out.println("Special= "+(i+1));
				spl++;
			}
			
		}
	}

}
