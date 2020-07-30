import java.util.Scanner;

public class ToFindNonRepeatedElementsInArray {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		System.out.println("Enter the array size");

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int array[] = new int[n];

		System.out.println("Enter the array elements");
		for (int i = 0; i < array.length; i++) {
			array[i] = scan.nextInt();
		}
		scan.close();

		System.out.println("The user defined array elements are");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();

		int count = 0, temp=array[0];
		for (int i = 0; i < array.length; i++) {
			for (int j = i+1; j < array.length; j++) {
				if (array[i] == array[j]) {
					temp=array[i];
						count++;
				}
			}
		}
		int repeatedarray[] = new int[count];
		int nonrepeatedarray[] = new int[array.length-count];
		
		for (int i = 0; i < repeatedarray.length; i++) {
			for (int j = i+1; j < repeatedarray.length; j++) {
				if (array[i] == array[j]) {
					repeatedarray[]=array[i];
						//count++;
				}
			}
		}
		System.out.println("Number of repeated array elements set are "+count);
		System.out.println("The repeated array elements are");
		for(int i=0; i<(count); i++) {
			System.out.println(array[i]+" ");
		}
	
		
		
		System.out.println("Number of non-repeated array elements are "+(array.length-2*count));
		System.out.println("The non-repeated array elements are");
		for(int i=0; i<(array.length-count); i++) {
		//for(int i=0; i<count1; i++) {
			//if(count==0)
		
			System.out.println(array[i]+" ");
				//System.out.println(nonrepeatedarray[x++]+" ");
		}
	
	System.out.println("Main Method Ended");
	}
}
