package com.LabelledDoWhileLoop;

public class LabelledLoop {
public static void main(String[] args) {
	System.out.println("Start");
	int i=1;
	first:do
	{
		i++;
		int n=1;
		sec:do
		{
			
			System.out.print("*");
			n++;
			break first;
		}while(n<=5);
	
	}while(i<=5);
	i++;
	System.out.println();
	
	
}
}
