package com.physex.springtransporttracker.services;

import com.physex.springtransporttracker.models.entities.CarParameter;
import com.physex.springtransporttracker.repositories.CarParameterRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.Date;
import java.util.List;

@Service
public class CarParameterService {
	private final CarParameterRepository carParameterRepository;

	public CarParameterService(CarParameterRepository carParameterRepository) {
		this.carParameterRepository = carParameterRepository;
	}

	public List<CarParameter> getCarParameters(String deviceId, String startDate, String endDate) {
		return carParameterRepository.findDudes(deviceId, startDate,endDate);
	}
}
