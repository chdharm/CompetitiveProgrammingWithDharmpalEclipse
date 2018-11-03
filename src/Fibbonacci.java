import java.util.*;
public class Fibbonacci {

	
	//static int total=0;
	public static void main(String [] args){
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		System.out.println(fib(num));
	}
	
	static int fib(int num){
		if(num==0){
			return 0;
		}
		if(num==1){
			return 1;
		}
		return fib(num-1)+fib(num-2);
	}
}
