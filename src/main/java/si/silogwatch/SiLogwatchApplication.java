package si.silogwatch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("si.silogwatch")
//@EntityScan(basePackages = { "si.silogwatch.model" })
public class SiLogwatchApplication {

	public static void main(String[] args) {
		SpringApplication.run(SiLogwatchApplication.class, args);
	}
}
