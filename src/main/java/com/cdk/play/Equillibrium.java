package com.cdk.play;

public class Equillibrium {

	public static void main(String[] args) {
		int[] array = { 0 };
		int eqElement = solution(array);
		if (eqElement != -1) {
			System.out.println(eqElement);
		}
		
	}

	public static int solution(int[] array) {
		// write your code in Java SE 8
		int max = array.length;

		for (int i = 1; i < max; i++) {
			int leftSum = 0, rightSum = 0;
			for (int j = 0; j < i; j++) {
				leftSum = leftSum + array[j];
			}

			for (int k = i+1; k < max; k++) {
				rightSum = rightSum + array[k];
			}
			if (leftSum == rightSum) {
				return i;
			}
		}

		return -1;

	}
}
