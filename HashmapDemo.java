import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashmapDemo {
	
	public static void main(String[] args) {
		
		HashMap map=new HashMap();
		map.put(1,"jay");
		map.put(2,"java");
		map.put(3,"tops");
		map.put(4,"iskon");
		map.put(5,"demo");
		map.put(6,"test");
		
		System.out.println(map);
		Set set=map.entrySet();
		Iterator itr=set.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}
