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
public class table {
   
    public static void main(String []arr){
        int n,b;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number");
       n=s.nextInt();
               System.out.println("enter multiplication table of"+n+"is:-");
               for(b=1;b<=10;b++)
                           System.out.println(n+"*"+b+"="+(n*b));
                   }
    
    
               
    }

