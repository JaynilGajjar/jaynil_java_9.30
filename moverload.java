
public class moverload {
	
	void test() {
		System.out.println("normal m load");
	}
	void test(int a) {
		System.out.println("overload with int a");
	}
	void test(int a,int b) {
		System.out.println("overload wih 2 int calling");
	}
	public static void main(String[] args) {
		moverload m=new moverload();
		m.test();
		m.test(15,20);
		m.test(5);
		
		
	}
}
