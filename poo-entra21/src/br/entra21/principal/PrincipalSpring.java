package br.entra21.principal;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "br.entra21.controller")
public class PrincipalSpring {
	
	public static void main(String[] args) {
		//Porta padrão é a 8080
		//https://www.baeldung.com/spring-boot-change-port
//		 SpringApplication app = new SpringApplication(PrincipalSpring.class);
//	        app.setDefaultProperties(Collections
//	          .singletonMap("server.port", "8083"));
//	        app.run(args);
	        
		//usando a 8080
		SpringApplication.run(PrincipalSpring.class, args);
	        
	}
}
