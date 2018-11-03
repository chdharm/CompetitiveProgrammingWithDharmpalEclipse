import java.util.*;
public class NoOfSetBits2 {

	static int count=0;
	public static void main(String [] args){
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		while(num!=0){//we are checking whether the number is equal to zero because at the time all bits will become zero no need to proceed.
			if((num&1)>0){//this will give a result either o or 1 based on the last bit of num.
				count++;
				num=num>>1;//one right shift for checking next bits.
				
			}
			else{
				num=num>>1;
			}
		}
		System.out.println(count);
	}
	
}
