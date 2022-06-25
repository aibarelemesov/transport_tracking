package com.physex.springtransporttracker.controllers;

import com.physex.springtransporttracker.models.entities.CarParameter;
import com.physex.springtransporttracker.services.CarParameterService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarParameterController {


	private final CarParameterService carParameterService;

	public CarParameterController(CarParameterService carParameterService) {
		this.carParameterService = carParameterService;
	}

	@GetMapping("/getcars")
	public List<CarParameter> getCars(@RequestParam String deviceId, @RequestParam String startDate, @RequestParam String endDate){
		return carParameterService.getCarParameters(deviceId, startDate, endDate);
	}
}
