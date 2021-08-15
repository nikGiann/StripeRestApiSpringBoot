package com.alchemist.stripeSpringBoot;

import com.stripe.Stripe;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class StripeSpringBootApplication {

	@Value("${stripe.api.key}")
	private String stripeApiKey;

	@PostConstruct
	public void setup(){
		Stripe.apiKey = stripeApiKey;
		
	}
	public static void main(String[] args) {
		SpringApplication.run(StripeSpringBootApplication.class, args);
	}

}
