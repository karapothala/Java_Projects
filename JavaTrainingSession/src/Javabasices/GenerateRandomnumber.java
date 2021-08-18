package Javabasices;

import java.util.Random;

public class GenerateRandomnumber
{
	public static void main(String[] args)
	{
		Random random = new Random();
		for(int i=0; i<=5;i++)
		{
		System.out.println("Random interger is:"+random.nextInt());
		System.out.println("Random float is:"+random.nextFloat());
		System.out.println("Random double is:"+random.nextDouble());
		System.out.println("Random boolean is:"+random.nextBoolean());
		}
	}
}
