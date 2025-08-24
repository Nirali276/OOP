public class pr2_1
{
	public static void main(String[] args)
	{
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
 
		
		if(a > b && a > c)
		{
		 System.out.println("A:" + a);
		 System.out.println("A is maximum");
		}
		else if(b > a && b > c)
		{
		 System.out.println("B:" + b);
		 System.out.println("B is maximum");
		}
		else if(c > a && c > b)
		{
		 System.out.println("C:" + c);
		 System.out.println("B is maximum");
		}
		else{
			System.out.println("All are equals");
		}
	}
}
