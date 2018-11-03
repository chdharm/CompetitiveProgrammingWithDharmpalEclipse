package SamsungHiring;
import java.util.*;
import java.util.Comparator;
 
public class GoodSubarray2  {
	private static List<Integer[]> allPairs(int [] myArray) {
	    List<Integer[]> res = new ArrayList<>();
	    for (int i = 0; i < myArray.length; i++) {
	        for (int j = i; j < myArray.length; j++) {
	            Integer[] tmp = new Integer[2];
	            tmp[0] = myArray[i];
	            tmp[1] = myArray[j];
	            res.add(tmp);
	        }
	    }
	    return res;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		while((t--)>0){
			int size=scan.nextInt();
			int arr[]=new int[size];
			for(int i=0;i<size;i++){
				arr[i]=scan.nextInt();
			}
			List<Pair> list = new ArrayList<Pair>();
			
	 
			Collections.sort(list, new Pair());
			
			Integer currentMaxIndex = list.get(0).getSecond();
			Integer finalAnswer = -1;
			for(int i = 1; i < list.size(); i++){
				Pair p = list.get(i);
				if(currentMaxIndex > p.getSecond()){
					p.setLongestFromCurrent(currentMaxIndex - p.getSecond() + 1);
				}
				else{
					currentMaxIndex = p.getSecond();
				}
				finalAnswer = finalAnswer < p.getLongestFromCurrent() ? 
									p.getLongestFromCurrent(): finalAnswer;
			}
			
			System.out.println("Longest SubArray length: "+finalAnswer);
		}
	}
	
}
 
class Pair implements Comparator<Pair>{
 
	private Integer first;
	private Integer second;
	private Integer longestFromCurrent;
 
	Pair(){
		this.first = 0;
		this.second = 0;
		this.longestFromCurrent = 1;
	}
 
	Pair(Integer first, Integer second){
		this.first = first;
		this.second = second;
		this.longestFromCurrent = 1;
	}
 
	public int compare(Pair a, Pair b){
		if(a.first == b.first){
			return b.second - a.second;
		}
		return a.first - b.first;
	}
 
	public String toString(){
		return "First: "+this.first+", Second: "+this.second + ", 	Length of Longest Subarray From Current: " + this.longestFromCurrent;
	}
 
	public Integer getLongestFromCurrent(){
		return longestFromCurrent;
	}
 
	public void setLongestFromCurrent(Integer longestFromCurrent){
		this.longestFromCurrent = longestFromCurrent;
	}
 
	public Integer getFirst(){
		return first;
	}
 
	public Integer getSecond(){
		return second;
	}
 
}