package com.physex.springtransporttracker.repositories;

import com.physex.springtransporttracker.models.entities.CarParameter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;
import java.util.Optional;


public interface CarParameterRepository extends JpaRepository<CarParameter, Long> {

	@Query(value = "select * from car_parameter where deviceid = ?1 and from_unixtime_timestamp between ?2 and ?3",
	nativeQuery = true)
	List<CarParameter> findDudes(String deviceID, String startDate, String endDate);

}
