import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap hm=new HashMap();
		hm.put(1,"Ankush");
		hm.put(2,"Varshal");
		hm.put(3,"Bhagyesh");
		hm.put(4,"Dev");
		hm.put(5,"Aditya");
		hm.put(6,"Krupa");
		hm.put(7,"Nishit");
		hm.put(8,"Janvi");
		
		System.out.println(hm);
		System.out.println(hm.get(3));
		System.out.println(hm.remove(4));
		System.out.println(hm);
		System.out.println(hm.size());
	}
}
