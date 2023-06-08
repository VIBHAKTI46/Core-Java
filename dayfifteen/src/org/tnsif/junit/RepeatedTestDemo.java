package org.tnsif.junit;

import org.junit.jupiter.api.RepeatedTest;

class RepeatedTestDemo {

	@RepeatedTest(3)
	void test() {
		System.out.println("Hello ");
	}

}
