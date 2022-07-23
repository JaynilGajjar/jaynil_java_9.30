public class GenericDemo {
	
	public static <E> void printarray(E[] inputarray)
	{
		for(E e:inputarray) 
		{
			System.out.print(e+"  ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Integer intarray[]= {1,2,3,4,5,6};
		Double bobarray[]= {1.1,2.2,3.3,4.4,5.5,6.6};
		Character chararray[]= {'a','s','d','f','g','h'};
		
		printarray(bobarray);
	}
}
