package com.indivisual.activity;

public class Palindrome {
	
	//method to check palidrome
	public static void checkForPalindrome(String s){
		StringBuilder sb=new StringBuilder();
		String s2=sb.append(s).reverse().toString();
		if(s.equals(s2)){
			System.out.println("given string is palindrome");
		}else{
			System.out.println("given string is not a palindrome");
		}
	}

	public static void main(String[] args) {
		
		checkForPalindrome("madam");
		checkForPalindrome("java");
	}

}
