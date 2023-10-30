package assignment.java.in;

import java.util.Random;

public class JavaAssignment1ArrayShuffle {
	 public static void main(String[] args) {
	        int[] values = {1, 2, 3, 4, 5, 6, 7};
	        shuffleArray(values);

	     
	        for (int value : values) {
	            System.out.print(value + " ");
	        }
	    }

	    public static void shuffleArray(int[] array) {
	        int n = array.length;
	        Random rand = new Random();

	        for (int i = n - 1; i > 0; i--) {
	            int j = rand.nextInt(i + 1);

	            
	            int temp = array[i];
	            array[i] = array[j];
	            array[j] = temp;
	        }
	    }
	}