//********************************************************************//  Leap_Years.java//  Steven Smail
////  Determines if a year is a leap year in the Gregorian calendar //********************************************************************import java.util.Scanner;public class Leap_Years{
  public static void main (String[] args)  {
    int year;

    Scanner scan = new Scanner (System.in);    System.out.print("Enter a year greater than 1581: ");    year = scan.nextInt();
    System.out.println("The year is " + (year));

    //Checking for year >= 1582 & error message
    if (year < 1582)    {      System.out.println("The year must be greater than 1581");
      System.out.println();
    }
    else    {
      //Checking for divisible by 4
      if (year % 4 != 0)      {        System.out.println((year) + " is not a leap year");
        System.out.println();
      }
      else      {
        //Checking for divisible by 100
        if (year % 100 != 0)
        {          System.out.println((year) + " is a leap year");
          System.out.println();
        }

        else
        {
          //Checking for divisible by 400
          if (year % 400 == 0)
          {
            System.out.println((year) + " is a leap year");
            System.out.println();
          }
          else
          {
            System.out.println((year) + " is not a leap year");
            System.out.println();
          }
        }
      }    }   }
}