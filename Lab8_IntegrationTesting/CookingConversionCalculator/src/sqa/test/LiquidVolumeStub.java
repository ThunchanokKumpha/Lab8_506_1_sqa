package sqa.test;


import sqa.main.LiquidVolumeConverter;

public class LiquidVolumeStub extends LiquidVolumeConverter {

	@Override
	public double getConversionFactor(String fromUnit, String toUnit) {
		return 15.0;
	}
}
