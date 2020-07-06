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
	
    public List<Metrobus> getAllList() {
        return MetrobusRepository.findAll();
    }

	//Insertar datos
	public Metrobus create (Integer nhits, Parameter parameters, ArrayList<Record> record) {
		return MetrobusRepository.save(new Metrobus(nhits, parameters, record) );
	}
	//Leer todos los registros
	public List<Metrobus> getAll(){
		return MetrobusRepository.findAll();
	}
	//Borrar todos los registros
	public void deleteAll() {
		MetrobusRepository.deleteAll();
	}

}
