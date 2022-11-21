import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileInputOuput {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos=new FileOutputStream("tops1.txt");
		String s="This is file input-output demo using Java";
		byte b[]=s.getBytes();
		fos.write(b);
		fos.flush();
		fos.close();
		System.out.println("File Written Successfully");
		
		FileInputStream fis=new FileInputStream("tops1.txt");
		int i;
		while((i=fis.read())!=-1)
		{
			System.out.print((char)i);
		}
		fis.close();
	}
}
