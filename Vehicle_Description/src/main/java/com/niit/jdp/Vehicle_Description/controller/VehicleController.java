package com.niit.jdp.Vehicle_Description.controller;

import com.niit.jdp.Vehicle_Description.domain.Vehicle;
import com.niit.jdp.Vehicle_Description.service.VehicleServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1")
public class VehicleController {
    private final VehicleServiceInterface vehicleServiceInterface;

    @Autowired
    public VehicleController(VehicleServiceInterface vehicleServiceInterface) {
        this.vehicleServiceInterface = vehicleServiceInterface;
    }

    @PostMapping("/vehicle")
    public ResponseEntity<?> addVehicle(@RequestBody Vehicle vehicle) {
        return new ResponseEntity<>(vehicleServiceInterface.addVehicle(vehicle), HttpStatus.CREATED);
    }

    @GetMapping("/getAllVehicles")
    public ResponseEntity<?> getAllVehicles() {
        return new ResponseEntity<>(vehicleServiceInterface.getAllVehicles(), HttpStatus.OK);
    }

    @GetMapping("/getVehicleById/{vehicleId}")
    public ResponseEntity<?> getVehicleById(@PathVariable int vehicleId) {
        return new ResponseEntity<>(vehicleServiceInterface.getVehicleById(vehicleId), HttpStatus.OK);
    }

    @PutMapping("/updateVehicle/{vehicleId}")
    public ResponseEntity<?> updateVehicle(@RequestBody Vehicle vehicle, @PathVariable int vehicleId) {
        return new ResponseEntity<>(vehicleServiceInterface.updateVehicleInfo(vehicle, vehicleId), HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/deleteVehicle/{vehicleId}")
    public ResponseEntity<?> deleteVehicle(@PathVariable int vehicleId) {
        return new ResponseEntity<>(vehicleServiceInterface.deleteVehicleById(vehicleId), HttpStatus.OK);
    }


}
