package com.string;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		for (int i = 0; i < c; i++) {
			reverseString(sc.next());
		}
	}

	public static void reverseString(String s) {
		if (s == null || s.isEmpty()) {
			return;
		}
		String[] splitted = s.split("\\.");
		String r = "";
		for (int i = splitted.length - 1; i >= 0; i--) {
			if (i == splitted.length-1) {
				r = splitted[i];
			} else {

				r += "." + splitted[i];
			}
		}

		System.out.println(r);
	}
}
