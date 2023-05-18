package com.wimika.moneyguard.interfaces;

public interface Client {
    public NotificationsListener getNotificationsListener();

    public RiskExposureEventListener getRiskExposureEventListener();
}
