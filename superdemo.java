class A1{
	A1(){
		System.out.println("default");
	   }
	void show(){
		System.out.println("from a");
	}
}
class B1 extends A1{
	B1(){
		System.out.println("from b");
	}
	void show() {
		super.show();
		System.out.println("from b class");
	}
}
class C1 extends B1{
	C1(){
		System.out.println("from c");
	}
	void show() {
		super.show();
		System.out.println("this is from c");
	}
}

public class superdemo {
	public static void main(String[] args) {
		C1 c=new C1();
		c.show();
	}
}
