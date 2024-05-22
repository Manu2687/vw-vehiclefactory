package task.first.vehiclesfactory;

public abstract class Vehicle {
	
	private String model;
	private String number;
	protected int wheeler;
	private int seatingCapacity;
	
	

	public Vehicle(String model, String number, int seatingCapacity, int wheeler) {
		super();
		this.model = model;
		this.number = number;
		this.wheeler = wheeler;
		this.seatingCapacity=seatingCapacity;
	}

	public Vehicle(String model, String number, int seatingCapacity) {
		super();
		this.model = model;
		this.number = number;
		this.seatingCapacity=seatingCapacity;
	}
	
	public String getModel() {
		return model;
	}

	public String getNumber() {
		return number;
	}

	
	public int getWheeler() {
		return wheeler;
	}

	public void setWheeler(int wheeler) {
		this.wheeler = wheeler;
	}

	public int getSeatingCapacity() {
		return seatingCapacity;
	}

	public void setSeatingCapacity(int seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}

	@Override
	public String toString() {
		return "Vehicle [model=" + model + ", number=" + number + "]";
	}
	
	public abstract String getVehicleType();
	

	
	

}
