package com.test.comparator;

import java.util.Comparator;

public class CarComparator implements Comparator<Car> {

	private String compareAttribute = "";
	private String orderWay = "ASC";

	public CarComparator(String compareAttribute, String orderWay) {
		this.compareAttribute = compareAttribute;
		this.orderWay = orderWay;
	}

	@Override
	public int compare(Car o1, Car o2) {
		// TODO Auto-generated method stub
		if (compareAttribute.equalsIgnoreCase("BRAND"))
			if(orderWay.equalsIgnoreCase("DESC"))
				return o2.getBrand().compareTo(o1.getBrand());
			else
				return o1.getBrand().compareTo(o2.getBrand());
		if (compareAttribute.equalsIgnoreCase("POWER"))
			if(orderWay.equalsIgnoreCase("DESC"))
				return ((Integer) o2.getPower()).compareTo(o1.getPower());
			else
				return ((Integer) o1.getPower()).compareTo(o2.getPower());
		return 0;
	}


}
