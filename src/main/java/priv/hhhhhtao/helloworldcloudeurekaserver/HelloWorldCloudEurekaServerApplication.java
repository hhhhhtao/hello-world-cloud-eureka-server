package priv.hhhhhtao.helloworldcloudeurekaserver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class HelloWorldCloudEurekaServerApplication {

	private final static Logger logger = LoggerFactory.getLogger(HelloWorldCloudEurekaServerApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldCloudEurekaServerApplication.class, args);
		logger.info("eureka run success");
	}

}
