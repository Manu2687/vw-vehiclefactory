package task.first.vehiclesfactory;

public class MainClass {
	
	public static void main(String[] args) {
		
		Vehicle car1 = new Car("Toyota","HR24843","Non-Conertible",5,4);
		Vehicle bus1 = new Bus("Volvo","DL48392",30,2);
		
		car1.toString();
		System.out.println("CarModel="+car1.getModel());
		
		System.out.println("bus = "+bus1.toString());
		
		System.out.println("vehicleType="+bus1.getVehicleType());
		
		
		
		System.out.println("-----------");
		Car car2 = new Car("Toyota2","DL24843","Convertible",5,4);
		car2.start();
		System.out.println("Model = "+car2.getModel());
		System.out.println("VehicleType = "+car2.getVehicleType());
		System.out.println("CarType = "+car2.getCarType());
		System.out.println("CarNumber = "+car2.getNumber());
		System.out.println("SeatingCapacity = "+car2.getSeatingCapacity());
		car2.engineType();
		car2.stop();
		
		
		
		
		
	}

}
