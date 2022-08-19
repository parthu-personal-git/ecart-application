package ecart.pracitice.ecart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EcartApplication {

	public static void main(String[] args) {
		System.out.println("hi from main function");
		SpringApplication.run(EcartApplication.class, args);
	}

}
