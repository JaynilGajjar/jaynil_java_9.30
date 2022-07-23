import java.util.Scanner;

public class throwd {
	
	public static void demo() {
		int x;
		Scanner sc=new Scanner(System.in);
		try {
		System.out.println("enter x :");
		x=sc.nextInt();
		if(x>0) {
			System.out.println("the square of "+x+" is "+(x*x));
		}else {
			throw new Exception();
		}}
		catch(Exception e) {
			System.out.println("enter posotive value only");
			demo();
		}
		}
	public static void main(String[] args) {
		demo();
	}
}