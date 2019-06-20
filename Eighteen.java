import java.util.*;
class Eighteen
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
	int n1,n2,n3;
	System.out.println("\n Enter first number:");
	n1=sc.nextInt();
	System.out.println("\n Enter second number:");
	n2=sc.nextInt();
	System.out.println("\n Enter third number:");
	n3=sc.nextInt();
	if(n1>n2)
	   if(n1>n3)
	   {
	  System.out.println("\n n1 is greatest number");
	   }
	   else
	   {
	   System.out.println("\n n3 is greatest number");
	   }
	 else  if(n2>n3)
	{ 
	   System.out.println("\n n2 is greatest number");
	}
     else
     {
       	System.out.println("\n n3 is greatest number");
     }
   }
}	 
	 