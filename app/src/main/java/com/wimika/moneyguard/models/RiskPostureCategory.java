package com.wimika.moneyguard.models;

import java.util.List;

public class RiskPostureCategory {
    private String name;
    private List<RiskPostureCategoryItem> items;

    public String getName(){
        return this.name;
    }

    public List<RiskPostureCategoryItem> getItems(){
        return this.items;
    }
}
