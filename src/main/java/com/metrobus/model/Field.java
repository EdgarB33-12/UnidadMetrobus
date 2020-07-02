package com.metrobus.model;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="records")
public class Field {

	private String 	vehicle_id;
	private String 	trip_start_date;
	private Date 	date_update;
	private Double 	position_longitude;
	private Integer trip_schedule_relationship;
	private Integer	position_speed;
	private Double	position_latitude;
	private String 	trip_route_id;
	private String	vehicule_label;
	private Integer	position_odometer;
	private	String	trip_id;
	private Integer	vehicule_current_status;
	private CoordF	geographic_point;
	
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
	public Date getDate_update() {
		return date_update;
	}
	public void setDate_update(Date date_update) {
		this.date_update = date_update;
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
	public String getVehicule_label() {
		return vehicule_label;
	}
	public void setVehicule_label(String vehicule_label) {
		this.vehicule_label = vehicule_label;
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
	public Integer getVehicule_current_status() {
		return vehicule_current_status;
	}
	public void setVehicule_current_status(Integer vehicule_current_status) {
		this.vehicule_current_status = vehicule_current_status;
	}
	public CoordF getGeographic_point() {
		return geographic_point;
	}
	public void setGeographic_point(CoordF geographic_point) {
		this.geographic_point = geographic_point;
	}
	
	
	
}
