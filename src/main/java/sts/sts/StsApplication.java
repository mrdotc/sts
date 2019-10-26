package sts.sts;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StsApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(StsApplication.class);

	public static void main(String[] args) {
		LOGGER.debug("StsXXXXXApplication starting");
		SpringApplication.run(StsApplication.class, args);
		LOGGER.debug("StsXXXXApplication end");
	}

}
