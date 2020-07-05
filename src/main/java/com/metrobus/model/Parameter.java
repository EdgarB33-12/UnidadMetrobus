package com.metrobus.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="record")
public class Parameter {

	private String  dataset;
	private String  timezone;
	private Integer rows;
	private String  format;
	public String getDataset() {
		return dataset;
	}
	public void setDataset(String dataset) {
		this.dataset = dataset;
	}
	public String getTimezone() {
		return timezone;
	}
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}
	public Integer getRows() {
		return rows;
	}
	public void setRows(Integer rows) {
		this.rows = rows;
	}
	public String getFormat() {
		return format;
	}
	public void setFormat(String format) {
		this.format = format;
	}
	@Override
	public String toString() {
		return "Parameter [dataset=" + dataset + ", timezone=" + timezone + ", rows=" + rows + ", format=" + format + "]";
	}
	public Parameter(String dataset, String timezone, Integer rows, String format) {
		this.dataset = dataset;
		this.timezone = timezone;
		this.rows = rows;
		this.format = format;
	}
	
	
	
}
