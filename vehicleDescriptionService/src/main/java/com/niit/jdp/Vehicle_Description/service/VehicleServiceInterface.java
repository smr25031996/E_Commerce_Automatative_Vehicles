package com.niit.jdp.Vehicle_Description.service;

import com.niit.jdp.Vehicle_Description.domain.Vehicle;
import com.niit.jdp.Vehicle_Description.execption.VehicleAlreadyExists;
import com.niit.jdp.Vehicle_Description.execption.VehicleNotFound;

import java.util.List;
import java.util.Optional;

public interface VehicleServiceInterface {
    Vehicle addVehicle(Vehicle vehicle) throws VehicleAlreadyExists;

    List<Vehicle> getAllVehicles();

    Vehicle updateVehicleInfo(Vehicle vehicle, int vehicleId) throws VehicleNotFound;

    Optional<Vehicle> getVehicleById(int vehicleId) throws VehicleNotFound;

    boolean deleteVehicleById(int vehicleId) throws VehicleNotFound;

}
