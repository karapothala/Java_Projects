package RunApps;

import java.io.IOException;

public class invokeapplications
{
	public static void main(String[] args) throws IOException, InterruptedException
	{
		Runtime runtime=Runtime.getRuntime();
//		Process pr=runtime.exec("notepad.exe C:\\Users\\bhaskar\\Downloads\\BDD\\greetings.txt");
//		Thread.sleep(4000);
//		pr.destroy();
//		
//		String s[] = new String[] {"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe","www.google.com"};
//		runtime.exec(s);
		
		String s1[] = new String[] {"C:\\Program Files (x86)\\VideoLAN\\VLC\\vlc.exe" ,"C:\\Users\\bhaskar\\Downloads\\Boruto\\E210.mp4"};
		Process pr1=runtime.exec(s1);
		Thread.sleep(40000);
		pr1.destroy();
		
		
		}

}
