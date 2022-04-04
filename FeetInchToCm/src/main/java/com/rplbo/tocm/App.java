package com.rplbo.tocm;


import java.util.Scanner;


public class App
{
   static double FeetInchToCm(int Inches) {
       double centimeter;
       centimeter = 2.54 * Inches;
       System.out.printf("Nilai dalam Centimeter: %.2f \n", centimeter);
       return 0;
   };

   static double FeetInchTocm(int Feet){
       double centimeter;
       centimeter = 30.48 * Feet;
       System.out.printf("Nilai dalam Centimeter: %.2f\n", centimeter);
       return 1;
   };


   public static void main(String args[])
   {
       int Inches = 20;
       FeetInchToCm(Inches);
       int Feet = 20;
       FeetInchToCm(Feet);
   }
}


