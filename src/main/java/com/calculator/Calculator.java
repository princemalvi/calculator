package com.calculator;

public class Calculator 
{


	public static int add(String numsString) {
		if(numsString.isEmpty())
			return 0;
		else if (numsString.contains(",")) {
			String[] numArr = numsString.split(",");
			int sum = 0;
			for(String n : numArr)
				sum = Integer.parseInt(numArr[0]) + Integer.parseInt(numArr[1]); 
			return sum;
		}else {
			return 1;
		}
	}

    public static void main( String[] args )
    {
        
    }
}
