import java.util.*;
class Seven
{
  public static void main(String[] args)
  {
     Scanner sc =new Scanner(System.in);
	 int hrs,mins,Total_mins;
	 System.out.println("\n Enter hours:");
	 hrs=sc.nextInt();
	 System.out.println("\n Enter minutes:");
	 mins=sc.nextInt();
	 Total_mins=(hrs*60)+mins;
	 System.out.println("Total minutes is:"+Total_mins);
  }	 
}     