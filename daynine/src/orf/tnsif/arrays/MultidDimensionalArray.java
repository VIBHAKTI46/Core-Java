package orf.tnsif.arrays;
import java.util.Scanner;
public class MultidDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner s=new Scanner(System.in);
 int arr[][]=new int[2][3];
 for(int i=0;i<2;i++) {
	 for(int j=0;j<3;j++) {
		 arr[i][j]=s.nextInt();
	
	 }
 }
 for(int i=0;i<2;i++) {
	 for(int j=0;j<3;j++) {
		 System.out.print(arr[i][j]+"");
	 }
	 System.out.println();
 }
	}

}
