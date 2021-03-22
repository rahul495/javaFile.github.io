
import java.util.Scanner;
public class swappingwithout3variable {
    
    public static void main(String[] arr){ 
        int x,y;
       Scanner s=new Scanner(System.in);
      System.out.println("enter x and y:-");
  x=s.nextInt();
      y=s.nextInt();
       System.out.println("before swapping /nx="+x+"/ny="+y);
       x=x+y;
       y=x-y;
       x=x-y;
       System.out.println("after swapping /nx="+x+"/ny="+y);
    }
}