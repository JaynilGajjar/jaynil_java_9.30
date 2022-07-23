import java.io.FileOutputStream;

public class Fileinputoutput {
	
	public static void main(String[] args)throws Exception
	{
		FileOutputStream fos=new FileOutputStream("demo1.txt");
		String s="this is demo for input output";
		byte b[]=s.getBytes();
		fos.write(b);
		fos.flush();
		fos.close();
		System.out.println("done-");
		
	}
}
