import java.util.*;
class Twenty
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
	int cp,sp ,loss, profit;
	System.out.println("\n Enter cp:");
	cp=sc.nextInt();
	System.out.println("\n Enter sp:");
	sp=sc.nextInt();
	if(cp>sp)
	{
	 loss=cp-sp;
	 System.out.println("loss:"+loss);
	}
	else if(sp>cp)
	{
	 profit=sp-cp;
	  System.out.println("profit:"+profit);
	}
	 else if(cp==sp)
	 {
	 System.out.println("no profit no loss");
     }	 
	}
}	