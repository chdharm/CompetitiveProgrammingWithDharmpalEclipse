package LeetCode;
import java.util.*;
public class First {
	public static void main(String [] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int as=scan.nextInt();
		int arr[]=new int[as];
		System.out.println("Enter the numbers:");
		for(int i=0;i<as;i++){
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter The target Element");
		int target=scan.nextInt();
		First obj=new First();
		System.out.println("Printing the resultant array here:");
		int rearr[]=obj.twoSum(arr,target);
		int ras=rearr.length;
		for(int i=0;i<ras;i++){
			System.out.println(rearr[i]);
		}
	}
	public int[] twoSum(int[] nums, int target) {
        //Arrays.sort(nums);
        int r=nums.length;
        int [] re=new int[2];
        for(int i=0;i<r;i++){
            for(int j=i+1;j<r;j++){
                if((nums[i]+nums[j])==target){
                    re[0]=i;
                    re[1]=j;
                }
            }
        }
        return re;
    }    
}
