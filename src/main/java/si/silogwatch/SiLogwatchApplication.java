package si.silogwatch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("si.silogwatch")
@SpringBootApplication
public class SiLogwatchApplication {

	public static void main(String[] args) {
		SpringApplication.run(SiLogwatchApplication.class, args);
	}
}
