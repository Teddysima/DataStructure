
public class Vehicle {
	
	private String VehicleName;
	private int VehiclePrice;
	private int VehicleModel;

	public Vehicle(String VN, int VP, int VM) {
		VehicleName = VN;
		VehiclePrice = VP;
		VehicleModel = VM;
	}

	public String getVehicleName() {
		return VehicleName;
	}

	public void setVehicleName(String vehicleName) {
		VehicleName = vehicleName;
	}

	public int getVehiclePrice() {
		return VehiclePrice;
	}

	public void setVehiclePrice(int vehiclePrice) {
		VehiclePrice = vehiclePrice;
	}

	public int getVehicleModel() {
		return VehicleModel;
	}

	public void setVehicleModel(int vehicleModel) {
		VehicleModel = vehicleModel;
	}

	public String toString() {
		return "VehicleName: " + " " + VehicleName + " VehiclePrice: " + " "
				+ VehiclePrice + " Vehiclemodel:   " + "  " + VehicleModel;
	}

}
