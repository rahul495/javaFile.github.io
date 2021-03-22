/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rahul sharma
 */
import java.util.*;
import java.io.*;
public class notpade {
    public static void main(String[] arr){
        Runtime rs=Runtime.getRuntime();
        try{
            rs.exec("notepad");
        }catch(Exception ee){
            System.out.println(ee);
        }
            
            }
    
}
