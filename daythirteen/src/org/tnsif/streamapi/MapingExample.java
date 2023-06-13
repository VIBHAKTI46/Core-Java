//program to demonstrate on the map operation
package org.tnsif.streamapi;
import java.util.Arrays;
import java.util.List;
public class MapingExample {

	public static void main(String[] args) {
		//using collection
		List<String>obj=Arrays.asList("Vibhakti","shruti","Smital");
		obj.stream().map(i->i.length()).forEach((i)->System.out.println(i+" "));
	}

}
