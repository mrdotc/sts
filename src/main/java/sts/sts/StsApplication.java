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
		LOGGER.debug("StsApplication fixing-0ne");
		LOGGER.debug("StsApplication fixing-three");
		LOGGER.debug("StsApplication fixing-two");
		LOGGER.debug(" fixing-two");
		LOGGER.debug(" fixing-TTT");
		LOGGER.debug(" fixing-Aodi");
		LOGGER.debug("StsApplication fixing-again-one");
		LOGGER.debug("StsApplication fixing-again-two");
		SpringApplication.run(StsApplication.class, args);
		LOGGER.debug("StsApplication fixing-again-three");
		LOGGER.debug("StsApplication end");
	}

}
