import java.util.Scanner;

public class ThrowDemo {
	public static void demo() {
		
		int x;
		Scanner sc=new Scanner(System.in);
		
		try {
			System.out.print("Enter x:");
			x=sc.nextInt();
			
			if(x>0) {
				System.out.println("Squre of "+x+" is "+(x*x));
			}else {
				throw new Exception();
			}
		}catch(Exception e) {
			System.out.println("please enter valid vlue");
			demo();
		
		}
	}
	public static void main(String[] args) {
	demo();	
	}
}
