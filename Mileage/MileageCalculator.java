/* *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *
*  Project  :  A04d- Mileage                                                  *
*  File     :  MileageCalculator.java                                         *
*  Name     :  Joe Dimmick                                                    *
*  Date     :  Created: 2 Mar 2017 (Due 2 Mar 2017)                           *
*                                                                             *
*  Description: Drivers are concerned with the mileage their automobiles get. * 
*  One driver has kept track of several tankfuls of gasoline by recording the *   
*  miles driven and gallons used for each tankful. Develop a Java application *
*  that will input the miles driven and gallons used (both as integers) for   *
*  each tankful. The program should calculate and display the miles per gallon*
*  obtained for each tankful and print the average miles per gallon obtained  * 
*  for all tankfuls.                                                          *
*                                                                             *
*  Specifications:   1- All average calculations should display floating point*
*                    decimals.                                                *
*                    2- Use sentinel-controlled repetition to obtain the data *
*                    from the user.                                           *
*  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  */
public class MileageCalculator
{
   //variable declarations
   private int miles, gallons, totalMiles, totalGallons;
   private double mpg, aveMPG;
       
   //accessor methods
   //get mpg
   double getMPG ()
   {
      return mpg;
   }
   
   //get aveMPG
   double getAveMPG ()
   {
      return aveMPG;
   }
   
   //mutator methods
   //setMiles
   public void setMiles (int miles)
   {
      this.miles = miles;
   }
    
   //setGallons
   public void setGallons (int gallons)
   {
      this.gallons = gallons;
   }
      
   //utility methods
   //calculate mpg
   public void calculateMPG (int miles, int gallons)
   {
      mpg = (double) miles / gallons;
      totalMiles += miles;
      totalGallons += gallons;
      //print mpg
   }
   
   //calculate ave mpg
   public void calculateAveMPG ()
   {
      aveMPG = (double) totalMiles / totalGallons;
      //print ave mpg
   }
}//end MileageCalculator