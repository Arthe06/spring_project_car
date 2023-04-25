package com.example.demo.carmodel;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="CAR")
public class CarModel {
    @Id
    private int id;
    private String carholdername;
    private String brandname;
    private String platenumber;
    private String milage;
    private String speedperkilometer;
    private String manufacturedate;
    private String seatingtype;
    private String fuel;
    private String ownerphonenumber;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCarholdername() {
		return carholdername;
	}
	public void setCarholdername(String carholdername) {
		this.carholdername = carholdername;
	}
	public String getBrandname() {
		return brandname;
	}
	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}
	public String getPlatenumber() {
		return platenumber;
	}
	public void setPlatenumber(String platenumber) {
		this.platenumber = platenumber;
	}
	public String getMilage() {
		return milage;
	}
	public void setMilage(String milage) {
		this.milage = milage;
	}
	public String getSpeedperkilometer() {
		return speedperkilometer;
	}
	public void setSpeedperkilometer(String speedperkilometer) {
		this.speedperkilometer = speedperkilometer;
	}
	public String getManufacturedate() {
		return manufacturedate;
	}
	public void setManufacturedate(String manufacturedate) {
		this.manufacturedate = manufacturedate;
	}
	public String getSeatingtype() {
		return seatingtype;
	}
	public void setSeatingtype(String seatingtype) {
		this.seatingtype = seatingtype;
	}
	public String getFuel() {
		return fuel;
	}
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	public String getOwnerphonenumber() {
		return ownerphonenumber;
	}
	public void setOwnerphonenumber(String ownerphonenumber) {
		this.ownerphonenumber = ownerphonenumber;
	}
}
	