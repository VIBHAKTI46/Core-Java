package org.tnsif.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class parametrizeddemo {

	@ParameterizedTest
	@ValueSource(strings= {"vibhakti","patil"})
	void test() {
		System.out.println("paramertized ");
	}
	
	@ParameterizedTest
	@ValueSource(strings= {"vibhakti","patil"})
	void accept(String str) {
		assertNotNull(str);
	}

}