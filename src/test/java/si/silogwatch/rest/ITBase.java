package si.silogwatch.rest;

import org.junit.runner.RunWith;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,
        properties = { "spring.profiles.active:test" })
public class ITBase {
    @LocalServerPort
    int port;

    public void setup() {
        System.out.println("setup");
    }


    public void cleanup() {
        System.out.println("clean up");
    }
}
