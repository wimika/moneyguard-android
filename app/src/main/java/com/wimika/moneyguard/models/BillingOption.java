package com.wimika.moneyguard.models;

public class BillingOption {
    private Double amount;
    private BillingFrequency billingFrequency;

    public Double getAmount(){
        return this.amount;
    }

    public BillingFrequency getBillingFrequency(){
        return this.billingFrequency;
    }
}
