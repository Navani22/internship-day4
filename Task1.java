//Rock, Paper and Sisiors

package internship.day4;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random rn = new Random();
    System.out.println("Choose any one of the following options");
    System.out.println("Rock:1");
    System.out.println("Sissiors:2");
    System.out.println("Paper:3");
    int choice = sc.nextInt();
    switch (choice) {
      case 1 -> System.out.println("You choosed Rock");
      case 2 -> System.out.println("You choosed paper");
      case 3 -> System.out.println("You choosed seissor");
    }
    int r = rn.nextInt(1, 4);
    switch (r) {
      case 1 -> System.out.println("PC choosed Rock");
      case 2 -> System.out.println("PC choosed paper");
      case 3 -> System.out.println("PC choosed seissor");
    }
    if (choice == 1 && r == 1) {
      System.out.println("It's Draw!!!!!");
    } else if (choice == 1 && r == 2) {
      System.out.println("Yaay!! You win");
    } else if (choice == 1 && r == 3) {
      System.out.println("Ooops!! You Loose");
    } else if (choice == 2 && r == 1) {
      System.out.println("Ooops!! You Loose");
    } else if (choice == 2 && r == 2) {
      System.out.println("It's Draw!!!!!");
    } else if (choice == 2 && r == 3) {
      System.out.println("Yaay!! You win");
    } else if (choice == 3 && r == 1) {
      System.out.println("Yaay!! You win");
    } else if (choice == 3 && r == 2) {
      System.out.println("Ooops!! You Loose");
    } else if (choice == 3 && r == 3) {
      System.out.println("It's Draw");
    }

  }
}
