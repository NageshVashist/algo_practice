package com.algo;

public class FibonacciRecursive {
	public static void main(String[] args) {
		System.out.println(fib(44));
	}

	private static int fib(int n) {
		if(n<=1) {
			return n;
		}
		return fib(n-2)+ fib(n-1);
	}
}
