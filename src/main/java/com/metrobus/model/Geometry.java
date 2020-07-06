package com.metrobus.model;

import java.util.Arrays;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="record")
public class Geometry {

	private String type;
	private double coordinates[] = new double[1];
	//private CoordG coordinates;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double[] getCoordinates() {
		return coordinates;
	}
	public void setCoordinates(double[] coordinates) {
		this.coordinates = coordinates;
	}
	@Override
	public String toString() {
		return "Geometry [type=" + type + ", coordinates=" + Arrays.toString(coordinates) + "]";
	}
	public Geometry(String type, double[] coordinates) {
		//super();
		this.type = type;
		this.coordinates = coordinates;
	}
	


	
}
