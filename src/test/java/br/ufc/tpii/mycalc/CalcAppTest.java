package br.ufc.tpii.mycalc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalcAppTest {

	@Test
	void testAdd() {
		CalcApp calc = new CalcApp();
		assertEquals(10.00, calc.add(5.0, 5.0));
	}

	@Test
	void testMinus() {
		CalcApp calc = new CalcApp();
		assertEquals(0.00, calc.minus(5.0, 5.0));
	}

	@Test
	void testPlus() {
		CalcApp calc = new CalcApp();
		assertEquals(25.00, calc.plus(5.0, 5.0));
	}

	@Test
	void testDiv() {
		CalcApp calc = new CalcApp();
		assertEquals(1.00, calc.div(5.0, 5.0));
	}

}
