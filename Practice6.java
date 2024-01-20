package internship.day4;

import java.util.Scanner;

public class Practice6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Write a link to check: ");
    String link = sc.nextLine();
    if (link.endsWith(".com")) {
      System.out.println("Its a commercial website");
    } else if (link.endsWith(".org")) {
      System.out.println("It's an organizational website");
    } else if (link.endsWith(".in")) {
      System.out.println("It's an Indian website");
    }
  }
}
