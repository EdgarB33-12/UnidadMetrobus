package com.metrobus.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.metrobus.model.*;


@Repository
public interface MetrobusRepository extends MongoRepository<Metrobus,String>{

	
	//Consultas
	//Obtener la alcaldía correspondiente a cada unidad
	//Almacenar la información en una base de datos
	//BD
	//Obtener una lista de las unidades disponibles
	//Consultar los el historial de ubicaciones/fechas de una unidad dado su ID
	//Obtener una lista de alcaldías disponibles
	//Obtener una lista de unidades que hayan estado dentro de una alcaldía
	
    //@Query(value = "{ 'records' : {$all : [?0] }}")
    //public List<Metrobus> findAnyOfTheseValues(String[] arrayValues);
	
//	public Person findByFirstName(String firstName);
//	public List<Person>findByAge(int age);
	
}
