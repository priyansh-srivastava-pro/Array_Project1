import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("How many day's temperature?");
    int numDays = sc.nextInt();
    int sum = 0;
    for(int i = 1; i <= numDays; i++) {
      System.out.print("Day " + i + "'s temp is ");
      int next = sc.nextInt();
      sum = sum + next;
    }
    double average = sum / numDays;
    System.out.println();
    System.out.println("Average Temperature = "+ average);
  }
}