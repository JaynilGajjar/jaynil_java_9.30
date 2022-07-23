import java.util.ArrayList;
import java.util.Iterator;

public class arraylistdemo {
	
	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		al.add(15);
		al.add("test");
		al.add(15.264);
		al.add(1500000);
		al.add("b");
		al.add("jay");
		al.add(true);
		
		System.out.println(al);
		System.out.println(al.get(5));
		System.out.println(al.contains(15));
		
		Iterator itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
}
}
