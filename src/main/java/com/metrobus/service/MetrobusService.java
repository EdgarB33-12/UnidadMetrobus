package com.metrobus.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.metrobus.model.*;
import com.metrobus.repository.MetrobusRepository;

@Service
public class MetrobusService {

	@Autowired
	private MetrobusRepository MetrobusRepository;
	
	/*
	@Override
    public List<Record> findAllRecord() {
        return MetrobusRepository.findAllRecord();
    }
	*/
	
	//Insertar datos
	public Metrobus create (Integer nhits, Parameter parameters, ArrayList<Record> record) {
		return MetrobusRepository.save(new Metrobus(nhits, parameters, record) );
	}
	//Leer todos los registros
	public List<Metrobus> getAll2(){
		return MetrobusRepository.findAll();
	}
	/*
	 * CONSULTAS ESPECIFICAS
	public Metrobus getByFirstName(String firstName) {
		return MetrobusRepository.findByFirstName(firstName);
	}
	*/
	/*
	//Update operation
	public Metrobus update(String firstName, String lastName, int age) {
		Metrobus p = MetrobusRepository.findByFirstName(firstName);
		p.setLastName(lastName);
		p.setAge(age);
		return MetrobusRepository.save(p);
	}
	*/
	//Borrar todos los registros
	public void deleteAll() {
		MetrobusRepository.deleteAll();
	}
	/*
	public void delete(String firstName) {
		Metrobus p = MetrobusRepository.findByFirstName(firstName);
		MetrobusRepository.delete(p);
	}
	*/
}
