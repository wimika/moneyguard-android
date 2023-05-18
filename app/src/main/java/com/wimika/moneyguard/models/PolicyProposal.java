package com.wimika.moneyguard.models;

import java.util.List;

public class PolicyProposal {

    private String id;
    private String  name;
    private String description;
    private List<String> whatsCovered;
    private List<String> whatsExcluded;
    
    private List<BillingOption> billingOptions;
    
    

    public String getId(){
        return this.id;
    }

    public List<BillingOption> getBillingOptions(){
        return this.billingOptions;
    }

    public String getName(){
        return this.name;
    }

    public String getDescription(){
        return this.description;
    }

    public List<String> getWhatsCovered(){
        return this.whatsCovered;
    }

    public List<String> getWhatsExcluded(){
        return this.whatsExcluded;
    }
}
