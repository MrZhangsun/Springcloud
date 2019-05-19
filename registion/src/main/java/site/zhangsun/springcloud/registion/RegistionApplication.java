package site.zhangsun.springcloud.registion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class RegistionApplication {

    public static void main(String[] args) {
        SpringApplication.run(RegistionApplication.class, args);
    }

}
