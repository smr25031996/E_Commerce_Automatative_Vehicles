package com.niit.jdp.Vehicle_Description.service;

import com.niit.jdp.Vehicle_Description.domain.Vehicle;

import java.util.List;

public interface VehicleServiceInterface {
    Vehicle addVehicle(Vehicle vehicle);

    List<Vehicle> getAllVehicles();

    Vehicle updateVehicleInfo(Vehicle vehicle);

    Vehicle getVehicleById(int vehicleId);

}
