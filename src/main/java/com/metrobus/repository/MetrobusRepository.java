package com.metrobus.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.metrobus.model.*;


@Repository
public interface MetrobusRepository extends MongoRepository<Metrobus,String>{

}
