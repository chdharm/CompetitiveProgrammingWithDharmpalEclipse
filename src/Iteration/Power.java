package Iteration;
import java.util.*;
public class Power {

	public static void main(String [] args){
		Scanner scan=new Scanner(System.in);
		int number=scan.nextInt();
		int exp=scan.nextInt();
		System.out.println(pow(number,exp));
	}

	public static int pow(int num,int exp){
		int power=1;
		while(exp>0){
			power*=num;
			exp--;
		}
		return power;
	}
}
