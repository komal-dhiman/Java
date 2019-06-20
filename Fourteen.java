import java.util.*;
class Fourteen
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
	int num,rem,sum;
	System.out.println("\n Enter any five digit number:");
	num=sc.nextInt();
	
	rem=num%10;
	sum=rem;
	num=num/10;
	
	rem=num%10;
	sum=rem+sum;
	num=num/10;
	
	rem=num%10;
	sum=rem+sum;
	num=num/10;
	
	rem=num%10;
	sum=rem+sum;
	num=num/10;
	
	rem=num%10;
	sum=rem+sum;
	num=num/10;
	
	rem=num%10;
	sum=rem+sum;
	num=num/10;
	
	System.out.println("\n sum of digits:"+sum);
  }
}  