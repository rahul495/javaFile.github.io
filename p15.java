import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rahul sharma
 */
public class p15 {
    
   public static void main(String[] arr)
{

  int n,year =2018;
  Scanner s=new Scanner(System.in);
  System.out.println("enter the year ");
  n=s.nextInt();
  if((year%400==0) || ((year%4==0)&&(year%100!=0)))
  {
           System.out.println("year is a leap year");
           
  }
           else
  {
           System.out.println("year is not leap year");
                       
      }

}     
}
