public class GenricDemo {

	public static <E> void printArray(E[] inputArray)
	{
		for(E e:inputArray)
		{
			System.out.print(" "+e);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Integer intArray[]= {1,2,3,4,5,6,7,8,9};
		Double doubleArray[]= {1.1,2.2,3.3,4.4,5.5,6.6};
		Character charArray[]= {'T','O','P','S'};
		
		printArray(intArray);
		printArray(doubleArray);
		printArray(charArray);
	}
}
