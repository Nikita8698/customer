package com.restro.customer.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.restro.customer.Customer;

public class CustomerDao {
	
	 Connection con=null;
		
		public CustomerDao()
		{
			try {
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/Restro";
			String username="root";
			String password="root";
			con=DriverManager.getConnection(url, username, password);
			System.out.println("connection success....");
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
	
	public void createCust(Customer c)
		{
			
		String sql="insert into customer(firstname,lastname,contact,email,password,c_password) values(?,?,?,?,?,?)";
			try {
				PreparedStatement ps=con.prepareStatement(sql);
				ps.setString(1, c.getFirstname());
				ps.setString(2, c.getLastname());
				ps.setString(3, c.getContact());
				ps.setString(4, c.getEmail());
				ps.setString(5, c.getPassword());
				ps.setString(6, c.getC_password());
				ps.executeUpdate();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}

		}
	/* public List<Customer> getCusts() 
		{
		 System.out.println("get customer....");
		 List<Customer> custs=new ArrayList<Customer>();
			String sql="select * from customer";
			try {
			PreparedStatement ps=con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
				while(rs.next())
				{
					Customer cust=new Customer();
					cust.setId(rs.getInt(1));
					cust.setFirstname(rs.getString(2));
					cust.setLastname(rs.getString(3));
					cust.setEmail(rs.getString(4));
					cust.setContact(rs.getString(5));
					cust.setPassword(rs.getString(6));
					cust.setC_password(rs.getString(7));
					custs.add(cust);	
				}
			}
				catch(Exception e) {
					System.out.println(e);
				}
				return custs;
				
			}*/
}
