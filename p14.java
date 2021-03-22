
import static com.sun.org.apache.xerces.internal.util.FeatureState.is;

class p14
{ 
   public static void main(String[] arr)
{
  int year=2018;
  if((year%400==0) || ((year%4==0)&&(year%100!=0)))
  {
           System.out.println("year is a leap year");
           
  }
           else
  {
           System.out.println("year is not leap year");
                       
      }

}     }