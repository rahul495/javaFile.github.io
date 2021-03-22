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
public class p22 {
    public static void main(String []arr)
    {
        Scanner s=new Scanner(System.in);
     System.out.println("enter the number");
     int num=s.nextInt();
     int n=num;
     int rev=0,rmd;
     while(n>0){
         rmd=num%10;
         rev=rev*10+rmd;
         num=num%10;
     }
     if(rev==n){
         System.out.println("palindogram");
     }
     else
     {
         System.out.println("not palindogram"); 
         }
    
    
    
}
    }