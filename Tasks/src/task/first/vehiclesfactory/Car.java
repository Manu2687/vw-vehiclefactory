package task.first.vehiclesfactory;

public class Car extends Vehicle implements VehicleActions {
	
	private String carType;

	public Car(String model, String number, String carType, int seatingCapacity, int wheeler) {
		super(model, number,seatingCapacity,wheeler);
		this.carType = carType;
	}
	
	public Car(String model, String number, String carType, int seatingCapacity) {
		super(model, number,seatingCapacity);
		this.carType = carType;
	}

	public String getCarType() {
		return carType;
	}

	@Override
	public void start() {
		System.out.println("Car is starting");
		
	}

	@Override
	public void stop() {
		System.out.println("Car is stopping");
		
	}

	@Override
	public String getVehicleType() {
		return "Car";
	}


	@Override
	public void engineType() {
		System.out.println("Incline Engine");
		
	}
	
	

}
