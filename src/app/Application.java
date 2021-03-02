package app;

import java.rmi.RemoteException;
import java.util.ArrayList;



public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		
		View view = new View();
		Controller controller = new Controller(view);
		view.getFrame().setVisible(true);
		
		
		
	
	}

}
