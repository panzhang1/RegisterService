package com.sf.bizx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
/**
 * It can only scan the component under this package com.sf.bizx.*
 * @author i312127
 *
 */
@EnableConfigServer
@SpringBootApplication
public class ConfigServerApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
    }
}