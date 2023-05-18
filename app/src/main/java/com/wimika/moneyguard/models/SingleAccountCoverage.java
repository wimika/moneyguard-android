package com.wimika.moneyguard.models;

public class SingleAccountCoverage {
    private Double coverageLimit;
    private String account;

    public SingleAccountCoverage(String account, Double coverageLimit){
        this.account = account;
        this.coverageLimit = coverageLimit;
    }

    public String getAccount(){
        return this.account;
    }

    public Double getCoverageLimit(){
        return this.coverageLimit;
    }
}
