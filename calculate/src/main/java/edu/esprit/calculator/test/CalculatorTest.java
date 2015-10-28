package edu.esprit.calculator.test;

import org.junit.Assert;
import org.junit.Test;

import edu.esprit.calculate.Calculator;


public class CalculatorTest {

	
	@Test
	public void itShouldturn10(){
		
	Long[] param ={1L,2L,3L,4L};
		Calculator calc = new Calculator();
		Long actual= calc.add(param);
		Long expected=10L;
		
		Assert.assertEquals(expected, actual);
		
	}
	
	
}
