package com.metrobus.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="records")
public class Geometry {

	private String type;
	private CoordG coordinates;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public CoordG getCoordG() {
		return coordinates;
	}
	public void setCoordG(CoordG coordinates) {
		this.coordinates = coordinates;
	}
	
}