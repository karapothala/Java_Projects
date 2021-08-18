package Javabasices;

public class StringConcadenation {

	public static void main(String[] args) {
		int a=100;
		int b=200;
		String s="hello";
		String t="world";
		System.out.println(a+b);
		System.out.println(s+t);
		System.out.println(a+b+s+t);
		System.out.println(s+t+a+b);//here the out put will be hellow world 100 200 helloworld100200
		System.out.println(s+t+(a+b));//here it will be the hellowworld 300;
		System.out.println(a+b+s+t+a+b);//300helloworld100200
        double c=1.33;
        double d=2.33;
        System.out.println(c+d);
        System.out.println(s+t+c+d);
        //pluse sing is the concade nation operatator.
        System.out.println("Hellow world");
        System.out.println("the value of "+a);
        System.out.print("Hello selenium");
        System.out.println("Hello testing");
        //println is give the next new line ln means line new 
        //println is used to print the out put in the next line in the consloe 
	}

}
