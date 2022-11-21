package Fundamental;

import java.awt.Color;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class SwingDemo implements ActionListener {

	JFrame f;
	JLabel l1, l2, l3, l4, l5;
	JTextField t1, t2, t3, t4, t5;
	JButton b1, b2, b3, b4, b5;

	public SwingDemo() {
		f = new JFrame("My Swing Example");
		f.setVisible(true);
		f.setSize(340, 430);
		f.setLayout(null);
		f.setResizable(false);

		l1 = new JLabel("ID");
		l2 = new JLabel("FIRST NAME");
		l3 = new JLabel("LAST NAME");
		l4 = new JLabel("EMAIL");
		l5 = new JLabel("MOBILE");

		t1 = new JTextField(20);
		t2 = new JTextField(20);
		t3 = new JTextField(20);
		t4 = new JTextField(20);
		t5 = new JTextField(20);

		b1 = new JButton("INSERT");
		b2 = new JButton("SEARCH");
		b3 = new JButton("UPDATE");
		b4 = new JButton("DELETE");
		b5 = new JButton("CLEAR");

		f.add(l1);
		f.add(t1);
		f.add(l2);
		f.add(t2);
		f.add(l3);
		f.add(t3);
		f.add(l4);
		f.add(t4);
		f.add(l5);
		f.add(t5);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);

		l1.setBounds(50, 50, 100, 20);
		l2.setBounds(50, 100, 100, 20);
		l3.setBounds(50, 150, 100, 20);
		l4.setBounds(50, 200, 100, 20);
		l5.setBounds(50, 250, 100, 20);

		t1.setBounds(150, 50, 140, 20);
		t2.setBounds(150, 100, 140, 20);
		t3.setBounds(150, 150, 140, 20);
		t4.setBounds(150, 200, 140, 20);
		t5.setBounds(150, 250, 140, 20);

		b1.setBounds(50, 300, 120, 20);
		b2.setBounds(170, 300, 120, 20);
		b5.setBounds(110, 325, 120, 20);
		b3.setBounds(50, 350, 120, 20);
		b4.setBounds(170, 350, 120, 20);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		
		f.getContentPane().setBackground(Color.BLACK);
		
		l1.setForeground(Color.WHITE);
		l2.setForeground(Color.WHITE);
		l3.setForeground(Color.WHITE);
		l4.setForeground(Color.WHITE);
		l5.setForeground(Color.WHITE);
		
		b1.setBackground(Color.PINK);
		b1.setForeground(Color.BLACK);
		
		b2.setBackground(Color.PINK);
		b2.setForeground(Color.BLACK);
		
		b3.setBackground(Color.PINK);
		b3.setForeground(Color.BLACK);
		
		b4.setBackground(Color.PINK);
		b4.setForeground(Color.BLACK);
		
		b5.setBackground(Color.PINK);
		b5.setForeground(Color.BLACK);
		
		

	}

	public static void main(String[] args) {
		new SwingDemo();
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_3", "root", "");
				String sql = "Insert into Student(fname,lname,email,mobile) values('" + t2.getText() + "','"
						+ t3.getText() + "','" + t4.getText() + "','" + t5.getText() + "')";
				Statement stmt = conn.createStatement();
				t2.setText("");
				t3.setText("");
				t4.setText("");
				t5.setText("");
				JOptionPane.showMessageDialog(f, "Data Inserted Successfully");
				
				stmt.execute(sql);

			} catch (Exception ex) {
				ex.printStackTrace();
			}

		} else if (e.getSource() == b2) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_3", "root", "");
				String sql = "select * from Student where id=?";
				PreparedStatement pst = conn.prepareStatement(sql);
				pst.setInt(1, Integer.parseInt(t1.getText()));
				ResultSet rs = pst.executeQuery();
				if (rs.next())
				{
					t2.setText(rs.getString("fname"));
					t3.setText(rs.getString("lname"));
					t4.setText(rs.getString("email"));
					t5.setText(rs.getString("mobile"));

				}
				else
				{
					t2.setText("");
					t3.setText("");
					t4.setText("");
					t5.setText("");
					JOptionPane.showMessageDialog(f, "Id Not Found");
					
					
				}

			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
		else if(e.getSource()==b3) {
			
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/java_3","root","");
				String sql="update Student set fname=?,lname=?,email=?,mobile=? where id=?";
				PreparedStatement pst=conn.prepareStatement(sql);
				pst.setString(1,t2.getText());
				pst.setString(2,t3.getText());
				pst.setString(3,t4.getText());
				pst.setString(4,t5.getText());
				pst.setInt(5,Integer.parseInt(t1.getText()));
				pst.executeUpdate();
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
				t5.setText("");
				JOptionPane.showMessageDialog(f, "Data Upadated Successfully");
				
			} catch (Exception ex) {
				ex.printStackTrace();
				
			}
		}
		else if(e.getSource()==b4)
		{
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/java_3","root","");
				String sql="delete from Student where id=?";
				PreparedStatement pst=conn.prepareStatement(sql);
				pst.setInt(1, Integer.parseInt(t1.getText()));
				pst.executeUpdate();
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
				t5.setText("");
				JOptionPane.showMessageDialog(f, "Data Deleted Successfully");
				
			} catch (Exception ex) {
			    ex.printStackTrace();
			}
		}
		else if(e.getSource()==b5)
		{
			t1.setText("");
			t2.setText("");
			t3.setText("");
			t4.setText("");
			t5.setText("");
			
		}
		
	}
}
