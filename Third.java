import java.util.*;
class Third
{
 public static void main(String[] args)
 {
    Scanner sc = new Scanner(System.in);
	int n1,n2,n3,n4,n5,n6,n7;
	float n8,n9,n10,sum;
	System.out.println("\n Enter first number:");
	n1=sc.nextInt();
    System.out.println("\n Enter second number:");
	n2=sc.nextInt();
	System.out.println("\n Enter third number:");
	n3=sc.nextInt();
    System.out.println("\n Enter four number:");
	n4=sc.nextInt();
	System.out.println("\n Enter fifth number:");
	n5=sc.nextInt();
    System.out.println("\n Enter sixth number:");
	n6=sc.nextInt();
	System.out.println("\n Enter seventh number:");
	n7=sc.nextInt();
    System.out.println("\n Enter eight number:");
	n8=sc.nextFloat();
    System.out.println("\n Enter ninth number:");
	n9=sc.nextFloat();
	System.out.println("\n Enter tenth number:");
	n10=sc.nextFloat();
	sum=n1+n2+n3+n4+n5+n6+n7+n8+n9+n10;
	System.out.println("\n The sum is :"+sum);
	System.out.println("\n [" + n1 + "+" + n2 + "+" + n3 + "+" + n4 + "+" + n5 + "+" + n6 + "+" + n7 + "+" + n8 + "+" + n9 + "+" + n10 + "=" + sum + "]");
	}
}