package com.kodnest.javapatterns;

public class Pattern39 {
	public static void main(String[] args) {
		int n=11;
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
				if(j==0&&i<=n/2||(i==0&&j<=n/2)||i==n/2&&j<=n/2||j==n/2&&i<=n/2||i==6&&j>n/2||(j==6&&i>n/2)||(i>n/2&&j==n)||(i==n&&j>n/2)) {
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
