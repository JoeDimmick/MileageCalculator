/* *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *
*  Project  :  A04d- Mileage                                                  *
*  File     :  MileageCalculatorTest.java                                     *
*  Name     :  Joe Dimmick                                                    *
*  Date     :  Created: 2 Mar 2017 (Due 2 Mar 2017)                           *
*                                                                             *
*  Description: Drivers are concerned with the mileage their automobiles get. * 
*  One driver has kept track of several tankfuls of gasoline by recording the *   
*  miles driven and gallons used for each tankful. Develop a Java application *
*  that will input the miles driven and gallons used (both as integers) for   *
*  each tankful. The program should calculate and display the miles per gallon*
*  obtained for each tankful and print the average miles per gallon obtained  * 
*  for all tankfuls. This will Test the MileageCalculator.java                *
*                                                                             *
*  Specifications:   1- All average calculations should display floating point*
*                    decimals.                                                *
*                    2- Use sentinel-controlled repetition to obtain the data *
*                    from the user.                                           *
*  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  */
import java.util.Scanner;

public class MileageCalculatorTest
{

   public static void main(String[] args)
   {
      //variables
      int miles , gallons;
      Scanner input = new Scanner(System.in);
      MileageCalculator mc = new MileageCalculator();
      
      //enter miles
      System.out.println("Please enter miles driven -1 to exit: ");
         miles = input.nextInt();
        
      //while miles != -1
      while (miles != -1)
      {   
         //Enter 
         System.out.println("Please enter gallons used: ");
            gallons = input.nextInt();
         //calculate and display mpg
         mc.calculateMPG(miles, gallons);
            System.out.printf("%nMPG = %.1f%n", mc.getMPG());
         //enter miles
         System.out.println("Please enter miles driven -1 to exit: ");
            miles = input.nextInt();         
      }
         
      //calculate and print ave mpg for all tankfulls
      mc.calculateAveMPG();
      System.out.printf("The total average: %.1f", mc.getAveMPG());
         
   }//end main()
}//end class MileageCalculatorTest