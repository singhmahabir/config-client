package singh.mahabir.cfg.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Main class to start config client application
 * 
 * @author Mahabir Singh
 *
 */
@SpringBootApplication
/*
 * this annotation is required when Config-client will be used through registry server.
 */
@EnableEurekaClient
public class ConfigClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication.class, args);

    }
}
