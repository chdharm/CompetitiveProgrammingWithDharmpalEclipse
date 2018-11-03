package Ideserve;
import java.util.*;
public class ToogleBit {

public static int findToogle(int n){
	int solution=0;
	int nextElement=1;
	while(n!=0){
		if((n&1)==0){
			solution=solution|nextElement;
		}
		n=n>>1;
		nextElement=nextElement<<1;
	}
	return solution;
}
public static void main(String [] args){
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	System.out.println(findToogle(n));
}
}
