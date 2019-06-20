import java.util.*;
class Twelve
{
  public static void main(String[] args)
  {
   Scanner sc=new Scanner(System.in);
   int km,m;
   double cm,inch, feet;
   System.out.println("\n Enter distance between two cities:");
   km=sc.nextInt();
   System.out.println("\n Convert kilometres to metres:");
   m=km*1000;
   System.out.println("\n metres :"+m);
   System.out.println("\n Convert kilometres to Feet:");
   feet=km*3280.8;
   System.out.println("\n feet :"+feet);
   System.out.println("\n Convert kilometres to inch:");
   inch=km*39370.0784;
   System.out.println("\n inches :"+inch);
   System.out.println("\n Convert kilometres to centimetres:");
   cm=km*100000;
   System.out.println("\n centimetres :"+cm);
  }
}  