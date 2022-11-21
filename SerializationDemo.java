import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Emp implements Serializable
{
	int empno;
	String ename;
	double salary;
	
	public Emp(int empno, String ename, double salary) {
		this.empno = empno;
		this.ename = ename;
		this.salary = salary;
	}
	public String toString() {
		return "EMPNO : "+empno+"\nENAME : "+ename+"\nSALARY : "+salary;
	}
	
}

public class SerializationDemo {

	public static void main(String[] args) throws Exception {
		Emp e1=new Emp(1, "Jigar", 10000);
		
		FileOutputStream fos=new FileOutputStream("ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(e1);
		oos.flush();
		oos.close();
		System.out.println("Object Written Successfully");
		
		FileInputStream fis=new FileInputStream("ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Emp1 e2=(Emp1) ois.readObject();
		ois.close();
		System.out.println(e2);
	}
}
