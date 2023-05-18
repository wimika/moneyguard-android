package com.wimika.moneyguard.models;

import java.util.List;

public class RiskPosture {
    private List<RiskPostureCategory> categories;

    public List<RiskPostureCategory> getCategories(){
        return this.categories; 
    }

    public Double getRiskScore(){

        return 0.0;

    }

    public Double getMaxRiskScore(){
        return 100.0;
    }

}
