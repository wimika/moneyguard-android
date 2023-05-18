package com.wimika.moneyguard.models;

import java.util.List;

public class AccountsCoverage {
    private AccountCoverageTypes coverageType;
    private List<Double> coverageLimits;

    public AccountCoverageTypes getCoverageType(){
        return this.coverageType;
    }

    public List<Double> getCoverageLimits(){
        return this.coverageLimits;
    }
}
