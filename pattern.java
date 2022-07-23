
public class pattern {
	public static void main(String[] args) {
		int i,j,k;
		
		for(i=9;i>=1;i--) {
			for(k=0;k>i-1;k++) {
				System.out.print(" ");
			}
			for(j=0;j<=i;j++) {
				System.out.print(i);	
			}
			System.out.println();
		}
		
		
	}
}
