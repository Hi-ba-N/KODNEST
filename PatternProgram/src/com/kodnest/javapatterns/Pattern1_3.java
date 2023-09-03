package com.kodnest.javapatterns;

public class Pattern1_3 {
	public static void main(String[] args) {
		for(int i=4;i<=4;i--) {
			for(int j=1;j>=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
