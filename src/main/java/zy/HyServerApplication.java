package zy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDiscoveryClient

public class HyServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(HyServerApplication.class, args);
        System.out.println("启动成功！！！！");
    }

}
