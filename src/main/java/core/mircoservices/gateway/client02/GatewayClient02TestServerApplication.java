package core.mircoservices.gateway.client02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@RefreshScope
public class GatewayClient02TestServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayClient02TestServerApplication.class, args);
	}

}
