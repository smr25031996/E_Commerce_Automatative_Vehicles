package com.niit.jdp.Vehicle_Description.service;

import com.niit.jdp.Vehicle_Description.domain.Vehicle;
import com.niit.jdp.Vehicle_Description.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleService implements VehicleServiceInterface {

    VehicleRepository vehicleRepository;

    @Autowired
    public VehicleService(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    @Override
    public Vehicle addVehicle(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    @Override
    public List<Vehicle> getAllVehicles() {
        return vehicleRepository.findAll();
    }

    @Override
    public Vehicle updateVehicleInfo(Vehicle vehicle) {
        return null;
    }

    @Override
    public Optional<Vehicle> getVehicleById(int vehicleId) {
        return vehicleRepository.findById(vehicleId);
    }
}
