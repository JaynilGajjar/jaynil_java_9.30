
class NewThread implements Runnable{
}

public class thred {

	public static void main(String[] args) {
		Thread t=Thread.currentThread();
		System.out.println("Current Thread : "+t);
		t.setName("My Thread");
		System.out.println("After Name Change : "+t);
		t.setPriority(7);
		System.out.println("After Priority Change : "+t);
		
		try {
			for(int i=0;i<5;i++)
			{
				System.out.println(t+" : "+i);
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Main Thread Exiting");
	}
}
