package com.test.comparable;

public class Car implements Comparable<Car>{
	
	private int idCar;
	private String brand;
	private String model;
	private int power;
	
	public Car() {
		super();
	}

	public Car(int idCar, String brand, String model, int power) {
		super();
		this.idCar = idCar;
		this.brand = brand;
		this.model = model;
		this.power = power;
	}

	public int getIdCar() {
		return idCar;
	}

	public void setIdCar(int idCar) {
		this.idCar = idCar;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	@Override
	public String toString() {
		return "Car [idCar=" + idCar + ", brand=" + brand + ", model=" + model + ", power=" + power + "]";
	}

	@Override
	public int compareTo(Car o) {
		// TODO Auto-generated method stub
		return  brand.compareTo(o.getBrand());
	}
	
	
}
