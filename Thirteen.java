import java.util.*;
class Thirteen
{
  public static void main(String[] args)
  {
   Scanner sc=new Scanner(System.in);
   int bs;
   float da,hr;
   System.out.println("\n Enter basic salary:");
   bs=sc.nextInt();
   da=40*bs/100;
   System.out.println("\n 40% darkness allowance of basic salary:"+da);
   hr=20*bs/100;
   System.out.println("\n 20% of house rent of basic salary:"+hr);
  } 
}  
   