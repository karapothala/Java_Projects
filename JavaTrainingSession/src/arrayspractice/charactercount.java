package arrayspractice;

import java.util.HashMap;
import java.util.Map;

public class charactercount 
{
	public static void main(String[] args)
	{
		getcharcount("test");
	}
	
	public static void getcharcount(String name)
	{
		Map<Character,Integer> charmap= new HashMap<Character, Integer>();
		char StrArray[]=name.toCharArray();
		for(char c: StrArray)
		{
			if(!String.valueOf(c).isBlank()) 
			{
				if (charmap.containsKey(c))
				{
					charmap.put(c,charmap.get(c)+1);
				}
				else
				{
					charmap.put(c,1);
				}
			}
		}
		System.out.println(name +":"+ charmap);		
	}
	
	
}
