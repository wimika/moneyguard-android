package com.wimika.moneyguard.models;

import java.util.ArrayList;
import java.util.List;

public class PerAccountCoverage {

    private List<SingleAccountCoverage> coverages;

    public PerAccountCoverage(List<SingleAccountCoverage> coverages){
        this.coverages = coverages;
    }

    public List<SingleAccountCoverage> getCoverages(){
        return this.coverages;
    }


}
