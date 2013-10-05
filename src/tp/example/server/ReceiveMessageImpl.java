package tp.example.server;

import java.rmi.RemoteException;
import tp.example.itf.ReceiveMessageInterface;

public class ReceiveMessageImpl implements ReceiveMessageInterface {
	@Override
	public String receiveMessage(String x) throws RemoteException {
			System.out.println(x.toUpperCase());
			return x.toUpperCase();
	}


	}



