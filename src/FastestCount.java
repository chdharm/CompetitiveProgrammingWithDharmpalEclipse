import java.util.*;

.//////////////public class FastestCount {
    public static void main(String args[]) {
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        while((t--)>0){
            int num=scan.nextInt();
            int [] arr=new int[num];
            int minr=scan.nextInt();
            int max=scan.nextInt();
            while((num--)>0){
                arr[num-1]=scan.nextInt();
            }
            for(int i=0;i<num;i++){
                System.out.print(arr[i]+" ");
            }
        }
        
    }
}