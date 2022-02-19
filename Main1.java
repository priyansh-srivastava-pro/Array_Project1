import java.util.*;
class Main1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("How many day's Temperature?");
    int numDays = sc.nextInt();
    int[] temp = new int[numDays];
    int sum = 0;
    for(int i=0; i<numDays; i++) {
      System.out.print("Day" + (i+1) +"'s high temperature: ");
      temp[i] = sc.nextInt();
      sum = sum + temp[i];
    }
    double average = sum / numDays;
    System.out.println();
    System.out.println("Average Temperature = "+ average);
  }
}