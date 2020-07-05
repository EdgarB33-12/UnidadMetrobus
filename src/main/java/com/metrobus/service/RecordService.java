package com.metrobus.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.metrobus.model.Record;
import com.metrobus.repository.RecordRepository;


public class RecordService {
	
	@Autowired
	private RecordRepository recordRepository;
	
	public List<Record> findAllRecord(){
		return recordRepository.findAllRecord();
	}
	
	/*
	public void delete(String firstName) {
		Metrobus p = MetrobusRepository.findByFirstName(firstName);
		MetrobusRepository.delete(p);
	}
	*/
}
