package sqa.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestWithStub {

	@Test
	void testMassConverter_1cup_to_gram() {
		MassStub mass = new MassStub();
		double expectedResult = 125;
		assertEquals(expectedResult, mass.convert(1.0, "cup", "gram"));
	}
	
	
	@Test
	void testLiquidVolumeConverter_1tablespoon_to_ml() {
		LiquidVolumeStub liquid = new LiquidVolumeStub();
		double expectedResult = 15;
		assertEquals(expectedResult, liquid.convert(1.0, "tablespoon", "ml"));
	}
	
	@Test
	void testTemparatureConverter_100celsius_to_fahrenheit() {
		TemparatureStub temp = new TemparatureStub();
		double expectedResult = 212;
		assertEquals(expectedResult, temp.convert(100.0, "celsius", "fahrenheit"));
	}
	
	

}

