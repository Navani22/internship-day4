package internship.day4;

import java.util.Scanner;

public class Practice2 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Student Name :");
    String studName = sc.next();
    System.out.println("Enter Student Marks for Subject 1 :");
    float studMark1 = sc.nextFloat();
    System.out.println("Enter Student Marks for Subject 2 :");
    float studMark2 = sc.nextFloat();
    System.out.println("Enter Student Marks for Subject 3 :");
    float stuMark3 = sc.nextFloat();

    float totalMarks = studMark1 + studMark2 + stuMark3;
    float percentage = totalMarks / 3;

    if (percentage >= 40) {
      if (studMark1 >= 33 && studMark2 >= 33 && stuMark3 >= 33) {
        System.out.println(studName + " passed the exam by " + percentage + " %");
      } 
    }else {
        System.out.println(studName + " Failed the exam ");
      }
    
    sc.close();

  }
}