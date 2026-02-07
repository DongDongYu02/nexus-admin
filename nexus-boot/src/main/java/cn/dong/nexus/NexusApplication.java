package cn.dong.nexus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.dong.nexus.modules.*.mapper")
public class NexusApplication {

    static void main(String[] args) {
        SpringApplication.run(NexusApplication.class, args);
    }
}
