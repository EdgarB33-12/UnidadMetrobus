package com.metrobus.model;

import java.util.Date;


import org.springframework.data.mongodb.core.mapping.Document;

//import org.springframework.data.annotation.Id;

@Document(collection="record")
public class Record {

	private String   datasetid;
	private String   recordid;
	private Field 	 field;
	private Geometry geometry;
	private Date	 record_timestamp;
	public String getDatasetid() {
		return datasetid;
	}
	public void setDatasetid(String datasetid) {
		this.datasetid = datasetid;
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
	public Record(String datasetid, String recordid, Field field, Geometry geometry, Date record_timestamp) {
		this.datasetid = datasetid;
		this.recordid = recordid;
		this.field = field;
		this.geometry = geometry;
		this.record_timestamp = record_timestamp;
	}
		
	@Override
	public String toString() {
		return "Record [datasetid=" + datasetid + ", recordid=" + recordid + ", field=" + field + ", geometry="
				+ geometry + ", record_timestamp=" + record_timestamp + "]";
	}

	
	
}
