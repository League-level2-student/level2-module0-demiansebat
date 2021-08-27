package arrays;

import java.util.Arrays;
import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String []strings= new String[5];
		//2. print the third element in the array
		System.out.println(strings[2]);
		//3. set the third element to a different value
		strings[2]="hi";
		//4. print the third element again
		System.out.println(strings[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < strings.length; i++) {
			System.out.println(strings[i]);
		}
		
		//6. make an array of 50 integers
		int []manyints= new int[50];
		//7. use a for loop to make every value of the integer array a random number
		Random randomint= new Random();
		for (int i = 0; i < manyints.length; i++) {
			manyints[i]= randomint.nextInt(1000);
		}
		//8. without printing the entire array, print only the smallest number in the array
		int smallnumber=manyints[0];
		for (int i = 1; i < manyints.length; i++) {
			if (manyints[i]<smallnumber) {
				smallnumber= manyints[i];
			}
		}
		System.out.println(smallnumber);
		//9 print the entire array to see if step 8 was correct
		System.out.println(Arrays.toString(manyints));
		//10. print the largest number in the array.
		int largenumber=manyints[0];
		for (int i = 1; i < manyints.length; i++) {
			if (manyints[i]>largenumber) {
				largenumber= manyints[i];
			}
		}
		System.out.println(largenumber);
		//9 print the entire array to see if step 8 was correct
		System.out.println(Arrays.toString(manyints));
	}
}
//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