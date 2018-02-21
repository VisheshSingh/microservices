package com.vishesh.ms.carmcs.domain;

public class Car {
	private int id;

	private String ModelNumber;

	private String Make_ID;

	private String YearOfProduction;

	private String DownPayment;

	public Car() {

	}

	public Car(int id, String modelNumber, String make_ID, String yearOfProduction, String downPayment) {
		ModelNumber = modelNumber;
		Make_ID = make_ID;
		YearOfProduction = yearOfProduction;
		DownPayment = downPayment;
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModelNumber() {
		return ModelNumber;
	}

	public void setModelNumber(String modelNumber) {
		ModelNumber = modelNumber;
	}

	public String getMakeID() {
		return Make_ID;
	}

	public void setMakeID(String makeID) {
		Make_ID = makeID;
	}

	public String getYearOfProduction() {
		return YearOfProduction;
	}

	public void setYearOfProduction(String yearOfProduction) {
		YearOfProduction = yearOfProduction;
	}

	public String getDownpayment() {
		return DownPayment;
	}

	public void setDownpayment(String downpayment) {
		DownPayment = downpayment;
	}
}
