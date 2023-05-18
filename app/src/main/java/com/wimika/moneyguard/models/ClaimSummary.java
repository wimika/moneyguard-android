package com.wimika.moneyguard.models;

import java.sql.Date;

/**
 * Class for modelling a Wimika ClaimSummary
 */
public class ClaimSummary {
    private String id;
    private String policyNumber;
    private ClaimStatusTypes status;
    private Date lossDate;
    private String lossStatementSummary;

    public String getId(){
        return this.id;
    }
    
    public String getPolicyNumber(){
        return this.policyNumber;
    }

    public ClaimStatusTypes getClaimStatus(){
        return  this.status;
    }

    public Date getLossDate(){
        return this.lossDate;
    }

    public String getLossStatementSummary(){
        return lossStatementSummary;
    }
    
}