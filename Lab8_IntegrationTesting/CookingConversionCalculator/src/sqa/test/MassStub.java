package sqa.test;

import sqa.main.MassConverter;


public class MassStub extends MassConverter {
	
	@Override
	public double getConversionFactor(String fromUnit, String toUnit) {
		return 125.0;
	}

}


