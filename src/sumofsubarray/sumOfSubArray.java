package sumofsubarray;

import java.util.Scanner;

public class sumOfSubArray {

	public static void sumSubArray(int array[],int size) {
        int totalSum = 0;
        for (int i=0;i<size ;i++) {
            for (int num = i; num <=size ; num++) {
                for (int j = i ; j < num ; j++) {
                    totalSum += array[j];
                }
            }
        }
        System.out.println(totalSum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] array = new int[n];
		for(int i=0;i<n;i++) {
			array[i] = scanner.nextInt();
		}
		sumSubArray(array,n);
	}

}
