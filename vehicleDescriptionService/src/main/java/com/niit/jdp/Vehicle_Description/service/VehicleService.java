package com.niit.jdp.Vehicle_Description.service;

import com.niit.jdp.Vehicle_Description.domain.Vehicle;
import com.niit.jdp.Vehicle_Description.execption.VehicleAlreadyExists;
import com.niit.jdp.Vehicle_Description.execption.VehicleNotFound;
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
    public Vehicle addVehicle(Vehicle vehicle) throws VehicleAlreadyExists {
        if (vehicleRepository.findById(vehicle.getVehicleID()).isPresent()) {
            throw new VehicleAlreadyExists();
        }
        return vehicleRepository.save(vehicle);
    }

    @Override
    public List<Vehicle> getAllVehicles() {
        return vehicleRepository.findAll();
    }

    @Override
    public Vehicle updateVehicleInfo(Vehicle vehicle, int vehicleId) {
        Optional<Vehicle> optUser = vehicleRepository.findById(vehicleId);
        if (optUser.isEmpty()) {
            return null;
        }
        Vehicle vehicle1 = optUser.get();
        if (vehicle.getVehicleName() != null) {
            vehicle1.setVehicleName(vehicle.getVehicleName());
        }
        if (vehicle.getCompany() != null) {
            vehicle1.setCompany(vehicle.getCompany());
        }
        if (vehicle.getPrice() != 0) {
            vehicle1.setPrice(vehicle.getPrice());
        }

        if (vehicle.getColor() != null) {
            vehicle1.setColor(vehicle.getColor());
        }

        return vehicleRepository.save(vehicle1);
    }


    @Override
    public Optional<Vehicle> getVehicleById(int vehicleId) {
        return vehicleRepository.findById(vehicleId);
    }

    @Override
    public boolean deleteVehicleById(int vehicleId) throws VehicleNotFound {
        boolean flag;
        if (vehicleRepository.findById(vehicleId).isEmpty()) {
            throw new VehicleNotFound();

        } else {
            vehicleRepository.deleteById(vehicleId);
            flag = true;
        }
        return flag;


    }

}
