package CodingBlocks;
import java.util.*;
public class TypeChecking {
	static void m1(int a)
	{
		System.out.println("int");	
	}
	static void m1(double b)
	{
		System.out.println("double");		
	}
	static void m1(String c)
	{
		System.out.println("string");		
	}
	public static void main(String [] args){
		//call m1 method with argument , it will print you the type;
		m1(10);
		m1(12.10);
		m1("wfdjsghsf");
	}
}
