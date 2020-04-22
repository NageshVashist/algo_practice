package com.arrays;

import java.util.Scanner;

public class SubarrayWithGivenSum {

	/*IN
	 * 2 
	 * 5 12
	 * 1 2 3 7 5
	 * 10 15
	 * 1 2 3 4 5 6 7 8 9 10
	 * 
	 * OUT
	 * 2 4
	 * 1 5
	 */
	public static void main(String[] args) {
		
		int []a = {135,101,170,125,79,159,163,65,106,146,82,28,162,92,196,143,28,37,192,5,103,154,93,183,22,117,119,96,48,127,172,139,70,113,68,100,36,95,104,12,123,134};
		_getSum(468, a);
		
//		Scanner s = new Scanner(System.in);
//		int c=s.nextInt();
//		
//		while(c>0) {
//			int as= s.nextInt();
//			int sum=s.nextInt();
//			int arr [] = new int [as];
//			for(int i =0;i<as ;i++) {
//				arr[i]=s.nextInt();
//			}
//			_getSum(sum,arr);
//			c--;
//		}
//		s.close();
	}

	private static void getSum(int sum, int[] arr) {
		int csum = 0;
		int i = 0, j = 0;
		while (i <= arr.length || j <= arr.length) {
			if (i == j) {
				csum = arr[j];
				if (csum == sum) {
					System.out.println(i + 1 + " " + (j + 1));
					return;
				}
			} else {
				if (csum < sum) {
					csum += arr[j];
				}
			}

			if (csum < sum) {
				j++;
			} else if (csum > sum) {
				csum -= arr[i];
				i++;
				if (csum < sum) {

					j++;
				}
			}
			if (csum == sum) {
				System.out.println(i + 1 + " " + (j + 1));
				return;
			}

		}
		System.out.println(-1);
	}
	
	private static void _getSum(int sum, int[] arr) {int csum = 0;

	for (int i = 0; i <= arr.length; i++) {
	    if(i>= arr.length){
	        break;
	    }
		csum = arr[i];
		for (int j = i + 1; j <= arr.length; j++) {
			if (csum == sum) {
				System.out.println(i + 1 + " " + j);
				return;
			}
			if (csum > sum || j>= arr.length) {
				break;
			}
			csum+=arr[j];
		}
	}
	System.out.println(-1);}
}
