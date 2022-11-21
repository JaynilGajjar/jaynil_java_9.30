import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorDemo implements Comparator<Emp1>{

	public int compare(Emp1 e1, Emp1 e2) {
		int value=0;
		if(e1.getSalary()>e2.getSalary())
		{
			value=-1;
		}
		else if(e1.getSalary()<e2.getSalary())
		{
			value=1;
		}
		else if(e1.getSalary()==e2.getSalary())
		{
			value=0;
		}
		return value;
	}
	public static void main(String[] args) {
		ArrayList<Emp1> list=new ArrayList<Emp1>();
		
		Emp1 e1=new Emp1();
		e1.setEmpno(1);
		e1.setEname("Varshal");
		e1.setSalary(15000);
		
		Emp1 e2=new Emp1();
		e2.setEmpno(2);
		e2.setEname("Bhagyesh");
		e2.setSalary(14000);
		
		Emp1 e3=new Emp1();
		e3.setEmpno(3);
		e3.setEname("Ankush");
		e3.setSalary(17000);
		
		Emp1 e4=new Emp1();
		e4.setEmpno(4);
		e4.setEname("Aditya");
		e4.setSalary(20000);
		
		Emp1 e5=new Emp1();
		e5.setEmpno(5);
		e5.setEname("Dev");
		e5.setSalary(25000);
		
		Emp1 e6=new Emp1();
		e6.setEmpno(6);
		e6.setEname("Krupa");
		e6.setSalary(18000);
		
		Emp1 e7=new Emp1();
		e7.setEmpno(7);
		e7.setEname("Janvi");
		e7.setSalary(22000);
		
		Emp1 e8=new Emp1();
		e8.setEmpno(1);
		e8.setEname("Nishit");
		e8.setSalary(16000);
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		list.add(e6);
		list.add(e7);
		list.add(e8);
		
		Collections.sort(list, new ComparatorDemo());
		
		for(Emp1 e:list)
		{
			System.out.println("EMPNO : "+e.getEmpno()+" ENAME : "+e.getEname()+" SALARY : "+e.getSalary());
		}
	}
}
