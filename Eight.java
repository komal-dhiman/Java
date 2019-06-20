import java.util.*;
class Eight
{
  public static void main(String[] args)
  {
     Scanner sc = new Scanner(System.in);
	  int s1,s2,s3,s4,s5,Total_marks;
	  float Percentage;
	  System.out.println("\n Enter first subject marks:");
	  s1 = sc.nextInt();
	  System.out.println("\n Enter second subject marks:");
	  s2 = sc.nextInt();
	  System.out.println("\n Enter third subject marks:");
	  s3 = sc.nextInt();
	  System.out.println("\n Enter fourth subject marks:");
	  s4 = sc.nextInt();
	  System.out.println("\n Enter fifth subject marks:");
	  s5 = sc.nextInt();
	  Total_marks=s1+s2+s3+s4+s5;
	  System.out.println("\n Total marks is :"+Total_marks);
	  Percentage=(Total_marks*100)/500;
	  System.out.println("\n Percentage is :"+Percentage);
  }
}
	  
	  