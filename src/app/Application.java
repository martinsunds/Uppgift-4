package app;

import java.rmi.RemoteException;
import java.util.ArrayList;

import org.tempuri.WebServiceUppgift4Soap;
import org.tempuri.WebServiceUppgift4SoapProxy;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		
		View view = new View();
		Controller controller = new Controller(view);
		view.getFrame().setVisible(true);
		
		
		
		/*WebServiceUppgift4Soap proxy = new WebServiceUppgift4SoapProxy();
       
       try {
		Object[] carList = proxy.getCars();
		
		for (Object o : carList) {
		System.out.println(o.toString());
		}
	} catch (RemoteException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
*/		
	}

}
