package br.com.rda.sistaplog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;



@SpringBootApplication
public class SistaplogApplication {

	public static void main(String[] args) {
		SpringApplication.run(SistaplogApplication.class, args);
		System.out.print("senha abaixo :");
		System.out.print(new BCryptPasswordEncoder().encode("123"));
	}
}
