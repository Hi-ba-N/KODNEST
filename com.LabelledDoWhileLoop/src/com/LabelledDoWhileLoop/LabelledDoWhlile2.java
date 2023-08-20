package com.LabelledDoWhileLoop;

public class LabelledDoWhlile2 {
	public static void main(String[] args) {
		
	System.out.println("START");
	int i=1;
	first:do
	{
		
		int n=1;
		second:do
		{
			System.out.print("kodnest ");
			n++;
			break second;
		}while(n<=5);
		i++;
		System.out.println();
	}while(i<=5);
	
	
}
}
