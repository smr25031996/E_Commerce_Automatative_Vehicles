package com.niit.jdp.Vehicle_Description.repository;

import com.niit.jdp.Vehicle_Description.domain.Vehicle;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends MongoRepository<Vehicle, Integer> {

}
