import java.util.*;
class Nine
{
  public static void main(String[] args)
  {
   Scanner sc = new Scanner(System.in);
   int mins,hr;
   System.out.println("\n Enter minutes:");
   mins=sc.nextInt();
   hr=(mins/60);
   System.out.println("\n Hour is:"+hr);
   mins=(mins%10);
   System.out.println("\n minutes is:"+mins);
  }
}  
   
   
    
