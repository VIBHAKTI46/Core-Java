package orf.tnsif.arrays;
import java.util.Scanner;

public class JaggedArrayExample {

	public static void main(String[] args) {
		//delcaring 2darray with 2 rows
		int arr[][]=new int [2][];
		Scanner sc =new Scanner(System.in);
		//in jagged array inside array size are different
		//making the above array jagged
		
		//for 1st block outside array we take 3 element
		arr[0]=new int [3];
		//for 2nd block outside array we take 2 element
		arr[1]=new int[2];
		int count =0;
		
		for (int i =0;i<arr.length;i++)
		{
			for (int j=0;j<arr.length;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		
		//arr[i][j]=count++;
		System.out.println("contents of 2d jagged array");
		for (int i=0;i<arr.length;i++)
		{
			for (int j=0;j<arr[i].length;j++)
			{
				
			
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}
		
	}

}