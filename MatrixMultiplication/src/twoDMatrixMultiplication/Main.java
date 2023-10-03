package twoDMatrixMultiplication;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter 1st D and 2nd D length");
         int n=scan.nextInt();
		int arr[][]=new int[n][n];
		System.out.println("Enter "+(n*n)+" elements storing in array1");
		for(int i=0;i<=arr.length-1;i++)

		{

		for(int j=0;j<=arr[i].length-1;j++)

		{

		arr[i][j]=scan.nextInt();

		}
		}
		int arr2[][]=new int[n][n];
		
		System.out.println("Enter "+(n*n)+" elements storing in array2");
		for(int i=0;i<=arr.length-1;i++)

		{

		for(int j=0;j<=arr[i].length-1;j++)

		{

		arr2[i][j]=scan.nextInt();

		}
		}
		int arr3[][]=new int[n][n];
      //Matrix multiplication
		for(int i=0;i<=arr.length-1;i++)

		{

		for(int j=0;j<=arr[i].length-1;j++)

		{
			for(int k=0;k<=arr[i].length-1;k++) {
				
			
		arr3[i][j]=arr3[i][j]+arr[i][k]*arr2[k][j];

		}
		}
		}
		System.out.println("Array1 Contents are...");
		for(int i=0;i<=arr.length-1;i++)

		{

		for(int j=0;j<=arr[i].length-1;j++)

		{

		System.out.print(arr[i][j]+" | ");

		}
		System.out.println();
		}
		System.out.println();
		System.out.println("Array2 Contents...");
		for(int i=0;i<=arr.length-1;i++)

		{

		for(int j=0;j<=arr[i].length-1;j++)

		{

		System.out.println(arr2[i][j]+" | ");

		}
		System.out.println();
		}
		System.out.println();
		//Multiplication
		System.out.println("Array3 Contents after matrix multiplication...");
		for(int i=0;i<=arr.length-1;i++)

		{

		for(int j=0;j<=arr[i].length-1;j++)

		{

		System.out.print(arr3[i][j]+"|");

		}
		System.out.println();
		}
		
	}
}
