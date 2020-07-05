package com.metrobus.model;

import java.util.Date;


import org.springframework.data.mongodb.core.mapping.Document;

//import org.springframework.data.annotation.Id;

@Document(collection="record")
public class Record {

	private String   datasetid;
	private String   recordid;
	private Field 	 fields;
	private Geometry geometry;
	private String	 record_timestamp;
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
	public Field getFields() {
		return fields;
	}
	public void setFields(Field fields) {
		this.fields = fields;
	}
	public Geometry getGeometry() {
		return geometry;
	}
	public void setGeometry(Geometry geometry) {
		this.geometry = geometry;
	}
	public String getRecord_timestamp() {
		return record_timestamp;
	}
	public void setRecord_timestamp(String record_timestamp) {
		this.record_timestamp = record_timestamp;
	}
	@Override
	public String toString() {
		return "Record [datasetid=" + datasetid + ", recordid=" + recordid + ", fields=" + fields + ", geometry="
				+ geometry + ", record_timestamp=" + record_timestamp + "]";
	}
	public Record(String datasetid, String recordid, Field fields, Geometry geometry, String record_timestamp) {
		super();
		this.datasetid = datasetid;
		this.recordid = recordid;
		this.fields = fields;
		this.geometry = geometry;
		this.record_timestamp = record_timestamp;
	}

	
	
	
}
