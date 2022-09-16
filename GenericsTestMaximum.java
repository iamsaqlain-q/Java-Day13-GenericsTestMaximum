package com.bl.generics;

public class GenericsTestMaximum {

	public static void main(String[] args) {
	
		Integer fNum = 11;
		Integer sNum = 21;
		Integer tNum = 31;
		
		System.out.println("Maximum among three integer");
		GenericsTestMaximum m = new GenericsTestMaximum();
		m.findMax(fNum, sNum, tNum);
		
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
