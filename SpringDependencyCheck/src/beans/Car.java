package beans;

import org.springframework.beans.factory.annotation.Required;

public class Car {
	
	private String carName;
	private Engine engine;
	@Required
	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Car() {
		System.out.println("Car Class Constructor...");
	}

	public void printData() {
		System.out.println("CarName : "+getCarName());
		System.out.println("ModelYear : "+engine.getModelYear());
	}
		
}
