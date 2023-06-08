package org.tnsif.junit;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.provider.ValueSource;

class ParameterizedTest {

	/* to perform parameterized test
	 * 
	 */
	@ParameterizedTest
	@ValueSource(strings= {"vibhakti","Ankit"})
	
	void test() {
		System.out.println("Demonstration on parameterized"+"Test");
	}
@ParamerizedTest
@ValueSource(strings= {"abc", "XYZ"})

	void accept(String str) {
		assertNotNull(str);
	}
}

