package site.zhangsun.springcloud.registionclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class RegistionClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(RegistionClientApplication.class, args);
    }

}
