/*
 * Copyright 2015-2018 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v20.html
 */

package com.example.project2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CalculatorTests {

	@Test
	@DisplayName("2 * 2 = 4")
	void mulsTwoNumbers() {
		Calculator calculator = new Calculator();
		assertEquals(4, calculator.mul(2, 2), "2 * 2 should equal 4");
	}

	@ParameterizedTest(name = "{0} * {1} = {2}")
	@CsvSource({
			"0,    1,   0",
			"1,    2,   2",
			"49,  51, 2499",
			"1,  100, 100"
	})
	void mul(int first, int second, int expectedResult) {
		Calculator calculator = new Calculator();
		assertEquals(expectedResult, calculator.mul(first, second),
				() -> first + " * " + second + " should equal " + expectedResult);
	}
}
