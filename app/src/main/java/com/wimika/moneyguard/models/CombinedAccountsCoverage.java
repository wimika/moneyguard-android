package com.wimika.moneyguard.models;

import java.util.List;

public class CombinedAccountsCoverage {
    private List<String> accounts;
    private Double coverageLimit;

    public List<String> getAccounts(){
        return this.accounts;
    }

    public void setAccounts(List<String> accounts){
        this.accounts = accounts;
    }
}
