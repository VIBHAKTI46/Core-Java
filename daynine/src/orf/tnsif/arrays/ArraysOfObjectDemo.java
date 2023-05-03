package orf.tnsif.arrays;

public class ArraysOfObjectDemo {

	public static void main(String[] args) {
		//array of customer class
		Customer[] arr=new Customer[2];
		arr[0]=new Customer(23,"Vibhakti");
		arr[1]=new Customer(24,"Shruti");
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i].getId()+""+arr[i].getName());
		}

	}

}
