import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class student implements Serializable{
	int rno;
	String sname;
	public student(int rno, String sname) {
		this.rno = rno;
		this.sname = sname;
	}
	public String toString() {
		return "Roll no:"+rno+"\nStudent Name:"+sname;
	}
}

public class SerializationDemo {
	public static void main(String[] args) throws Exception {
		
	
	student s1=new student(5, "Jynil");
	FileOutputStream fos=new FileOutputStream("ser");
	ObjectOutputStream oos=new ObjectOutputStream(fos);
	oos.writeObject(s1);
	oos.flush();
	oos.close();
	System.out.println("object written successfully");
	
	FileInputStream fis=new FileInputStream("ser");
	ObjectInputStream ois=new ObjectInputStream(fis);
	student s2= (student) ois.readObject();
	ois.close();
	System.out.println(s2);
	}
	
}