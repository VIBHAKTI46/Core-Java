package org.tnsif.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

//cutom annotation declare using 
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Custom
{
	//abstract method
	String print();
	float percentage ();
}

class implemtableclass
{
	@Custom(print="wlcome ",percentage=89.47f)
	public void display()
	{
		System.out.println("it working");
	}
	
}

public class CustomAnotationExample {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		implemtableclass i =new implemtableclass();
		i.display();
		Method m= i.getClass().getMethod("display");
		Custom obj =m.getAnnotation(Custom.class);
		System.out.println(obj.print());
		System.out.println(obj.percentage());
	}

}