package GEDigital;

public class Third {

	public static void main(String [] args){
		System.out.println(m1(10));
	}
	public static int m2(int count){
		throw new ArithmeticException ();
		//return 10;
	}
	public static int m1(int x) { 
		int count=1; 
		try { 
		count += x; 
		count += m2(count); 
		count++; 
		} 
		catch(Exception e) { count -= x; } 
		return count; 
		} 
}
