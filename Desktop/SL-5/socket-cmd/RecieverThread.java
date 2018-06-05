import java.io.*;
import java.net.*;

public class RecieverThread implements Runnable
{
	Socket s = null;
	BufferedReader br = null;
	PrintWriter pw = null;
	public RecieverThread(Socket s)
	{
		this.s=s;
	}
	
	public void run()
	{
		try
		{
		
		br=new BufferedReader(new InputStreamReader(this.s.getInputStream()));
		String line;
		pw=new PrintWriter(s.getOutputStream(),true );
		while((line=br.readLine())!=null)
		{
			String arr[] = new String[3];
			arr = null;
			arr = line.split(" ");
			
			switch(arr[0])
			{
			case "1": 
				int res= arr[1].compareTo(arr[2]);
				if(res!=0 )
				{ pw.println("Not Equal");}
				else 
				{pw.println("Equal");}
				
				break;
			case "2":
				if(arr[1].contains(arr[2]))
				{
					pw.println(" Is Substring");
				}
				else 
				{
					pw.println("Not a substring");
				}
				
				break;
			
			case "3":
				String result =arr[1].concat(arr[2]);
				pw.println(result);
				
			break;
			case "4":
				int total=0;
				for(int i=0;i<arr[1].length();i++)
				{
					total+=arr[1].charAt(i)-'0';
				}
					pw.println("ADDITION IS:"+total);
				break;
			case "5":
				int num=Integer.parseInt(arr[1]);
				int flag=0;
				for(int i=2;i<=num/2;++i)
				{
					if(num%i==0)
					{flag=1;break;}
					
				}
				if(flag!=1)
				{pw.println(num+ "It is a prime number");}
				else
				{pw.println(num+ "It is not a prime number");}
				break;
			
			}
			if(line.equals("EXIT"))
				break;			
		}
		this.s.close();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		
	}
}