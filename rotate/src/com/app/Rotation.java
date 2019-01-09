package com.app;

public class Rotation {
	public static void main(String[] args) {
		String s1=new String("pineapple");
		String s2=new String("pi");
		
		
		if(s1.contains("pi")){
		    s1=s1.replace("pi", "");
		    s1=s1+s2;
		    System.out.println(s1);
		}
	}

}
