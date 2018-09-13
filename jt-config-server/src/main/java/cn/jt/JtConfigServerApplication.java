package cn.jt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer	//配置中心
public class JtConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(JtConfigServerApplication.class, args);
	}
}
