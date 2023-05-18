package com.wimika.moneyguard.models;

import java.util.Date;
import java.util.List;

public class NewClaim {
    String policyNumber;
    Double amountLost;
    Date lossDate;
    String lossStatementSummary;
    String lossStatementDetail;
    String account;
    List<MediaElement> supportingDocuments;
}
