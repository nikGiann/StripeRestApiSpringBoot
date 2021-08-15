package com.alchemist.stripeSpringBoot.controller;

import com.alchemist.stripeSpringBoot.dto.CreatePayment;
import com.alchemist.stripeSpringBoot.dto.CreatePaymentResponse;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;
import com.stripe.param.PaymentIntentCreateParams;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
@CrossOrigin(origins = {"http://localhost:3000"})
@RequestMapping(value = "/api")
public class PaymentController {

    @PostMapping("/create-payment-intent")
    public CreatePaymentResponse createPaymentIntent (@RequestBody @Valid CreatePayment createPayment) throws StripeException {

            PaymentIntentCreateParams createParams = new PaymentIntentCreateParams.Builder()
                    .addPaymentMethodType("card")
                    .setCurrency(createPayment.getCurrency())
                    .setAmount(createPayment.getAmount()*100L)      // createPayment ... what user want to buy
                    .setReceiptEmail(createPayment.getEmail())
                    .putMetadata("Feature Request", createPayment.getFeatureRequest())
			.build();

            // Create a PaymentIntent with the order amount and currency
            PaymentIntent intent = PaymentIntent.create(createParams);
            return new CreatePaymentResponse(intent.getClientSecret());
    }





}