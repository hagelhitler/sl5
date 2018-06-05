import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.RemoteObject;

import org.omg.CORBA.REBIND;


public class server extends RemoteObject {
   public static void main(String[] args) throws Exception {
	   ConcatC obj=new ConcatC();
	   Naming.rebind("concat",obj);
	   System.out.println("server started");
}
	
	
	
}
