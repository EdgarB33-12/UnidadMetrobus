package com.metrobus.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="record")
public class CoordF {

	private Double latitude;
	private Double longitude;
	
	public CoordF(Double latitude, Double longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	
	
	
}
