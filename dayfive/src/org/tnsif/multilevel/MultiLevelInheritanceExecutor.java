//program to demonstrate hierarchical inheritance
package org.tnsif.multilevel;

public class MultiLevelInheritanceExecutor {
public static void main(String args) {
	City c=new City();
	c.setCityName("Mumbai");
	c.setArea("dadar");
	c.setStateName("Maharastra");
	c.setLanguage("Marathi");
	c.setCountryName("India");
	c.setCountryCapital("Delhi");

System.out.print(c);

}
}
