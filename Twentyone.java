import java.util.*;
class Twentyone
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int y;
	System.out.println("\n Enter year:");
	y=sc.nextInt();
	if(y%400==0||y%4==0&&y%100!=0)
	 {
	  System.out.println("leap year");
	 }
	 else
	 {
	  System.out.println("not leap year");
	 }
  }
}	