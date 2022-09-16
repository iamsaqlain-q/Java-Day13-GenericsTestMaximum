package com.bl.generics;

public class GenericsTestMaximum {

	public static void main(String[] args) {
	
		Integer fNum = 11;
		Integer sNum = 21;
		Integer tNum = 31;
		Float fNumFloat = 11.1F;
		Float sNumFloat = 21.1F;
		Float tNumFloat = 31.1F;
		
		System.out.println("***** Test Maximum among three ***** ");
		GenericsTestMaximum m = new GenericsTestMaximum();
		m.findMax(fNum, sNum, tNum);
		m.findMax(fNumFloat, sNumFloat, tNumFloat);
		
	}
	
public void findMax(Float fNumFloat, Float sNumFloat, Float tNumFloat) {
	
	Float maxNum;
	
	if(fNumFloat.compareTo(sNumFloat) > 0 && fNumFloat.compareTo(tNumFloat) > 0 )
	{
		maxNum = fNumFloat;
	}
	
	else if(sNumFloat.compareTo(fNumFloat) > 0 && sNumFloat.compareTo(tNumFloat) > 0 )
	{
		maxNum = sNumFloat;
	}
	
	else 
		{
			maxNum = tNumFloat;
		}
	System.out.println("Maximum float is : " + maxNum + " among " + fNumFloat + ", " + sNumFloat + " and " + tNumFloat);
	}
	
public void findMax(Integer fNum, Integer sNum, Integer tNum) {
	
	Integer maxNum;
	
	if(fNum.compareTo(sNum) > 0 && fNum.compareTo(tNum) > 0 )
	{
		maxNum = fNum;
	}
	
	else if(sNum.compareTo(fNum) > 0 && sNum.compareTo(tNum) > 0 )
	{
		maxNum = sNum;
	}
	
	else 
		{
			maxNum = tNum;
		}
	System.out.println("Maximum integer is : " + maxNum + " among " + fNum + ", " + sNum + " and " + tNum);
	}
}
