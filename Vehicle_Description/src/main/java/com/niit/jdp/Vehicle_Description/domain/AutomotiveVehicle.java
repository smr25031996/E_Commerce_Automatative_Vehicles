package com.niit.jdp.Vehicle_Description.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class AutomotiveVehicle {
    @Id
    private int vehicleID;
    private String vehicleName;
    private String company;
    private double price;
    private String color;

    public AutomotiveVehicle() {
    }

    public AutomotiveVehicle(int vehicleID, String vehicleName, String company, double price, String color) {
        this.vehicleID = vehicleID;
        this.vehicleName = vehicleName;
        this.company = company;
        this.price = price;
        this.color = color;
    }

    public int getVehicleID() {
        return vehicleID;
    }

    public void setVehicleID(int vehicleID) {
        this.vehicleID = vehicleID;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "AutomotiveVehicle{" + "vehicleID=" + vehicleID + ", vehicleName='" + vehicleName + '\'' + ", company='" + company + '\'' + ", price=" + price + ", color='" + color + '\'' + '}';
    }
}
