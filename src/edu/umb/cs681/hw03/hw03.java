package edu.umb.cs681.hw03;

import java.util.ArrayList;

public class hw03 {
	private static ArrayList<Car> carList = new ArrayList<Car>();
	
	private static void carsInstantiation() {
		Car A = new Car("Toyota", "RAV4", 300, 2018, 1000L);
		Car B = new Car("Toyota", "RAV4", 400, 2018, 2000L);
		Car C = new Car("Toyota", "RAV4", 500, 2018, 3000L);
		Car D = new Car("Toyota", "RAV4", 200, 2018, 2000L);
		Car E = new Car("Toyota", "RAV4", 100, 2018, 2000L);
		
		A.setDominationCount(0);
		B.setDominationCount(3);
		C.setDominationCount(4);
		D.setDominationCount(1);
		E.setDominationCount(0);
		
		carList.add(A);
		carList.add(B);
		carList.add(C);
		carList.add(D);
		carList.add(E);
	}
	
	public static void main(String[] args) {
		carsInstantiation();
		//minimum price with reduce
		Float minPrice = carList.stream()
							    .map((Car car) -> car.getPrice())
							    .reduce((result, nextElement) -> {
							    	if (result > nextElement)
							    		return nextElement;
							    	return result;
							    })
							 .get();
		System.out.println("Min Price: " + minPrice);
		System.out.println("---------------------------------");
		
		//maximum mileage with reduce
		Integer maxMileage = carList.stream()
									.map((Car car) -> car.getMileage())
									.reduce((result, nextElement) -> {
										if (result < nextElement)
											return nextElement;
										return result;
									})
									.get();
		System.out.println("Max Price: " + maxMileage);
		System.out.println("---------------------------------");
		
		//Count distinct model with reduce
		Integer cntDistModel = carList.stream()
									  .map((Car car) -> car.getModel())
									  .distinct()
									  .reduce(0, (result, nextElement) -> ++result, (finalResult, intermediateResult) -> finalResult);
		System.out.println("Count distinct model: " + cntDistModel);
									  
		
							 
	}
}