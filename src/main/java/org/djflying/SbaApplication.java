package org.djflying;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableAdminServer
@SpringBootApplication
@EnableDiscoveryClient
public class SbaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SbaApplication.class, args);
    }

}
