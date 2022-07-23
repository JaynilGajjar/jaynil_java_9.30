import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorDemo implements Comparator<emp>{

	
	public int compare(emp e1, emp e2) {
		int value=0;
		if(e1.getSalary()>e2.getSalary()) 
		{
			value=-1;
		}else if(e1.getSalary()<e2.getSalary()) 
		{
			value=1;
		}else if(e1.getSalary()==e2.getSalary()) 
		{
			value=0;
		}
		return value;
	}
	public static void main(String[] args) {
		ArrayList<emp> list=new ArrayList<>();
		
		emp e1=new emp();
		e1.setEid(1);
		e1.setSname("Akshar");
		e1.setSalary((double) 50000);
		
		emp e2=new emp();
		e2.setEid(2);
		e2.setSname("Nisha");
		e2.setSalary((double) 70000);
		
		emp e3=new emp();
		e3.setEid(3);
		e3.setSname("Jinal");
		e3.setSalary((double) 45000);
		
		emp e4=new emp();
		e4.setEid(4);
		e4.setSname("Jainil");
		e4.setSalary((double) 30000);
		
		emp e5=new emp();
		e5.setEid(5);
		e5.setSname("Akshay");
		e5.setSalary((double) 25000);
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);

		Collections.sort(list, new ComparatorDemo());
		for(emp e:list)
		{
			System.out.println("EID : "+e.getEid()+" ENAME : "+e.getSname()+" SALARY : "+e.getSalary());
		}
	}

}
