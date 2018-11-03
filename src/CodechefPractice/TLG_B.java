package CodechefPractice;
import java.util.*;
public class TLG_B {
 public static void main(String[] args) {
  int winner = 0, first, second, difference = 0;
  Scanner scan = new Scanner(System.in);
  int roundes = scan.nextInt();
  int localDiff = 0;
  while ((roundes--) > 0) {
   first = scan.nextInt();
   second = scan.nextInt();
   if (first > second) {
    localDiff = first - second;
    if (localDiff > difference) {
     difference = localDiff;
     winner = 1;
    }
   } else {
    localDiff = second - first;
    if (localDiff > difference) {
     difference = localDiff;
     winner = 2;
    }
   }
  }
  System.out.println(winner + " " + difference);
 }
}