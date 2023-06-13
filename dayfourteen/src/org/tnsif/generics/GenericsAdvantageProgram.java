package org.tnsif.generics;
import java.util.ArrayList;
import java.util.List;
public class GenericsAdvantageProgram {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList();
		list.add(11);
		list.add(15);
		//list.add(23.5);
		System.out.println(list);
		
		//2.before generics , typecasting is allowed
		ArrayList arr1=new ArrayList();
		arr1.add("st.John");
		System.out.println(arr1);
		String str=(String)arr1.get(0);
		System.out.println(str);
		//3. in generic, Typecasting is not neccessary
		ArrayList<String> arr2=new ArrayList();
		arr2.add("st.John");
		System.out.println(arr1);
		String str1=(String)arr2.get(0);
		System.out.println(str);
		
	}

}
