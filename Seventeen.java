import java.util.*;
class Seventeen
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
	int age;
	System.out.println("\n Enter Age:");
	age=sc.nextInt();
	if(age>=18)
	{
	  System.out.println("\n Egligible for voting");
	}
	else
	{
	 System.out.println("\n Not egligible for voting");
	}
	}
}
