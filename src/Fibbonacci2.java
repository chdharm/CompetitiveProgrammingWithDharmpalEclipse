import java.util.Scanner;
public class Fibbonacci2 {

	
	//static int total=0;
	public static void main(String [] args){
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		System.out.println(getFibonacci(num));
	}
	
	public static int getFibonacci(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 1;
        }
        return getFibonacci(n - 1) + getFibonacci(n - 2);
}


//Read more: http://javarevisited.blogspot.com/2015/01/print-fibonacci-series-in-java-using.html#ixzz4kQ9ADJXc

}
