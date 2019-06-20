import java.util.*;
class Five
{
  public static void main(String[] args)
  { 
    Scanner sc = new Scanner(System.in);
	int l,b,h,aor,por,r;
	double pi=3.14,cor;
	System.out.println("\n Enter length :");
	l=sc.nextInt();
	System.out.println("\n Enter breadth :");
	b=sc.nextInt();
    System.out.println("\n Enter height :");
	h=sc.nextInt();
	aor=l*b*h;
	System.out.println("\n area of rectangle :"+ aor);
	por=2*(l+b);
	System.out.println("\n perimeter of rectangle :"+por);
	System.out.println("\n Enter radius :");
	r=sc.nextInt();
	cor=3.14*(r*r);
	System.out.println("\n circumference of rectangle :"+ cor);

	
  }
}