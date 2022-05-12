package week14Examples;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.*;
import java.awt.event.ActionEvent;
import javax.swing.ScrollPaneConstants;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class crudUI extends JFrame {

	private JPanel contentPane;
	private JTable studentsTbl;
	
	Connection conn = dbConnection.connection(); // Connectiong to the data base
	private JTextField idField;
	private JTextField lNameField;
	private JTextField fNameField;
	private JTextField emailField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					crudUI frame = new crudUI();
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
	public crudUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 762, 391);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(216, 66, 520, 275);
		contentPane.add(scrollPane);
		
		studentsTbl = new JTable();
		scrollPane.setViewportView(studentsTbl);
		studentsTbl.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Student ID", "Last Name", "First Name", "Email"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, Object.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		
		JButton fetchBtn = new JButton("Fetch Data");
		fetchBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Making connection to the data base
				try {

				String query = "SELECT * FROM STUDENTS"; // query to retrive information from db press surround with try catch
					PreparedStatement pst = conn.prepareStatement(query); // pairing java to execute SQL statements
					ResultSet results = pst.executeQuery(); // Executre sql query and stores return in result set
					
					DefaultTableModel tblModel = (DefaultTableModel) studentsTbl.getModel();
					tblModel.setRowCount(0); // Clears table data each time button is clicked
					
					while (results.next()) { // Keep looking through data until there is a null row
					
					// Create variables to store column dara from db
					String id = String.valueOf(results.getInt("StudentID"));
					String lname = results.getString("LastName");
					String fname = results.getString("FirstName");
					String email = results.getString("Email");
					
					String tblData[] = {id, lname, fname, email}; // store the data from the query into an array
					
					tblModel.addRow(tblData); //populate UI tabel with data from the tblData array
					
					}
					results.close();
					pst.close();
					
				} catch (SQLException e1) {
					
					
					e1.printStackTrace();
				} 
				
			}
		});
		fetchBtn.setBounds(607, 29, 129, 23);
		contentPane.add(fetchBtn);
		
		JLabel idLbl = new JLabel("Student ID");
		idLbl.setHorizontalAlignment(SwingConstants.CENTER);
		idLbl.setBounds(10, 43, 88, 14);
		contentPane.add(idLbl);
		
		idField = new JTextField();
		idField.setBounds(108, 40, 86, 20);
		contentPane.add(idField);
		idField.setColumns(10);
		
		JLabel lNameLbl = new JLabel("Last Name");
		lNameLbl.setHorizontalAlignment(SwingConstants.CENTER);
		lNameLbl.setBounds(10, 100, 88, 14);
		contentPane.add(lNameLbl);
		
		lNameField = new JTextField();
		lNameField.setColumns(10);
		lNameField.setBounds(108, 97, 86, 20);
		contentPane.add(lNameField);
		
		JLabel fNameLbl = new JLabel("First Name");
		fNameLbl.setHorizontalAlignment(SwingConstants.CENTER);
		fNameLbl.setBounds(10, 156, 88, 14);
		contentPane.add(fNameLbl);
		
		fNameField = new JTextField();
		fNameField.setColumns(10);
		fNameField.setBounds(108, 153, 86, 20);
		contentPane.add(fNameField);
		
		JLabel emailLbl = new JLabel("Email");
		emailLbl.setHorizontalAlignment(SwingConstants.CENTER);
		emailLbl.setBounds(10, 212, 88, 14);
		contentPane.add(emailLbl);
		
		emailField = new JTextField();
		emailField.setColumns(10);
		emailField.setBounds(108, 209, 86, 20);
		contentPane.add(emailField);
		
		JButton insertBtn = new JButton("INSERT");
		insertBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String lname = lNameField.getText();
				String fname = fNameField.getText();
				String email = emailField.getText();
				
				try {
					Statement stmt = conn.createStatement();
					
					String addData ="INSERT INTO STUDENTS (LastName, FirstName, Email) VALUES ('"+lname+"', '"+fname+"', '"+email+"')";
					
					stmt.execute(addData);
					
					idField.setText("");
					lNameField.setText("");
					fNameField.setText("");
					emailField.setText("");
					
					stmt.close();
					
				} catch (SQLException e1) {
					
					e1.printStackTrace();
				}
				
			}
		});
		insertBtn.setBounds(10, 268, 89, 23);
		contentPane.add(insertBtn);
		
		JButton updateBtn = new JButton("UPDATE");
		updateBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String idTxt = idField.getText();
				int id = Integer.parseInt(idTxt);
				String lname = lNameField.getText();
				String fname = fNameField.getText();
				String email = emailField.getText();
				
				try {
					Statement stmt = conn.createStatement();
					
					String updateData = "UPDATE STUDENTS SET LastName = '"+lname+"', FirstName = '"+fname+"', Email = '"+email+"' " + "WHERE StudentID = '"+id+"' ";
					stmt.execute(updateData);
					
					idField.setText("");
					lNameField.setText("");
					fNameField.setText("");
					emailField.setText("");
					
					stmt.close();
					
				} catch (SQLException e1) {
					
					e1.printStackTrace();
				}
				
			}
		});
		updateBtn.setBounds(108, 268, 89, 23);
		contentPane.add(updateBtn);
		
		JButton deleteBTN = new JButton("DELETE");
		deleteBTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String idTxt = idField.getText();
				int id = Integer.parseInt(idTxt);
				String lname = lNameField.getText();
				String fname = fNameField.getText();
				String email = emailField.getText();
				
				try {
					Statement dltstmt = conn.createStatement();
					
					String deleteData = "DELETE FROM STUDENTS WHERE StudentID = '"+id+"' ";
					dltstmt.execute(deleteData);
					
					idField.setText("");
					lNameField.setText("");
					fNameField.setText("");
					emailField.setText("");
					
					dltstmt.close();
					
				} catch (SQLException e1) {
					
					e1.printStackTrace();
				}
				
			}
		});
		deleteBTN.setBounds(63, 318, 89, 23);
		contentPane.add(deleteBTN);
	}
}
