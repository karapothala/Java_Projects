package Javabasices;

public class namethousandtimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name= "Bhaskar";
		String s="i";
		s= s.replaceAll("i","iiiiiiiiii");//10
		s= s.replaceAll("i","iiiiiiiiii");//10*10=100
		s= s.replaceAll("i","iiiiiiiiii");//100*10=1000
		
		s= s.replaceAll("i",name+"\n");
		System.out.println(s);
		
		
	}

}
