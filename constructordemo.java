import java.util.Scanner;

public class constructordemo {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.print("Enter a:");
		a=sc.nextInt();
		System.out.print("Enter b:");
		b=sc.nextInt();
		System.out.print("Enter c:");
		c=sc.nextInt();
		
		if(a>c)
		{
			if(a>b) {
				System.out.println("a is greater");
			}else {
				System.out.println("b is greater");
			}
			
		}
		else {
			System.out.println("c is greater");
		}
		
		}

	}

