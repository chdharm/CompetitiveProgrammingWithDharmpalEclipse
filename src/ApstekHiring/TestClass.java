package ApstekHiring;
import java.util.*;
class TestClass {
    public static void changeNumberAtIndex(int [] arr,int index){
        if(arr[index]==0){
            arr[index]=1;
        }
    }
    public static String getRightAndLeftIndexWithValue1(int [] arr,int index){
        String result="";
        for(int i=0;i<index;i++){
            if(arr[i]==1){
                result=""+i;
            }
        }
        if(result==""){
            result="-1";
        }
        for(int i=index+1;i<arr.length;i++){
            if(arr[i]==1){
                result+=(" "+i);
                break;
            }
        }
        return result;
    }
    public static void main(String args[] ) throws Exception {
        Scanner scan = new Scanner(System.in);
        int sArr = scan.nextInt();
        int arr[]=new int[sArr];
        int nQrr=scan.nextInt();
        for(int i=0;i<sArr;i++){
            arr[i]=scan.nextInt();
        }
        for(int i=0;i<nQrr;i++){
            if(scan.nextInt()==1){
                changeNumberAtIndex(arr,scan.nextInt());
            }else{
                System.out.println(getRightAndLeftIndexWithValue1(arr,scan.nextInt()));
            }
        }
        
    }
}
