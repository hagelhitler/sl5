import java.rmi.Remote;


public interface ConcatI extends Remote{
	
	public String concat(String a,String b) throws Exception; 

}
