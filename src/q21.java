
public class q21 {
	public static void main(String[] args)
	{
		int a=56,b=125,c=88;
		{
			for(int i=a;i<=c;i++)
			{
				System.out.println(i);
			}
			for(int j=a;j<=b;j++)
			{	
				if(j%2==0)
				{
				}
				else
				{
				System.out.println("odd numbers is " +j);
				}
				
	
			}
			int sum=0,l=10;
			for(int i=a;i<=c;i++)
			{
				sum=sum+i;
				l=sum/l;
				l++;
			}
			System.out.println("sum of all numbers " +sum);
			System.out.println("avrage " +l);
			
			
		}
		
	}

}
