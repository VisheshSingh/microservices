package com.vishesh.ms.carmcs.rest;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.vishesh.ms.carmcs.domain.Car;

@Named
@Path("/")
public class CarRest {
	private static ArrayList<Car> carlist = new ArrayList<Car>();
	static {
		Car c1 = new Car(1, "Acura", "RDX 2018", "2018", "5000");
		Car c2 = new Car(2, "BMW", "Q5", "2016", "6000");
		Car c3 = new Car(3, "Audi", "A7", "2014", "5500");
		Car c4 = new Car(4, "Chevy", "Camero", "2015", "4500");
		Car c5 = new Car(5, "Mercedes", "e-class", "2017", "7000");

		carlist.add(c1);
		carlist.add(c2);
		carlist.add(c3);
		carlist.add(c4);
		carlist.add(c5);
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Car> getCars() {
		return carlist;
	}

	@GET
	@Path("car")
	@Produces(MediaType.APPLICATION_JSON)
	public Car getCustomer(@QueryParam("id") int id) {
		Car clist = null;
		for (Car c : carlist) {
			if (c.getId() == id)
				clist = c;
		}
		return clist;
	}
}
