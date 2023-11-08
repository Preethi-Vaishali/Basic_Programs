package Switch_Case;

import java.util.Scanner;
public class ATM_Prg{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(true) {
		int amt,n; 
		float bal=3000;
		System.out.println("\n");
		System.out.println("Select the Operation to be Performed ");
		//System.out.println("Choose the operation you want to perform ");
		System.out.println("Choose 1 for Withdrawal");
		System.out.println("Choose 2 for Deposit");
		System.out.println("Choose 3 for Check Balance");
		System.out.println("Choose 4 for Exit");
		n=s.nextInt();
		switch(n) 
		{
		case 1:{
			System.out.println("Enter the Amount to Withdraw: ");
			amt = s.nextInt();
			if (amt>bal) {
				System.out.println("Account balance is not sufficient");
			}
			else {
			bal=bal-amt;
			System.out.println(amt+" Rupees is debited from your account Please collect your cash "
					+ "Balance is "+ bal);
			}
		}
			break;
		case 2:{
			System.out.println("Enter the Amount to Deposit: ");
			amt = s.nextInt();
			bal=bal+amt;
			System.out.println("Your account is Credited with "+amt+" Rupees and the balance is: "+bal);
		}
			break;
		case 3:
			System.out.println("Your Balance is "+bal+" Rupees");
			break;
		case 4:
			System.exit(0);
			break;
		}
		}
		
	}
}

