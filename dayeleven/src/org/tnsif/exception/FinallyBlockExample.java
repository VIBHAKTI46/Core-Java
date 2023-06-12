//finally block is not executed program
package org.tnsif.exception;
public class FinallyBlockExample {

	public static void main(String[] args) {
	//array initlization and delcartion	
		int arr[]=new int[] {10,20,30};
		System.out.println("array is:-");
		try {
			//System.exit(0);
		System.out.println(arr[3]);
		
		}
		catch (Exception e)
		{
			System.out.println("Exception handle "+e);
			//when we call exit function it means no any futher statement is executed
			//System.exit(0);
		}
		
		finally
		{
			//2.where finally block is contain the exception code
			System.out.println(10/0);
			System.out.println("Finally block");
		}

	

	}
}