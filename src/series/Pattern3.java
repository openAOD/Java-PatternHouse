/** 
 * Contributed
 * 		to: PatternHouse
 *		by: ChlorinePentoxide
 * Copyright(C) 2021, PatternHouse
 * The MIT License
 **/

public class Pattern3 {

	public static void main(String[] args) {
		double startNumber = 1.0d;
		double initialCommonDifference = 0.0d;
		int numberOfTerms = 100;
		
		for(int i=1;i<=numberOfTerms;i++,initialCommonDifference+=1.0d) System.out.print( (startNumber + (i-1)*initialCommonDifference) + " ");
	}

}