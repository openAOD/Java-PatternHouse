/** 
 * Contributed
 * 		to: PatternHouse
 *		by: ChlorinePentoxide
 * Copyright(C) 2021, PatternHouse
 * The MIT License
 **/

public class Pattern1 {

	public static void main(String[] args) {
		double startNumber = 1.0d;
		double commonDifference = 3.0d;
		int numberOfTerms = 100;
		
		for(int i=0;i<numberOfTerms;i++) System.out.print( (startNumber + (i-1)*commonDifference) + " ");
	}

}