package com.metrobus.model;

import java.util.Arrays;
import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="record")
public class Field {

	private String 	vehicle_id;
	private String 	trip_start_date;
	private String 	date_updated;
	private Double 	position_longitude;
	private Integer trip_schedule_relationship;
	private Integer	position_speed;
	private Double	position_latitude;
	private String 	trip_route_id;
	private String	vehicle_label;
	private Integer	position_odometer;
	private	String	trip_id;
	private Integer	vehicle_current_status;
	//private List<Double>	
    //private double a[];
    //a = new double[4];
	private double geographic_point[] = new double[1];
	public String getVehicle_id() {
		return vehicle_id;
	}
	public void setVehicle_id(String vehicle_id) {
		this.vehicle_id = vehicle_id;
	}
	public String getTrip_start_date() {
		return trip_start_date;
	}
	public void setTrip_start_date(String trip_start_date) {
		this.trip_start_date = trip_start_date;
	}
	public String getDate_updated() {
		return date_updated;
	}
	public void setDate_updated(String date_updated) {
		this.date_updated = date_updated;
	}
	public Double getPosition_longitude() {
		return position_longitude;
	}
	public void setPosition_longitude(Double position_longitude) {
		this.position_longitude = position_longitude;
	}
	public Integer getTrip_schedule_relationship() {
		return trip_schedule_relationship;
	}
	public void setTrip_schedule_relationship(Integer trip_schedule_relationship) {
		this.trip_schedule_relationship = trip_schedule_relationship;
	}
	public Integer getPosition_speed() {
		return position_speed;
	}
	public void setPosition_speed(Integer position_speed) {
		this.position_speed = position_speed;
	}
	public Double getPosition_latitude() {
		return position_latitude;
	}
	public void setPosition_latitude(Double position_latitude) {
		this.position_latitude = position_latitude;
	}
	public String getTrip_route_id() {
		return trip_route_id;
	}
	public void setTrip_route_id(String trip_route_id) {
		this.trip_route_id = trip_route_id;
	}
	public String getVehicle_label() {
		return vehicle_label;
	}
	public void setVehicle_label(String vehicle_label) {
		this.vehicle_label = vehicle_label;
	}
	public Integer getPosition_odometer() {
		return position_odometer;
	}
	public void setPosition_odometer(Integer position_odometer) {
		this.position_odometer = position_odometer;
	}
	public String getTrip_id() {
		return trip_id;
	}
	public void setTrip_id(String trip_id) {
		this.trip_id = trip_id;
	}
	public Integer getVehicle_current_status() {
		return vehicle_current_status;
	}
	public void setVehicle_current_status(Integer vehicle_current_status) {
		this.vehicle_current_status = vehicle_current_status;
	}
	public double[] getGeographic_point() {
		return geographic_point;
	}
	public void setGeographic_point(double[] geographic_point) {
		this.geographic_point = geographic_point;
	}
	@Override
	public String toString() {
		return "Field [vehicle_id=" + vehicle_id + ", trip_start_date=" + trip_start_date + ", date_updated="
				+ date_updated + ", position_longitude=" + position_longitude + ", trip_schedule_relationship="
				+ trip_schedule_relationship + ", position_speed=" + position_speed + ", position_latitude="
				+ position_latitude + ", trip_route_id=" + trip_route_id + ", vehicle_label=" + vehicle_label
				+ ", position_odometer=" + position_odometer + ", trip_id=" + trip_id + ", vehicle_current_status="
				+ vehicle_current_status + ", geographic_point=" + Arrays.toString(geographic_point) + "]";
	}
	public Field(String vehicle_id, String trip_start_date, String date_updated, Double position_longitude,
			Integer trip_schedule_relationship, Integer position_speed, Double position_latitude, String trip_route_id,
			String vehicle_label, Integer position_odometer, String trip_id, Integer vehicle_current_status,
			double[] geographic_point) {
		//super();
		this.vehicle_id = vehicle_id;
		this.trip_start_date = trip_start_date;
		this.date_updated = date_updated;
		this.position_longitude = position_longitude;
		this.trip_schedule_relationship = trip_schedule_relationship;
		this.position_speed = position_speed;
		this.position_latitude = position_latitude;
		this.trip_route_id = trip_route_id;
		this.vehicle_label = vehicle_label;
		this.position_odometer = position_odometer;
		this.trip_id = trip_id;
		this.vehicle_current_status = vehicle_current_status;
		this.geographic_point = geographic_point;
	}

	
	
	

	
	
	
}
