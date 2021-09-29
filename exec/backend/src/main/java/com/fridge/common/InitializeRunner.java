package com.fridge.common;

import java.io.File;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class InitializeRunner implements CommandLineRunner {
	private static final Logger logger = LoggerFactory.getLogger(InitializeRunner.class);
	
	@Override
	public void run(String... args) throws Exception {
		// ?��?�� ?�� ?��?���? ?��?���? ?��?�� ?��?�� 
		String filePath = "fridge";
		File folder = new File(filePath);
		// Ȯ��
		if (!folder.exists()) {
			try {
				folder.mkdir();
				logger.info("make a fridge folder");
			} catch (Exception e) {
				logger.error(e.getMessage());
			}
		}
		filePath += "/post";
		folder = new File(filePath);

		if (!folder.exists()) {
			try {
				folder.mkdir(); // ?��?�� ?��?��?��?��?��.
				logger.info("make a fridge/post folder");
			} catch (Exception e) {
				logger.error(e.getMessage());
			}
		}
	}
}
