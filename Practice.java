import java.util.ArrayList;
import java.util.Scanner;
import java.lang.*;

public class Practice 
{
	static String x;
	static String y;
  
	public static void main(String args[])
  { 
	
    Practice obj = new Practice(); 
	System.out.println("Enter any two binary numbers number");
	Scanner s = new Scanner(System.in);
	
	 x = s.next();
	 y = s.next();
	 System.out.println("bin="+x);
	 double p = obj.convert(x);
	 System.out.println("bin="+y);
	 double q = obj.convert(y);
	 obj.add(p,q);
  }	
	
	
	public double convert(String bin)
	{
		
		int tmp = 0;
		double sum = 0;
	for(int i=bin.length()-1;i>=0;i--)
	{
      double a =Math.pow(2,tmp)* (Character.getNumericValue(bin.charAt(i)));
      
      sum=sum+a;
     
      tmp++;
      
	}
	//System.out.println("dec="+sum);
	return sum;
  }
	
private void add(double p, double q) 
    {
	  ArrayList al = new ArrayList();
	  int i=0;
	  int r = (int)p + (int)q;
	  while(r!=0)
	  {
	  int s = r%2;
	  al.add(i,s);
	  r=r/2;
	  i++;
	  }
	 
	  System.out.print("Result=");
	 for(int z=al.size()-1;z>=0;z--)
	  {
		
	    System.out.print(al.get(z));
	    
	  }
	  
	  
	}

  
}
