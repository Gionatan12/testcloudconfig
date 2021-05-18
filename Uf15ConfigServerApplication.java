package uf15.demo.web.data;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Uf15ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Uf15ConfigServerApplication.class, args);
	}

}
