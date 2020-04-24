package com.indivisual.activity;

public class StringOperation {
	
	public static String removeGivenChar(String s, String st){
		String s1="";
		if(s.contains(st)){
			s=s.trim();
		    s1=s.replaceFirst(st, "");
		
		}
		return s1;
		
	}
	
	// method to compare two String
	public static void compareString(String s1, String s2){
		
		if(s1.equals(s2)){
			System.out.println("given strings are equal");
		}else{
			System.out.println("given strings are not equal");
		}
		
		
		
	}

	public static void main(String[] args) {

        String str=removeGivenChar("RESTASSURED", "ST");
        	
        System.out.println("after removing characters or string is "+str);
        
        String str2=removeGivenChar("helooworld", "wor");
        System.out.println(str2);
        
        compareString("java", "java");
        compareString("hi", "hello");

	}

}
