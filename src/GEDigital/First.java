package GEDigital;

public class First {
//Here we are initializing value of j in if condition and we all know that we can't rely that wheather if statement will execute or not
// so compiler will give error
public static void main(String [] args){
	int j; 
	for(int i=0;i<14;i++) { 
	if(i<10) { 
	j = 2 + i; 
	} 
	//System.out.println("j: " + j + " i: " + i); 
	} 
}
}
