[![Min API](https://img.shields.io/badge/API-16%2B-blue.svg?style=plastic)](https://android-arsenal.com/api?level=16)


## MoneyGuard SDK for Android

MoneyGuard SDK for Android allows financial institutions to embed [Moneyguard](https://wimika.ng/moneyguard/) into
their Android applications. 

## Getting Started

1. Obtain a partner Id from Wimika RMS Technologies

2. Implement a REST API endpoint that exposes [Wimika Partner Bank API](https://wimikabankservice.azurewebsites.net/swagger/index.html)

3. Embed Wimika Moneyguard in your Android Application

## Requirements
- Android SDKv16 (Android 4.1 "Jelly Bean") or later

## Usage

### 1) Permissions

Ensure that the following permissions are set in your AndroidManifest.xml

```xml
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    package="com.wimika.moneyguard">

<uses-permission android:name="android.permission.INTERNET" />
<uses-permission android:name="android.permission.ACCESSIBILITY_SERVICE"/>
<uses-permission android:name="android.permission.ACCESS_WIFI_STATE"/>
</manifest>
```

### 2) Initialize MoneyGuard to obtain a session

Initialize Moneyguard. Initialization method instances of [SessionInfo](https://github.com/wimika/moneyguard-android/blob/main/app/src/main/java/com/wimika/moneyguard/models/SessionInfo.java) and [Client](https://github.com/wimika/moneyguard-android/blob/main/app/src/main/java/com/wimika/moneyguard/interfaces/Client.java). 
Your Client implementation will provide implementations of [NotificationsListener](https://github.com/wimika/moneyguard-android/blob/main/app/src/main/java/com/wimika/moneyguard/interfaces/NotificationsListener.java) and [RiskExposureListener](https://github.com/wimika/moneyguard-android/blob/main/app/src/main/java/com/wimika/moneyguard/interfaces/RiskExposureEventListener.java) instances through which Moneyguard will provide notifications and information about risk events.
```java


class MoneyGuardApp {
    public static Session intializeMoneyGuard(SessionInfo sessionInfo, Client client) {
        MoneyGuardSdk.initialize(sessionInfo, client);
    }
}

```


### 3) Choose Accounts to cover and coverage limits, then pay for subscription
```java


class MoneyGuardApp {
    
    private Session session;
    public Policy subscribe(String accountNumber, Double coverageLimit, Boolean autoRenew, String paymentAccount) {
        
        //Obtain policy proposal for type of account coverage. 
        PolicyProposal proposal = this.session.requestPolicyProposal(new SingleAccountCoverage(accountNumber, coverageLimit));
        
        //Select a billing option 
        Integer selectedBillingOption = 0;
        BillingOption billingOption = proposal.getBillingOptions().get(selectedBillingOption);
        
        //Pay, and  obtain Policy
        return session.buyPolicy(proposal, billingOption, autoRenew, paymentAccount );
    }
}

```