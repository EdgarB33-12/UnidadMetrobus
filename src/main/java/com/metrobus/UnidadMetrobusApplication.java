package com.metrobus;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.metrobus.model.Metrobus;
import com.metrobus.model.Record;

@SpringBootApplication
// Ingresar esta linea si tengo problemas con inicializar el programa
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class UnidadMetrobusApplication {

	public static void main(String[] args) {
		SpringApplication.run(UnidadMetrobusApplication.class, args);
		System.out.println("Hola mundo");
		
		
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}
	private List<Record> record = new ArrayList<Record>();
	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			/*
			Metrobus  metrobus = restTemplate.getForObject(
					"https://datos.cdmx.gob.mx/api/records/1.0/search/?dataset=prueba_fetchdata_metrobus&q=",
					Metrobus.class);
			//log.info(record.toString());
			//System.out.print("Quote name is "+ quote.getFirstName());
			System.out.println("Edgar : " + metrobus.toString() );
			*/
			Metrobus  metrobus = restTemplate.getForObject(
					//"https://datos.cdmx.gob.mx/api/records/1.0/search/?dataset=prueba_fetchdata_metrobus&q=&rows=2",
					"https://datos.cdmx.gob.mx/api/records/1.0/search/?dataset=prueba_fetchdata_metrobus&q=",
					Metrobus.class);
			//log.info(record.toString());
			System.out.println("Edgar : " + metrobus.toString() );
			
			//System.out.println("Beltran: " + metrobus.getRecord());
//			https://o7planning.org/en/11647/spring-boot-restful-client-with-resttemplate-example
		};
		/*
		List<Employee> employees = response.getEmployees();
		//Imprimir rest array
		//https://javarevisited.blogspot.com/2017/02/how-to-consume-json-from-restful-web-services-Spring-RESTTemplate-Example.html
		//Almacenar los datos sería
		//https://www.baeldung.com/spring-rest-template-list
		List<Employee> newEmployees = new ArrayList<>();
		newEmployees.add(new Employee(3, "Intern"));
		newEmployees.add(new Employee(4, "CEO"));
		 
		restTemplate.postForObject(
		  "http://localhost:8080/employees",
		  new EmployeeList(newEmployees),
		  ResponseEntity.class);
		*/
		
	}
}
