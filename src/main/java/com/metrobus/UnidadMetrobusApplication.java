package com.metrobus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
// Ingresar esta linea si tengo problemas con inicializar el programa
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class UnidadMetrobusApplication {

	public static void main(String[] args) {
		SpringApplication.run(UnidadMetrobusApplication.class, args);
		System.out.println("Hola mundo");
	}

}
