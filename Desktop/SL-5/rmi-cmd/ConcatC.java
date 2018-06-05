import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class ConcatC extends UnicastRemoteObject  implements ConcatI{

   public ConcatC() throws Exception {
		super();
		
	}

	@Override
	public String concat(String a, String b) {
		a=a+b;
		return a;
	}
	

}
