package com.cdk.play;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class PitTriplets {
	public static void main(String[] args) {
		int[] array = {};
		System.out.println(solution(array));

	}

	public static int solution(int[] array) {
		// write your code in Java SE 8
		int max = array.length, p, e, depth;
		Set<Integer> depths = new HashSet<Integer>();
		for (int i = 0; i < max - 1; i++) {
			if (array[i] > array[i + 1]) {
				for (p = i; p < max - 1; p++) {
					if (array[p] < array[p + 1]) {
						break;
					}

				}
				int pitStart = i;
				int pitMid = p;
				for (e = pitMid; e < max - 1; e++) {
					if (array[e] > array[e + 1]) {
						break;
					}

				}
				if ((e + 1 > max) && (array[e] == array[e + 1])) {
					break;
				}
				int pitEnd = e;

				depth = Math.min(array[pitStart] - array[pitMid], array[pitEnd]
						- array[pitMid]);
				System.out.println("pit : " + pitStart + "," + pitMid + ","
						+ pitEnd + " depth :" + depth);
				depths.add(depth);

			}

		}

		return depths.isEmpty() ? -1 : Collections.max(depths);
	}
}
