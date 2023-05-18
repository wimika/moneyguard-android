package com.wimika.moneyguard.models;

public class SessionInfo {
    private String partnerId;
    private String partnerSessionToken;

    public SessionInfo(String partnerId, String partnerSessionToken){
        this.partnerId = partnerId;
        this.partnerSessionToken = partnerSessionToken;
    }

    public String getPartnerId(){
        return this.partnerId;
    }

    public String getPartnerSessionToken(){
        return this.partnerSessionToken;
    }
}
