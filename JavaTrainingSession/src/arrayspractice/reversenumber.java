package arrayspractice;

public class reversenumber {
	public static void main(String[] args)
	{
		int num=1235555523;
		numberreverse(num);
	}
	
	public static  void numberreverse(int num)
	{
		if(num<10)
		{
			System.out.print(num);
			return;
		}
		else
		{
			System.out.print(num%10);
			numberreverse(num/10);
		}
		//int num=123;
		/*
		 * while (num>0) { int rev=num%10; System.out.println(rev); num=num/10; }
		 */
	}

}
