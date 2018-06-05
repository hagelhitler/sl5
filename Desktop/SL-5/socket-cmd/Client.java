import java.io.*;
import java.net.*;


public class Client{
	
	public static void main(String argv[])
	{
		
			try {
				Socket s = new Socket("localhost",5666);
				
				if(s.isConnected())
				{
			
				
				PrintWriter pw = new PrintWriter(s.getOutputStream(),true );
				BufferedReader br1 = new BufferedReader(new InputStreamReader(s.getInputStream()));
				while (true)
				{
					System.out.println("Enter your Choice Followed by Input \n1: Compare \n2:Substring \n3:Concat \n4:Digit Addition \n5:Prime Number Check ");
					
					BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
					
					String line;
					line=br.readLine();
					pw.println(line);
					pw.flush();
					String line2=br1.readLine();System.out.println(line2);
					if(line.equals("EXIT")) break;
						
					
				
				}	s.close();
				}
			}
				
			 catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
			
			
		}

		
	}

