import java.util.*;
/////////////////////////public class TowerOfHanoi {

	//////////////////////public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int size=scan.nextInt();
		char [] A=new char[size];
		char [] B=new char[size];
		char [] C=new char[size];
		toh(n,A,B,C);
	}
	
	static void toh(int num,char[] temp1,char[] temp2,char[] temp3 ){
		if(num==0){
			return;
		}
		if(num==1){
			System.out.println("Send element:"+num +"th disk from source to destination");
			toh();
			return;
		}
		if(num>1){
			System.out.println("Send element:"+num +"th disk from source to auxillary");
			toh(num-1,temp1,temp2,temp3);
		}
		
	}
}
