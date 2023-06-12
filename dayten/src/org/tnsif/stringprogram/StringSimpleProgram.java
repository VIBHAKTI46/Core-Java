/* demonstrate a string program by using string literel and using
 * new keyword
 */
package org.tnsif.stringprogram;
public class StringSimpleProgram {

	public static void main(String[] args) {
		// using STring literal 
		String str1="vibhakti";
		String str3="vibhakti";
		System.out.println("using literal:"+str1);
		String str2=new String("vibhakti");
		System.out.println("using new keyword:"+str2);
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		
		
	}

}
