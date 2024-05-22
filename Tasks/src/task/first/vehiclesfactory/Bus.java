package task.first.vehiclesfactory;

public class Bus extends Vehicle implements VehicleActions{
	
	private int decker;

	public Bus(String model, String number,int seatingCapacity, int decker) {
		super(model, number,seatingCapacity);
		this.decker = decker;
	}

	@Override
	public void start() {
		System.out.println("Bus is starting");
		
	}

	@Override
	public void stop() {
		System.out.println("Bus is stopped");
		
	}

	@Override
	public String getVehicleType() {
		return "Bus";
	}

	@Override
	public void engineType() {
		System.out.println("Gasoline Engine");
	}

	
	
	
	

}
