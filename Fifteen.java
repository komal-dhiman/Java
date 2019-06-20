import java.util.*;
class Fifteen
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
	int num,rev=0,rem;
	System.out.println("\n Enter three digit number:");
	num=sc.nextInt();
	
	rem=num%10;
	rev=rev*10+rem;
	num=num/10;

	rem=num%10;
	rev=rev*10000+rem*1000;
	num=num/10;
	
	
	rem=num%10;
	rev=rev+rem*100;
	num=num/10;
	
	rem=num%10;
	rev=rev+rem*10;
	num=num/10;
	
	rev=rev+num;
	
	System.out.println("\n Reverse of a number is:"+rev);
  }
}   