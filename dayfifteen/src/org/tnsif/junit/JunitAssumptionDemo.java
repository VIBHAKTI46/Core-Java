/*
 * program to demonstrate on Junit Assumption 
 * when any test case is fail then that method is skip
 */
package org.tnsif.junit;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

class JunitAssumptionDemo {

	@Test
	void test() {
		Assumptions.assumeTrue(12==12);
	}
	@Test
	void display() {
		Assumptions.assumeTrue(12==3);
	}

}
