import java.util.Scanner;

public class switchdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		int a,b,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("********************");
		System.out.println("1. Addition");
		System.out.println("2. subtraction");
		System.out.println("3. division");
		System.out.println("4. multiplication");
		System.out.println("Select the option:");
		age=sc.nextInt();
		
		switch(age) {
		case 1:
			System.out.print("Enter a:");
			a=sc.nextInt();
			System.out.print("Enter b:");
			b=sc.nextInt();
			sum=a+b;
			System.out.println("a+b:"+sum);
			break;
		case 2:
			System.out.print("Enter a:");
			a=sc.nextInt();
			System.out.print("Enter b:");
			b=sc.nextInt();
			sum=a-b;
			System.out.println("a-b:"+sum);
			break;
		case 3:
			System.out.print("Enter a:");
			a=sc.nextInt();
			System.out.print("Enter b:");
			b=sc.nextInt();
			sum=a/b;
			System.out.println("a/b:"+sum);
			break;
		case 4:
			System.out.print("Enter a:");
			a=sc.nextInt();
			System.out.print("Enter b:");
			b=sc.nextInt();
			sum=a*b;
			System.out.println("a*b:"+sum);
			break;
		default:
			System.out.print("invalid");
		}
	}
}
