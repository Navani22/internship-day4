package internship.day4;

import java.util.Scanner;

public class Practice3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float tax = 0;
    System.out.println("Enter your income to know the tax to be payed : ");
    float sal = sc.nextInt();
    if (sal <= 250000) {
      System.out.println("Tax to be payed is :" + tax + " Rs.");
    } else if (sal > 250000 && sal < 500000) {
      tax = tax + (sal - 250000) / 20;
      System.out.println("Tax to be payed is :" + tax + " Rs.");
    } else if (sal >= 500000 && sal < 1000000) {
      tax = tax + (sal - 250000) / 20;
      tax = tax + (sal - 500000) / 5;
      System.out.println("Tax to be payed is :" + tax + " Rs.");
    } else {
      if (sal >= 1000000) {
        tax = tax + (sal - 250000) * 0.05f;
        tax = tax + (sal - 500000) * 0.2f;
        tax = tax + (sal - 1000000) * 0.3f;
        System.out.println("Tax to be payed is :" + tax + " Rs.");
      }
    }

  }
}