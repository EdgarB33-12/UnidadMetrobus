package com.metrobus.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = true)
@Document(collection="record")
public class Metrobus {

	@Id
	private String    	id;
	private Integer   	nhits;
	private Parameter 	parameters;
	/*
	private Record		record;
	
	public Metrobus(Integer nhits, Parameter parameters, Record record) {
		//super();
		//this.id = id;
		this.nhits = nhits;
		this.parameters = parameters;
		this.record = record;
	}
	public Record getRecord() {
		return record;
	}
	public void setRecord(Record record) {
		this.record = record;
	}
	*/
	
	//https://stackoverrun.com/es/q/7938448
	//Anterior enfoque
	//List ejemploLista = new ArrayList();
	private List<Record> records = new ArrayList<Record>();
	public Metrobus(Integer nhits, Parameter parameters, List<Record> record) {
		this.nhits = nhits;
		this.parameters = parameters;
		this.records = record;
	}
	public List<Record> getRecords() {
		return records;
	}
	public void setRecords(List<Record> records) {
		this.records = records;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Integer getNhits() {
		return nhits;
	}
	public void setNhits(Integer nhits) {
		this.nhits = nhits;
	}
	public Parameter getParameters() {
		return parameters;
	}
	public void setParameters(Parameter parameters) {
		this.parameters = parameters;
	}


	@Override
	public String toString() {
		return "Metrobus [ nhits=" + nhits + ", parameters=" + parameters + ", records=" + records + "]";
	}

	
}
