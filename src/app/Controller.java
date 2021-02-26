package app;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.table.DefaultTableModel;

import org.tempuri.WebServiceAssignment4Soap;
import org.tempuri.WebServiceAssignment4SoapProxy;

public class Controller {
	
   private WebServiceAssignment4Soap proxy;
   private View view;
   private ErrorHandling error;

public Controller(View view) {
		
		this.error = new ErrorHandling();
		this.view= view;
		this.proxy = new WebServiceAssignment4SoapProxy();
		initialize();
		
	}
    
    
    public void initialize() {
    	// show cars
    	view.getBtnShowCars().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				view.getLblErrorMessage().setText("");
				
				try {
					Object[] carListRows = proxy.getCars();
					Object[] columNames = {"Cars"};
					DefaultTableModel model = new DefaultTableModel(columNames,0);
					for (int i = 0; i < carListRows.length; i++) {
						
						model.addRow(new Object[] {carListRows[i]});
					}
						view.getTableInfoView().setModel(model);
						
				} catch (Exception e1) {
					
					view.getLblErrorMessage().setText(error.handleException(e1));
					//e1.printStackTrace();
				}
			}
		});
    	
    	// show Customers
    	view.getBtnShowCustomers().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				view.getLblErrorMessage().setText("");
				Object[] customerListRows;
				try {
					customerListRows = proxy.getCustomers();
					Object[] columNames = {"Customers"};
					DefaultTableModel model = new DefaultTableModel(columNames,0);
					for (int i = 0; i < customerListRows.length; i++) {
						
						model.addRow(new Object[] {customerListRows[i]});
					}
						view.getTableInfoView().setModel(model);
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					view.getLblErrorMessage().setText(error.handleException(e1));
					//e1.printStackTrace();
				}
			
				
			}
		});
    	
    	// Show rent
    	view.getBtnShowRent().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				view.getLblErrorMessage().setText("");
				Object[] rentListRows;
				try {
					rentListRows = proxy.getRent();
					Object[] columNames = {"Rents"};
					DefaultTableModel model = new DefaultTableModel(columNames,0);
					for (int i = 0; i < rentListRows.length; i++) {
						
						model.addRow(new Object[] {rentListRows[i]});
					}
						view.getTableInfoView().setModel(model);
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					view.getLblErrorMessage().setText(error.handleException(e1));
					//e1.printStackTrace();
				}
			}
		});
    	
    }

}
