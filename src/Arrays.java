
public class Arrays {

	public static void main(String[] args) {
		int [] IntArray = {1,2,3,4,5,6,7};
		System.out.println("Number should be 7 and is actually " + IntArray[6]);
		
		int[] myIntArray1 = new int[10];
		//myIntArray1 = new int[10];
		
		myIntArray1[0] = 100;
		myIntArray1[1] = 90;
		System.out.println("Number should be 100 and is actually " + myIntArray1[0]);
		System.out.println("Number should be 0 and is actually " + myIntArray1[2]);
		
		String [] StringArray = {"one", "two", "three", "four", "five"};
		System.out.println("Number should be one and is actually " + StringArray[0]);
		
		int ArrayLenghtForInt = IntArray.length;
		int ArrayLenghtForString = StringArray.length;
		
		System.out.println("IntArray lenght is " + ArrayLenghtForInt + " and StringArray lenght is " + ArrayLenghtForString);
		
		/* double[] myList = {1.9, 2.9, 3.4, 3.5};

	      // Print all the array elements
	      for (int i = 0; i < myList.length; i++) {
	         System.out.println(myList[i]);
	      }
	      // Summing all elements
	      double total = 0;
	      for (int i = 0; i < myList.length; i++) {
	         total += myList[i];
	      }
	      System.out.println("Total is " + total);
	      // Finding the largest element
	      double max = myList[0];
	      for (int i = 1; i < myList.length; i++) {
	         if (myList[i] > max) max = myList[i];
	      }
	      System.out.println("Max is " + max);
	      
	      int flightNum = 89, travelTime, departure = 10, distance; */
	   
	}

}
