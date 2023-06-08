//program to demonstrate on different annotation which is used in junit5
package org.tnsif.junit;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;;
@TestInstance(Lifecycle.PER_CLASS)
class JunitAnnotationDemo {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	@Test
	void display() {
			System.out.println("First Junit5 Test case ");
		}
	//@Test
	/* Denotes that the below annotation method  should be
	 * executed before all test method
	 */
	@BeforeAll 
	 void print() {
		System.out.println("performing beforeAll Annotation ");
	}
	/* Denotes that the below annotation method  should be
	 * executed forEach test method
	 */
	@AfterEach
	@Disabled
	void Accept()
	{
		System.out.println("AfterEach method is Executing..");
	}
}
