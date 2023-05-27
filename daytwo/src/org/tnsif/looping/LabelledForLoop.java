package org.tnsif.looping;

public class LabelledForLoop {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		outer://recommended to use with jumping statement
			for(int i =1;i<=5;i++)
			{
				System.out.println();
				
				inner:
					for(int j =1;j<=5;j++)
					{
					
					if(j==2)
						//it terminates
						continue;
					//continue skip the statement 
					System.out.print(j+" ");
					}
			}

	}
	

}
