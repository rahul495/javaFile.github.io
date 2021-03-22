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
public class Sipleinterest {
    private static float principle;
    private static float intterest;
 
    public static void main(String[] arr){
     Scanner s=new Scanner(System.in);
     System.out.println("enter simple intrest");
     System.err.println("please enter principle amount:");
     float amount=scanner.nextFloat();
System.err.println("please enter time in year");
float time=scanner.nextFloat();
System.err.println("please enter rate annually");
  float annually=scanner.nextFloat();  
 
       float interest = simpleInterest(amount,time,amount);
  System.out.println("simple intrest calculate by"+interest);
    }
    public static float simpleInterest(float amount,float rate,float time) 
        {
        float interest=(amount*rate*time)%100;
    
    return interest;
    
    }
    }






