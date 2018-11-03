import java.util.*;
public class NoOfSetBits {
     
	static int count=0;
	public static void main(String [] args){
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
		System.out.println(compOne(N));
	}
	static int compOne(int num){
		if(num<=0){
			return count;
		}
		if((num%2)==0){
			compOne(num/2);
		}
		else{
			count++;
			compOne(num/2);
		}
		return count;
	}
	
}
