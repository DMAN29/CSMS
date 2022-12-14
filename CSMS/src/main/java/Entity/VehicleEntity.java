package Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class VehicleEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int vehicleId;
	private String brand;
	private String model;
	private double vehiclePrice;
	@Override
	public String toString() {
		return "VehicleEntity [vehicleId=" + vehicleId + ", brand=" + brand + ", model=" + model + ", vehiclePrice="
				+ vehiclePrice + ", vehicleStock=" + vehicleStock + "]";
	}
	private int vehicleStock;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getVehicleId() {
		return vehicleId;
	}
	//comment by nikhil
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	public double getVehiclePrice() {
		return vehiclePrice;
	}
	public void setVehiclePrice(double vehiclePrice) {
		this.vehiclePrice = vehiclePrice;
	}
	public int getVehicleStock() {
		return vehicleStock;
	}
	public void setVehicleStock(int vehicleStock) {
		this.vehicleStock = vehicleStock;
	}
	
}