package com.rocketseat.planner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PlannerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlannerApplication.class, args);
	}

}
//Sempre que for reiniciado a aplicação, o h2 database perde todas as informações
//No Insomnia para pegar o get e usar o put, precisa ser o id do post depois de iniciar a aplicação
//Se tentar usar o id que foi gerado no passado, vai dar erro.