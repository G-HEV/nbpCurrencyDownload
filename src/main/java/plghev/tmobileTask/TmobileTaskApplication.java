package plghev.tmobileTask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"/controller","/service","/httpClient"})
public class TmobileTaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(TmobileTaskApplication.class, args);
	}

}
