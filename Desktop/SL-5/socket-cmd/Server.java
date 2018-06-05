import java.io.*;
import java.net.*;


public class Server{
	public static void main(String argv[])
	{
		try {
			ServerSocket ss = new ServerSocket(5666);
			
			while(true)
			{
				Socket s = ss.accept();
			RecieverThread rt = new RecieverThread( s);
			Thread t = new Thread(rt);
			t.start();
			
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		
		
	}
	
	
}// end of class