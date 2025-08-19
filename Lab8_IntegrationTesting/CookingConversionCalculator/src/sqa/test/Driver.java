package sqa.test;

import sqa.main.CookingConversionCalculator;


public class Driver {
	
	public static void main(String[] args) {
	
	CookingConversionCalculator converter = new CookingConversionCalculator();
		
	// Test 1: MassConverter
	double originalMass = 1.0;
	double convertedMass = 0.0; 
    String selectedMass = "mass";
    String fromMass = "oz";
    String toMass = "gram";

	convertedMass = converter.convert(originalMass, selectedMass,fromMass,toMass);
	System.out.println(originalMass + " " + fromMass + " = " + convertedMass + " " + toMass);

	
	// Test 2: LiquidVolumeConverter
	double originalLiquid = 1.0; 
	double convertedLiquid = 0.0;
	String selectedLiquid = "liquid";
	String fromLiquid = "cup" ;
	String toLiquid = "oz";
	
	convertedLiquid = converter.convert(originalLiquid, selectedLiquid, fromLiquid, toLiquid);
	System.out.println(originalLiquid + " " + fromLiquid + " = " + convertedLiquid + " " + toLiquid);
	
	
	// Test 3: TemparatureConverter
	double originalTemp = 100.0; 
	double convertedTemp = 0.0;
	String selectedTemp = "temperature"; 
	String fromTemp = "fahrenheit" ;
	String toTemp = "celsius";
	
	convertedTemp = converter.convert(originalTemp, selectedTemp, fromTemp, toTemp);
	System.out.println(originalTemp + " " + fromTemp + " = " + convertedTemp + " " + toTemp);
	
	
	}
}
