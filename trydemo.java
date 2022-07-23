import java.util.Scanner;

public class trydemo {
	public static void demo() {
		
		int x;
		Scanner sc=new Scanner(System.in);
		try {
			System.out.print("Enter x :");
			x=sc.nextInt();
			
			if(x>0) {
				System.out.println("the squre of "+x+" is "+(x*x));
			}else {
				throw new Exception();
			}}
		catch(Exception e) {
				System.out.println("please enter valid number");
				demo();
			}
		}
	public static void main(String[] args) {
		demo();
	}
	}

