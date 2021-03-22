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
public class swapping {
    
    public static void main(String[] arr){ 
        int x,y,temp;
       Scanner s=new Scanner(System.in);
      System.out.println("enter x and y:-");
  x=s.nextInt();
      y=s.nextInt();
       System.out.println("before swapping /nx="+x+"/ny="+y);
       temp=x;
       x=y;
       y=temp;
       System.out.println("after swapping/nx"+x+"/ny="+y);
    }
}
