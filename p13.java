import java.util.Scanner;
class p13
{
    public static void main(String[] arr){
        int n,i,f=1;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter factorial number");
        n=s.nextInt();
        for(i=1;i<=n;i++)
          f=f*i;
           System.out.println("factorial"+f);
        
    }
}

