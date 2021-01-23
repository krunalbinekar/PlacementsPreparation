package com.excercise1;

public class OctalToBinaryConversion {

	static String OctToBin(String octnum) 
	{ 
	    long i = 0; 
	   
	    String binary = ""; 
	      
	    while (i<octnum.length()) { 
	          
	        char c=octnum.charAt((int)i); 
	        switch (c) { 
	        case '0': 
	            binary += "000"; 
	            break; 
	        case '1': 
	            binary += "001"; 
	            break; 
	        case '2': 
	            binary += "010"; 
	            break; 
	        case '3': 
	            binary += "011"; 
	            break; 
	        case '4': 
	            binary += "100"; 
	            break; 
	        case '5': 
	            binary += "101"; 
	            break; 
	        case '6': 
	            binary += "110"; 
	            break; 
	        case '7': 
	            binary += "111"; 
	            break; 
	        default: 
	            System.out.println( "\nInvalid Octal Digit "+ octnum.charAt((int)i)); 
	            break; 
	        } 
	        i++; 
	    } 
	   
	    return binary; 
	} 
	
	
	public static void main(String[] args) {
		
		String octnum = "345"; 
		   
	    
	    System.out.println( "Equivalent Binary Value = "+ OctToBin(octnum)); 
	}

}
