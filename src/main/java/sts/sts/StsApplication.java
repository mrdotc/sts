package sts.sts;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StsApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(StsApplication.class);

	public static void main(String[] args) {
		LOGGER.debug("StsApplication starting");
		LOGGER.debug("develop some function on develop-two");
		LOGGER.debug("develop some function on develop-three");
		LOGGER.debug("develop some function on develop");
		SpringApplication.run(StsApplication.class, args);
		LOGGER.debug("develop some function on develop-four");
		LOGGER.debug("develop some function on develop-five");
		LOGGER.debug("StsApplication end");
	}

}
