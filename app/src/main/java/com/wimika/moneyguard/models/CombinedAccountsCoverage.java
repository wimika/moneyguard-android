package com.wimika.moneyguard.models;

import java.util.List;

public class CombinedAccountsCoverage {
    private List<String> accounts;
    private Double coverageLimit;

    public  CombinedAccountsCoverage( List<String> accounts, Double coverageLimit){
        this.accounts = accounts;
        this.coverageLimit = coverageLimit;
    }

    public List<String> getAccounts(){
        return this.accounts;
    }

    public void setAccounts(List<String> accounts){
        this.accounts = accounts;
    }

    public Double getCoverageLimit(){
        return this.coverageLimit;
    }
}
