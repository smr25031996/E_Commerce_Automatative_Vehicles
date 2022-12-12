package com.niit.jdp.Vehicle_Description.execption;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Vehicle with specified id is not found")
public class VehicleNotFound extends Exception {
}
