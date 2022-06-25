package com.physex.springtransporttracker.models.entities;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class CarParameter {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(
			columnDefinition = "DATETIME"
	)
	private LocalDateTime from_unixtime_timestamp;
	@Column(
			columnDefinition = "DATETIME"
	)
	private LocalDateTime from_unixtime_creation_time;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String accountID;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String deviceID;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String timestamp;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String statusCode;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String latitude;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String longitude;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String gpsAge;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String speedKPH;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String heading;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String altitude;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String transportID;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String inputMask;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String outputMask;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String seatbeltMask;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String address;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String dataSource;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String rawData;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String distanceKM;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String odometerKM;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String odometerOffsetKM;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String geozoneIndex;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String geozoneID;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String creationTime;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String streetAddress;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String city;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String stateProvince;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String postalCode;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String country;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String subdivision;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String speedLimitKPH;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String isTollRoad;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String gpsFixType;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String gpsFixStatus;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String horzAccuracy;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String vertAccuracy;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String HDOP;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String satelliteCount;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String batteryLevel;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String batteryVolts;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String batteryTemp;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String signalStrength;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String priority;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String entityID;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String entityType;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String driverID;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String driverStatus;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String driverMessage;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String sensorLow;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String sensorHigh;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String costCenter;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String jobNumber;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String rfidTag;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String attachType;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String attachData;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String fuelPressure;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String fuelUsage;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String fuelTemp;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String fuelLevel;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String fuelLevel2;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String fuelEconomy;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String fuelTotal;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String fuelRemain;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String fuelTrip;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String fuelIdle;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String fuelPTO;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String fuelEngineOn;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String engineRpm;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String engineHours;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String engineOnHours;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String engineLoad;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String engineTorque;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String idleHours;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String workHours;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String workDistanceKM;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String transOilTemp;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String coolantLevel;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String coolantTemp;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String intakeTemp;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String brakeGForce;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String acceleration;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String accelerometerXYZ;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String brakePressure;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String massAirFlowRate;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String oilPressure;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String oilLevel;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String oilTemp;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String airPressure;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String airFilterPressure;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String turboPressure;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String ptoEngaged;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String ptoHours;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String ptoDistanceKM;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String throttlePos;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String brakePos;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String vBatteryVolts;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String j1708Fault;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String faultCode;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String malfunctionLamp;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String tirePressure;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String tireTemp;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String tankLevel;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String thermoAverage0;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String thermoAverage1;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String pulseCount;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String analog0;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String analog3;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String analog1;
	@Column(
			columnDefinition = "varchar(50)"
	)
	private String analog2;
}
