package com.metrobus.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.metrobus.model.Metrobus;
import com.metrobus.model.Record;

@Repository
public interface RecordRepository {
	//Enlista todos los registros de autobuses
	//Enlistar todas las unidades disponibles
	public List<Record> findAllRecord();
	//Consultar los el historial de ubicaciones/fechas de una unidad dado su ID
	public List<Record> findHistorial(double lat, double lon, String fecha );
	//Obtener una lista de alcaldías disponibles
	public List<Record> findAllcaldias();
	//Obtener una lista de unidades que hayan estado dentro de una alcaldía
	public List<Record> findAllUnidadAlcaldia(int id);
	
	/*
	public List<Cliente> findAll();
	
	public void save(Cliente cliente);
	
	public Cliente findOne(Long id);
	
	public void delete(Long id);
	*/
}
