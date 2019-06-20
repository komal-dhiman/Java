import java.util.*;
class Ten
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
	int n1,n2,temp;
	System.out.println("\n Enter first number:");
	n1=sc.nextInt();
	System.out.println("\n Enter Second number:");
	n2=sc.nextInt();
	System.out.println("\n Before interchanging two numbers: \n n1=" + n1 +" \n n2=" + n2);
	temp=n1;
	n1=n2;
	n2=temp;
	System.out.println("\n After interchanging two numbers: \n n1=" + n1 +" \n n2=" +n2 );
	
  }
}  