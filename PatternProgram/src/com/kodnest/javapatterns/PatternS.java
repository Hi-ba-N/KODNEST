package com.kodnest.javapatterns;

public class PatternS {
	public static void main(String[] args) {
		int n=11;
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
				if(i<n/2&&j==0||i==0||i==n/2||j==n&&j>=n/2&&i>n/2||i==n) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
