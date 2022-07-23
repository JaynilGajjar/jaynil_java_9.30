import java.util.HashSet;

public class Hashset {
	
	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add(10);
		hs.add("t");
		hs.add("jvs");
		hs.add(10.10);
		hs.add(true);
		hs.add(null);
		
		System.out.println(hs);
	}
}
