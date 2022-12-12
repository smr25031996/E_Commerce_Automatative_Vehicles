package com.niit.jdp.Vehicle_Description.service;

import com.niit.jdp.Vehicle_Description.domain.Vehicle;

import java.util.List;
import java.util.Optional;

public interface VehicleServiceInterface {
    Vehicle addVehicle(Vehicle vehicle);

    List<Vehicle> getAllVehicles();

    Vehicle updateVehicleInfo(Vehicle vehicle);

    Optional<Vehicle> getVehicleById(int vehicleId);

}