package exercises.stack;

import java.util.Arrays;

public class ExercisesLauncher {

	public static void main(String[] args) {
		// Reverse
		System.out.println("Original Array:");
		String[] names = {"Francesco", "Mary", "Sherlock"};
		System.out.println("names = " + Arrays.toString(names));
		System.out.println("Reversing the array calling ReverseArray method...");
		StackExercise.ReverseArray(names);
		System.out.println("names = " + Arrays.toString(names));	
		
		System.out.println("===================================================");
		System.out.println("Reversing an empty array");
		Integer[] empty = {};
		StackExercise.ReverseArray(empty);
		System.out.println("empty = " + Arrays.toString(empty));
		
		System.out.println("===================================================");
		System.out.println("Reversing an array of one element");
		System.out.println("Original Array:");
		Integer[] one = {1};
		System.out.println("one = " + Arrays.toString(one));
		System.out.println("Reversing the array calling ReverseArray method...");
		StackExercise.ReverseArray(one);
		System.out.println("one = " + Arrays.toString(one));
	}
}
