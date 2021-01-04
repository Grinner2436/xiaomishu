package com.grinner.xiaomishu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class XiaomishuApplication {

	public static void main(String[] args) {
		SpringApplication.run(XiaomishuApplication.class, args);
	}

}
