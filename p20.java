import static com.sun.org.apache.xerces.internal.util.FeatureState.is;
import static com.sun.org.apache.xerces.internal.util.PropertyState.is;
import java.util.Scanner;
import static sun.nio.cs.Surrogate.is;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rahul sharma
 */
public class p20 {
    private static boolean third;
   public static void main(String[] arr){
       Scanner s=new Scanner(System.in);
       System.out.println("enter the number");
       int x,y,z;
         x=s.nextInt();
         y=s.nextInt();
         z=s.nextInt();
         if(x>y && x>z)
         {
              System.out.println("first:is largest");
         }
          else if(y>x && y>z)
         {
              System.out.println("second:is largest");
         }
          
          else if(z>x && z>y)
         {
              System.out.println("third:is largest");
         }
          else
         {
              System.out.println("number is not distinect");
         }
   } 
}
