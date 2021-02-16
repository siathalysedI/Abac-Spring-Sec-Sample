package com.rvdv.cross.abac.security.sampleattributeprotection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.rvdv.cross.abac.security.sampleattributeprotection", "com.rvdv.cross.abac.security"})
public class SampleAttributeProtectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleAttributeProtectionApplication.class, args);
	}

}
