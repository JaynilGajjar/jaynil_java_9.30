import java.io.FileReader;
import java.io.FileWriter;

public class filereadwrite {

	public static void main(String[] args) throws Exception {
			FileWriter fw=new FileWriter("test1.txt");
			String s="This is demo of file reader";
			fw.write(s);
			fw.flush();
			fw.close();
			
			FileReader fr=new FileReader("test1.txt");
			int i;
			while((i=fr.read())!=-1) {
				System.out.print((char)i);
			}
			fr.close();
			}
}
