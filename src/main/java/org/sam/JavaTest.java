package org.sam;

import java.util.Scanner;

public class JavaTest 
{
    public static void main(String[] args) 
    {
       Scanner s =new Scanner(System.in);
       System.out.println("Enter the string:");
       String s1= s.next();
       String rev = "";
       
       for(int i=0;i<s1.length();i++)
       {
    	    rev= rev+s1.charAt(i);
    	    if(i==3)
    	    {
    	    	continue;
    	    }
    	    else if(i==4)
    	    {
    	    	break;
    	    }
    	    System.out.println(rev);
       }  	   
       
	}
}
