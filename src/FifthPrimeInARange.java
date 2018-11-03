import java.util.*;
public class FifthPrimeInARange {

	public static void main(String [] args){
		Scanner scan=new Scanner(System.in);
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		int count=0;
		for(int i=num1+1;i<=num2;i++){
			if(i==2){
				count++;
				continue;
			}
			if((i<2)||i%2==0){
				continue;
			}
			int isprime=1;
			for(int j=3;j<(i/2);j=j+2){
				if(i%j==0){
					isprime=0;
					break;
				}
			}
			if(isprime==1){
				//System.out.println(i);
				count++;
				if(count==5){
					System.out.println(i);
					break;
				}
				//count++;
			}
		}
		if(count<5){
			System.out.println(0);
		}
	}
}
