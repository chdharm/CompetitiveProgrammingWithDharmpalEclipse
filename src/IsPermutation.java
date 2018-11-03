import java.util.*;
public class IsPermutation {
    static boolean result=true;
	static int [] arr=new int[26];
	public static void main(String [] args){
		Scanner scan=new Scanner(System.in);
		char[] str1=scan.next().toCharArray();		
		char[] str2=scan.next().toCharArray();
		for(int i=0;i<str1.length;i++){
			arr[str1[i]-'a']++;
			arr[str2[i]-'a']--;
		}
		for(int i=0;i<arr.length;i++){
             if(arr[i]>0){
            	result=false; 
            	 break;
             }
		}
		System.out.println(result);
        
	}
}
