/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rahul sharma
 */
import java.util.Scanner;
class percentage
{
    private static String result;
    public static void main(String[] arr){
        double x=0,y=0;
        Scanner s=new Scanner(System.in);
       System.out.println("enter the value of x:");
       x=s.nextDouble();
        System.out.println("enter the value of y:");
       y=s.nextDouble();
        System.out.println("calculte percentage(x% of y)");
         System.out.println();
          System.out.println(x+"% of" +y +"is"+result);
           System.out.println();
    }
}