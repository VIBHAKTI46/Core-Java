package org.tnsif.junit;
//when any test case is fail we get false and true
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Test;
class JunitAssertionDemo {

	@Test
	
	void test() {
		/*
		 * fails if expression is not true
		 */
		assertTrue(10>5);
	}
	@Test
	void display() {
		/*
		 * fails if expression is not false
		 */
		assertFalse(10>5);
		}
	@Test
	void accept() {
		/*
		 * fails if expression is not false
		 */
		assertNull(null);
		}
	
}
