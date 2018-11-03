package RapidoHiring;
import java.util.*;
public class FailedCurrenyDenominationGift {
	
	public static void main(String [] args){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int [] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=scan.nextInt();
		}
		int start=arr[n-1];
		int last=start*10;
		int flag=0;
		int result=0;
		for(int i=start;i<last;i++){
			if(flag==1){
				break;
			}
			int re=dynamicChange(arr,i);
			if(re==-1){
				result=i;
				flag=1;
			}
		}
		if(flag==1){
			System.out.println(result);
		}else{
			System.out.println("Fake Offer!");
		}
	}
	
	//coin change function which gives count if we can form the given number using that formation else return -1
	public static int dynamicChange(int[] coins, int amount) {

	    int[] changes = new int[amount+1];

	    for (int i = 1; i <= amount; i++) {
	        int minChange = Integer.MAX_VALUE/2;
	        // loop over all coins which yield a non-negative remainder
	        for (int j = 0; j < coins.length; j++) {
	            if (coins[j] <= i) {
	                if (changes[i-coins[j]] < minChange) {
	                    minChange = changes[i-coins[j]];
	                }
	            }
	        }
	        changes[i] = minChange + 1;
	    }
	    return changes[amount] < Integer.MAX_VALUE/2 ? changes[amount] : -1;
	}
}
