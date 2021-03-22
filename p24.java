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
public class p24 {
    public static void main(String []arr){
        int n,c;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number");
        n=s.nextInt();
         System.out.println("enter the multiplication table of"+n+"is:-");
        for(c=1;c<=10;c++)
        
             System.out.println(n+"*"+c+"="+(n*c));
      }
}
