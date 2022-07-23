import java.util.Scanner;

public class Bankdemo {
	
	public static void main(String[] args) {
		CheckingAccount c=new CheckingAccount(1, 1000);
		double amount;
		int choice;
		Scanner sc=new Scanner(System.in);
		
		do{
			System.out.println("1. Deposit Amount");
			System.out.println("2. Withdraw Amount");
			System.out.println("3. Check Balance");
			System.out.println("4. Exit");
			
			System.out.println("Enter your cjoice :");
			choice=sc.nextInt();
			
			if(choice==1) 
			{
				System.out.println("Enter amount :");
				amount=sc.nextDouble();
				c.deposit(amount);
			}
			else if(choice==2) 
			{
				System.out.println("enter your amount");
				amount=sc.nextDouble();
				try {
					c.withdraw(amount);
				}catch (InSuficientFund e){
					System.out.println("Sorry You Need Another "+e.getAmount()+" Rs.");
				}
			}
			else if(choice==3) 
			{
				c.checkbalance();
			}
			else 
			{
				System.out.println("thsnk you for using this services");
				break;
				
			}
		}while(true);
		
	}
}
