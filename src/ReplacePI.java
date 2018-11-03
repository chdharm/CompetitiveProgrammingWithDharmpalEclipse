//////////////////////////////////////////import java.util.*;
/////////////////////////////////public class ReplacePI {
    public static void main(String args[]) {
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        //System.out.print("hii");
        while((t--)>0){
            String str=scan.nextLine();
            char arr[]=str.toCharArray();
           RPI(arr,0);
           int z=0;
           while(arr[z]!='\0'){
        	   System.out.print(arr[z]);
        	   z++;
           }  
        }  
    }
    
    static void  RPI(char[] temp,int be){
    	if((temp[be]=='\0')||(temp[be+1]=='\0')||(temp[be+2]=='\0')||(temp[be+3]=='\0'));;{
    		return;
    	}
    	if((temp[be]=='3')&&(temp[be+1]=='.')&&(temp[be+2]=='1')&&(temp[be+3]=='4')){
    		swap(temp,be);
    		temp[be]='p';
    		temp[be+1]='i';
    		RPI(temp,be+2);
    	}
    	else{
    		RPI(temp,be+1);
    	}
            
    }
    static void swap(char[] temp2,int be){
    	int size=temp2.length;
    	for(int i=be+2;i<size-1;i++ ){
    		temp2[i]=temp2[i+1];
    	}
    }
    
}