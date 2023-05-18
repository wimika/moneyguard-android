package com.wimika.moneyguard.interfaces;

import com.wimika.moneyguard.models.RiskEvent;

public interface RiskExposureEventListener {
    public void onNewRiskEvent(RiskEvent riskEvent);
}
