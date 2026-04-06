package tn.esprit.arctic8;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling //activation du service
@SpringBootApplication
public class Arctic8Application {

    public static void main(String[] args) {
        SpringApplication.run(Arctic8Application.class, args);
    }

}
