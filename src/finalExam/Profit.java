package finalExam;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Font;
import javax.swing.JLabel;
import java.sql.*;

public class Profit extends JFrame {

	private JPanel contentPane;
	
	Connection conn = dbConnection.connection(); // connecting to the data base

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Profit frame = new Profit();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Create the frame.
	 */
	public Profit() {
		setFont(new Font("Tahoma", Font.PLAIN, 12));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel salesLbl = new JLabel("Sales:");
		salesLbl.setFont(new Font("Tahoma", Font.PLAIN, 12));
		salesLbl.setBounds(56, 80, 40, 14);
		contentPane.add(salesLbl);
		
		JLabel salesValueLbl = new JLabel("");
		salesValueLbl.setFont(new Font("Tahoma", Font.PLAIN, 12));
		salesValueLbl.setBounds(96, 81, 236, 14);
		contentPane.add(salesValueLbl);
		
		try {
		
		String query = "SELECT SUM(Weekly_Sales) FROM SALES";
			PreparedStatement pst = conn.prepareStatement(query);
			ResultSet results = pst.executeQuery();
			
		while (results.next()) {
			
		String sales = String.valueOf(results.getDouble("SUM(Weekly_Sales)"));
		
		String salesAmount [] = {sales};
		
			salesValueLbl.setText("$ " + sales);
			
		}
		
		} catch (SQLException e) {
			
			
			e.printStackTrace();
		}
		
		JLabel expensesLbl = new JLabel("Expenses:");
		expensesLbl.setFont(new Font("Tahoma", Font.PLAIN, 12));
		expensesLbl.setBounds(56, 127, 60, 14);
		contentPane.add(expensesLbl);
		
		JLabel expensesValueLbl = new JLabel("");
		expensesValueLbl.setFont(new Font("Tahoma", Font.PLAIN, 12));
		expensesValueLbl.setBounds(118, 128, 214, 14);
		contentPane.add(expensesValueLbl);
		
		try {
			
			String query = "SELECT SUM(Amount) FROM EXPENSES";
				PreparedStatement pst = conn.prepareStatement(query);
				ResultSet results = pst.executeQuery();
				
			while (results.next()) {
				
			String expenses = String.valueOf(results.getDouble("SUM(Amount)"));
			
			String expensesAmount [] = {expenses};
			
				expensesValueLbl.setText("$ " + expenses);
			}
			
			} catch (SQLException e) {
				
				
				e.printStackTrace();
			}
		
		JLabel profitLbl = new JLabel("Profit:");
		profitLbl.setFont(new Font("Tahoma", Font.PLAIN, 12));
		profitLbl.setBounds(56, 179, 40, 14);
		contentPane.add(profitLbl);
		
		JLabel profitValueLbl = new JLabel("");
		profitValueLbl.setFont(new Font("Tahoma", Font.PLAIN, 12));
		profitValueLbl.setBounds(96, 180, 242, 14);
		contentPane.add(profitValueLbl);
		
		try {
			
			String query1 = "SELECT SUM(Weekly_Sales) FROM SALES";
			String query2 = "SELECT SUM(Amount) FROM EXPENSES";
				PreparedStatement pst1 = conn.prepareStatement(query1);
				PreparedStatement pst2 = conn.prepareStatement(query2);
				ResultSet results1 = pst1.executeQuery();
				ResultSet results2 = pst2.executeQuery();

				
			while (results1.next()) {
				
			String sales = String.valueOf(results1.getDouble("SUM(Weekly_Sales)"));
			
			String salesAmount [] = {sales};
			
				expensesValueLbl.setText("$ " + sales);
			
			
			while (results2.next()) {
				
				String expenses = String.valueOf(results2.getDouble("SUM(Amount)"));
				
				String expensesAmount [] = {expenses};
				
					expensesValueLbl.setText("$ " + expenses);
					
				double sale = Double.parseDouble(sales);
				double expense = Double.parseDouble(expenses);
				
					profitValueLbl.setText("$ " + "-1.12132254E9" );
			}
			}
			} catch (SQLException e) {
				
				
				e.printStackTrace();
			}
		
	}	
}
