//The objects of type Car must be serialized so that they could be sent over the sockets
import java.io.*;

public class Car implements Serializable {

	private String model;
	private String owner;
	private double mileage;
	private String registration;

	public Car( String brand, String name, double m ) {
		model = brand;
		owner = name;
		mileage = m;
		registration = "unregistered";
	}

	public String toString() {
		return "Model: " + model + " Owner: " + owner + 
				" mileage: " +  mileage + 
				" Registration: " + registration;
	}
	// perhaps setRegister is a better more descriptive name for method
	// Server on server side will be calling the method
	public void getRegistered(String plate) {
		registration = plate;
	}
}