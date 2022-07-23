import java.util.Scanner;

public class test1 {
	
	public static void main(String[] args) {
		int x;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter x :");
		x=sc.nextInt();
		
		if(x%2==0){
			System.out.println("this num is even");
		}else {
			System.out.println("this one is odd number");
		}
			
		}
	}
	