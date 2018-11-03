import java.util.*;
public class PowerFunctionWithinLogN {

	public static void main(String [] args){
		Scanner scan=new Scanner(System.in);
		int x=scan.nextInt();
		int y=scan.nextInt();
		System.out.println(myPow(x,y));
	}
	
	static int myPow(int x,int y){
		if(y==0){
			return 1;
		}
        return x*myPow(x,y-1);
	}
}
