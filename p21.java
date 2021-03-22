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
public class p21 {
   
    
    static int add(int x,int y){
        int carry;
        while(y!=0){
            carry=x & y;
            x=x^y;
        y=carry<<1;
        
    }    
    return x;
    
    }
    public static void main(String[] arr){
      Scanner s=new Scanner(System.in);
      System.out.println("enter the number to be added");
      int x=s.nextInt();
      int y=s.nextInt();
      System.out.println("addition:"+add(x,y));
     
    }
    
}



    