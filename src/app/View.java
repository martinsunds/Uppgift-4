package app;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JTextArea;
import java.awt.ScrollPane;
import java.awt.TextArea;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class View {

	private JFrame frame;
	private JButton btnShowCars;
	private JButton btnShowCustomers;
	private JButton btnShowRent;
	private JTable tableInfoView;
	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public JButton getBtnShowCars() {
		return btnShowCars;
	}

	public void setBtnShowCars(JButton btnShowCars) {
		this.btnShowCars = btnShowCars;
	}

	public JButton getBtnShowCustomers() {
		return btnShowCustomers;
	}

	public void setBtnShowCustomers(JButton btnShowCustomers) {
		this.btnShowCustomers = btnShowCustomers;
	}

	public JButton getBtnShowRent() {
		return btnShowRent;
	}

	public void setBtnShowRent(JButton btnShowRent) {
		this.btnShowRent = btnShowRent;
	}
	
	public JTable getTableInfoView() {
		return tableInfoView;
	}

	public void setTableInfoView(JTable tableInfoView) {
		this.tableInfoView = tableInfoView;
	}

	public JScrollPane getScrollPaneInfoView() {
		return scrollPaneInfoView;
	}

	public void setScrollPaneInfoView(JScrollPane scrollPaneInfoView) {
		this.scrollPaneInfoView = scrollPaneInfoView;
	}
	private JScrollPane scrollPaneInfoView;
	private JLabel lblErrorMessage;


	/**
	 * Create the application.
	 */
	public View() {
	
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		btnShowCars = new JButton("Show cars");
		btnShowCars.setBounds(23, 39, 111, 21);
		frame.getContentPane().add(btnShowCars);
		
		btnShowCustomers = new JButton("Show Customers");
		btnShowCustomers.setBounds(23, 108, 111, 21);
		frame.getContentPane().add(btnShowCustomers);
		
		btnShowRent = new JButton("Show Renties");
		btnShowRent.setBounds(23, 188, 111, 21);
		frame.getContentPane().add(btnShowRent);
		
		scrollPaneInfoView = new JScrollPane();
		scrollPaneInfoView.setBounds(193, 31, 207, 207);
		frame.getContentPane().add(scrollPaneInfoView);
		
		tableInfoView = new JTable();
		scrollPaneInfoView.setRowHeaderView(tableInfoView);
		
		lblErrorMessage = new JLabel("");
		lblErrorMessage.setBounds(23, 240, 212, 13);
		frame.getContentPane().add(lblErrorMessage);
		
		
	}

	public JLabel getLblErrorMessage() {
		return lblErrorMessage;
	}

	public void setLblErrorMessage(JLabel lblErrorMessage) {
		this.lblErrorMessage = lblErrorMessage;
	}


}
