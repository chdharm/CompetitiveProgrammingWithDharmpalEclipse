package Basics;

import java.util.*;
import java.lang.*;
import java.io.*;
class First
 {
	public static void main (String[] args)
	 {
	  Scanner scan=new Scanner(System.in);
	  int n=scan.nextInt();
	  while((n--)>0){
		  scan.nextLine();
	      String temp=scan.nextLine();
	      //int data=scan.nextInt();
	      System.out.println("The input string :"+temp);
          //System.out.println("The input integer :"+data);
	  }
	 }
}