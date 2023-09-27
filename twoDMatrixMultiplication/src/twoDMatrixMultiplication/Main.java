package twoDMatrixMultiplication;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter 1st D and 2nd D length");
         int n=scan.nextInt();
         int m=scan.nextInt();
		int arr[][]=new int[n][m];
		System.out.println("Enter element storing in array1");
		for(int i=0;i<=arr.length-1;i++)

		{

		for(int j=0;j<=arr[i].length-1;j++)

		{

		arr[i][j]=scan.nextInt();

		}
		}
		int arr2[][]=new int[n][m];
		
		System.out.print("Enter element storing in array1");
		for(int i=0;i<=arr.length-1;i++)

		{

		for(int j=0;j<=arr[i].length-1;j++)

		{

		arr2[i][j]=scan.nextInt();

		}
		}
		int arr3[][]=new int[n][m];
		for(int i=0;i<=arr.length-1;i++)

		{

		for(int j=0;j<=arr[i].length-1;j++)

		{

		arr3[i][j]=arr[i][j]*arr2[i][j];

		}
		}
		System.out.println("Array1 Contents are...");
		for(int i=0;i<=arr.length-1;i++)

		{

		for(int j=0;j<=arr[i].length-1;j++)

		{

		System.out.print(arr[i][j]+"  ");

		}
		}
		System.out.println();
		System.out.println("Array2 Contents...");
		for(int i=0;i<=arr.length-1;i++)

		{

		for(int j=0;j<=arr[i].length-1;j++)

		{

		System.out.print(arr2[i][j]+"  ");

		}
		}
		System.out.println();
		//Multiplication
		System.out.println("Array3 Contents after addition...");
		for(int i=0;i<=arr.length-1;i++)

		{

		for(int j=0;j<=arr[i].length-1;j++)

		{

		System.out.print(arr3[i][j]+"  ");

		}
		}
		
	}
}
