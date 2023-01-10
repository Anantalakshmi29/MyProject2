package calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest2 {
@Test
	void sum() {
		Calculator obj = new Calculator();
	    int addition = obj.sum(4,2 );
	    assertEquals(6,addition);
	}
	@Test
	void sub() {
		Calculator obj = new Calculator();
	    int substraction = obj.sub(4,2 );
	    assertEquals(2,substraction);
	}
	@Test
	void mul() {
		Calculator obj = new Calculator();
	    int multiplication = obj.mul(4,2 );
	    assertEquals(8,multiplication);
	}
	@Test
	void div() {
		Calculator obj = new Calculator();
	    int division = obj.div(4,2 );
	    assertEquals(2,division);
	}
}
