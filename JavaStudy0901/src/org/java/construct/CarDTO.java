package org.java.construct;

public class CarDTO {
	
	private String carName;
	private int carYear;
	private int carCoin;
	
	public CarDTO() {
		
	}
	
	public CarDTO(String carName) {
		this.carName=carName;
	}
	
	public CarDTO(String carName, int carYear) {
		this.carName=carName;
		this.carYear=carYear;
	}
	
	public CarDTO(String carName, int carYear, int carCoin) {
		this.carName=carName;
		this.carYear=carYear;
		this.carCoin=carCoin;
	}
	
	public void setCarName(String carName) {
		this.carName = carName;
	}
	
	public String getCarName() {
		return carName;
	}
	
	public void setCarYear(int carYear) {
		this.carYear = carYear;
	}
	
	public int getCarYear() {
		return carYear;
	}
	
	public void setCarCoin(int carCoin) {
		this.carCoin = carCoin;
	}
	
	public int getCarCoin() {
		return carCoin;
	}
}
