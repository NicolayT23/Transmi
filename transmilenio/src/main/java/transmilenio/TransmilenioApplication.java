package transmilenio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan({"transmilenio"})
@EntityScan("Bean")
public class TransmilenioApplication {

	public static void main(String[] args) {
		SpringApplication.run(TransmilenioApplication.class, args);
	}

}
