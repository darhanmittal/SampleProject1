package com.tryLocal.tryUtil;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Abc {

	
	String a = "Neeraj";
	
	public static String replace(String abs) {
		//String replaced = "";
		
		Scanner sc= new Scanner(System.in);
		while(abs.contains("e")) {
		abs = abs.replace('e', 'a');
		}
		
		return abs;
						
	}
	
	public static Map findDuplicate(String agr) {
		
		Map<Character , Integer> ab = new HashMap<Character , Integer>();
		
		for(int i =0; i < agr.length(); i++) {
			
			if(!ab.containsKey(agr.charAt(i))) {
				ab.put(agr.charAt(i), 1);
			}
			else {
				ab.put(agr.charAt(i),ab.get(agr.charAt(i)) +1);
			}
		}
		return ab;
	}
		public static void  funceb(int[] ab) {
			
			try {
			int size = ab.length;
			if(size%2==0) {
				System.out.println("not odd in size");
			}
			int leftSide= 0;
			int rightSide = 0;
			int midd = ab.length/2;
			for(int i=0; i<ab.length; i++) {
				if(i < ab.length/2 ) {
				leftSide = leftSide + ab[i];
				}
				else if  (i > midd){
				rightSide = rightSide + ab[i];
				}
			}
			
			if(leftSide<rightSide) {
				System.out.println(leftSide + "LHF is less than RHS"+ rightSide );
			}
			if(leftSide>rightSide) {
				System.out.println("LHF > RHS");
			}
			}
			catch(NumberFormatException e) {
				System.out.println("not ints");
			}
	}
	
	public static void main(String[] ab) {
		
		//System.out.println("replaced string is : " +Abc.replace("Neeraj"));
		//Abc.findDuplicate("This is Pune");
		int[] a = {1,2,3,4,5};
		Abc.funceb(a);
	}
}
