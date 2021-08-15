package com.alchemist.stripeSpringBoot.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

public class CreatePayment {

    @NotNull
    private Integer amount;

    @NotNull
    @Email
    private String email;

    @NotNull
    private String currency;

    private String featureRequest;

    public CreatePayment(Integer amount, String email,String currency, String featureRequest) {
        this.amount = amount;
        this.email = email;
        this.featureRequest = featureRequest;
        this.currency = currency;
    }

    public CreatePayment() {

    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getFeatureRequest() {
        return featureRequest;
    }

    public void setFeatureRequest(String featureRequest) {
        this.featureRequest = featureRequest;
    }

    @Override
    public String toString() {
        return "CreatePayment{" +
                "amount=" + amount +
                ", email='" + email + '\'' +
                ", currency='" + currency + '\'' +
                ", featureRequest='" + featureRequest + '\'' +
                '}';
    }
}