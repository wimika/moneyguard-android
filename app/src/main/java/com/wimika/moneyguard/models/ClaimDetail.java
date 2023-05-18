package com.wimika.moneyguard.models;

import java.util.List;

public class ClaimDetail extends ClaimSummary {

    private String lossStatementDetail;
    private List<MediaElement> supportingDocuments;
    private List<ClaimUpdate> updates;
    private Double amountLost; 
    private String account;
    
}
