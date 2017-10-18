package com.test.comparable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Car> cars = new ArrayList<Car>();
		cars.add(new Car(5, "Porsche", "Carrera 4s", 326));
		cars.add(new Car(3, "Tesla", "Model 3", 650));
		cars.add(new Car(1, "Ford", "Focus ST", 250));
		cars.add(new Car(4, "Ferrari", "LaFerrari", 900));
		cars.add(new Car(2, "Renault", "clio", 92));
		
		Collections.sort(cars);
		
		for (Car car : cars ) {
			System.out.println(car);
		}
	}

}
