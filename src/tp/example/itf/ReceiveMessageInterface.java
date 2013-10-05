package tp.example.itf;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ReceiveMessageInterface extends Remote{
	String receiveMessage(String x) throws RemoteException;
}
