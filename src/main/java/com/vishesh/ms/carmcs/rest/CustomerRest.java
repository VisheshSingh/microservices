package com.vishesh.ms.carmcs.rest;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.vishesh.ms.carmcs.domain.Customer;

@Named
@Path("/customers")
public class CustomerRest {
	private static ArrayList<Customer> custlist = new ArrayList<Customer>();
	static {
		Customer cus1 = new Customer(101, "Brandon", "123 Kingsle St.");
		Customer cus2 = new Customer(102, "Harry", "456 New Road");
		Customer cus3 = new Customer(103, "Jessica", "333 Christopher blvd");
		Customer cus4 = new Customer(104, "Meghan", "778 Pennington Avenue");
		Customer cus5 = new Customer(105, "Chelsea", "420 Parkway Drive");

		custlist.add(cus1);
		custlist.add(cus2);
		custlist.add(cus3);
		custlist.add(cus4);
		custlist.add(cus5);
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Customer> getCustomer() {
		return custlist;
	}

	@GET
	@Path("customer")
	@Produces(MediaType.APPLICATION_JSON)
	public Customer getCustomer(@QueryParam("id") int id) {
		Customer customerlist = null;
		for (Customer c : custlist) {
			if (c.getId() == id)
				customerlist = c;
		}
		return customerlist;
	}
}
