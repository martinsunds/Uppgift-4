package app;

import java.rmi.RemoteException;

import org.tempuri.WebServiceUppgift4Soap;
import org.tempuri.WebServiceUppgift4SoapProxy;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebServiceUppgift4Soap proxy = new WebServiceUppgift4SoapProxy();
		
		try {
			Object [] a = proxy.getCars();
			
			for(Object b : a) {
				
				System.out.println(b.toString());
			}
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
