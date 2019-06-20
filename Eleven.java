import java.util.*;
class Eleven
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
	int Temp ;
	float celsius;
	System.out.println("\n Enter temperature:");
	Temp=sc.nextInt();
	celsius=(Temp-32)*5/9;
    System.out.println("\n conversion from temperature to celsius is :"+celsius);
  }
}  
