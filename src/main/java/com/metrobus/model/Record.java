package com.metrobus.model;

import java.util.Date;

import org.springframework.data.annotation.Id;

//import org.springframework.data.annotation.Id;

public class Record {

	@Id	
	private String    id;
	private String    recordid;
	private Field	  field;
	private Geometry  geometry;
	private Date record_timestamp;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRecordid() {
		return recordid;
	}
	public void setRecordid(String recordid) {
		this.recordid = recordid;
	}
	public Field getField() {
		return field;
	}
	public void setField(Field field) {
		this.field = field;
	}
	public Geometry getGeometry() {
		return geometry;
	}
	public void setGeometry(Geometry geometry) {
		this.geometry = geometry;
	}
	public Date getRecord_timestamp() {
		return record_timestamp;
	}
	public void setRecord_timestamp(Date record_timestamp) {
		this.record_timestamp = record_timestamp;
	}
	
	
	
}
