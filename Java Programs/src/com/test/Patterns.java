package com.test;

public class Patterns {

	public Patterns() {
		// TODO Auto-generated constructor stub
	}
	
	static void printPattern(int k) {
		
		for(int i=0; i<k; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {http://marketplace.eclipse.org/marketplace-client-intro?mpc_install=27025
		printPattern(5);

	}

}
