package ApstekHiring;

import java.util.*;
class TestClass2 {
    public static int getSpecialSum(int [] arr,int index){
        int re=0;
        int cn=0;
        for(int i=index;i<arr.length;i=(i+cn)){
            cn++; 
            try{
            	int localsum=0;
                for(int j=i;j<(i+cn);j++){
                    localsum+=(arr[j]);
                }
                re+=localsum;
            }catch(Exception e){
                return re;
            }
        }
        return re;
    }
    public static void main(String args[] ) throws Exception {
        
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int [] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int maxSum=0;
        for(int i=0;i<n;i++){
        	
            int re=getSpecialSum(arr,i);
            //System.out.println(re+"------------>"+i);
            if(re>maxSum)
                maxSum=re;
        }
        System.out.println(maxSum);
    }
}
