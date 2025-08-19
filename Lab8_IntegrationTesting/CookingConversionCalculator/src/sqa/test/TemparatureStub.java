package sqa.test;


import sqa.main.TemperatureConverter;
public class TemparatureStub extends TemperatureConverter {
		
	@Override
	public double convert(double tempValue, String fromUnit, String toUnit) {
		return 212.0;
	}

}
