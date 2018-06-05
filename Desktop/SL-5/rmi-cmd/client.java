import java.rmi.Naming;
import java.util.*;

public class client {
 public static void main(String[] args) throws Exception{
	 ConcatI obj=(ConcatI)Naming.lookup("concat");
	Scanner sc=new Scanner(System.in);
	System.out.println("\nEnter string 1:");
	String s1=sc.next();
	System.out.println("\nEnter string 2:");
	String s2=sc.next();
	 String res=s1+s2;
	 System.out.println("concated string="+res);
}
}
