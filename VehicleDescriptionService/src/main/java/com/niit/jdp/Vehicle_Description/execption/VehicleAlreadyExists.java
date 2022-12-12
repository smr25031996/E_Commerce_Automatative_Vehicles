package com.niit.jdp.Vehicle_Description.execption;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.CONFLICT, reason = "Vehicle Already  exists ")
public class VehicleAlreadyExists extends Exception {

}
