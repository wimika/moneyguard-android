package com.wimika.moneyguard.interfaces;

import com.wimika.moneyguard.models.Notification;

public interface NotificationsListener {
    
    public void onNewNotification(Notification notification); 
}
