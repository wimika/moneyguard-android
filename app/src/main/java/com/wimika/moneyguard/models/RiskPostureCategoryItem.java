package com.wimika.moneyguard.models;

public class RiskPostureCategoryItem {
    private Double riskScore;
    private Double maxRiskScore;
    private String name;
    private MediaElement icon;
    private RiskPostureCategoryItemStatuses status;
    private String action;

    public Double getRiskScore(){
        return this.riskScore;
    }

    public Double getMaxRiskScore(){
        return this.maxRiskScore;
    }

    public String getName(){
        return this.name;
    }

    public MediaElement getIcon(){
        return this.icon;
    }

    public RiskPostureCategoryItemStatuses getStatus(){
        return this.status;
    }

    public String getAction(){
        return action;
    }
}
