package Iteration;
import java.util.*;
public class SwappingNumbers {

	
	
	public static void main(String [] args){
		Scanner scan=new Scanner(System.in);
		int data1=scan.nextInt();
		int data2=scan.nextInt();
		System.out.println("Data1: "+data1+"   Data2:"+data2);
		data2=(data1^data2)^(data1=data2);
		System.out.println("Data1: "+data1+"   Data2:"+data2);
	}
}
