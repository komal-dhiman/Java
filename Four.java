import java.util.*;
class Four
{
  public static void main(String[] args)
  { 
    Scanner sc = new Scanner(System.in);
	int r;
	double pi=3.14,vos;
	System.out.println("\n Enter Radius :");
	r=sc.nextInt();
	vos=4*(3.14)*(r*r*r)/3;
	System.out.println("\n volume is:"+ vos);
  }
}