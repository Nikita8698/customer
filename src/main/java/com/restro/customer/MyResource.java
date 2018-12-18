
package com.restro.customer;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.restro.customer.dao.CustomerDao;

/** Example resource class hosted at the URI path "/myresource"
 */
@Path("/myresource")
public class MyResource {
	
	CustomerDao dao=new CustomerDao();
	
	/*@Path("/readCusts")
    @GET 
    @Produces(MediaType.APPLICATION_JSON)
    public List<Customer> getCustomers() {
    	return dao.getCusts() ;
    }*/
	
	 @Path("/createCust")
	 @POST
	 @Produces(MediaType.APPLICATION_JSON)
	 public Customer createCust(Customer c)
	 {
	    	System.out.println("create method..");
	    	dao.createCust(c);
			return c;
	    	
	 }
	 
	 /*@Path("/custLogin")
	 @POST
	 @Produces(MediaType.APPLICATION_XML)
	 public Customer loginCust(Customer c)
	 {
	    	System.out.println("create method..");
	    	dao.createCust(c);
			return c;
	    	
	 }*/
}
