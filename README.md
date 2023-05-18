[![Min API](https://img.shields.io/badge/API-16%2B-blue.svg?style=plastic)](https://android-arsenal.com/api?level=16)


## MoneyGuard SDK for Android

MoneyGuard SDK for Android allows financial institutions to embed [Moneyguard](https://www.wimika.ng/moneguard) into
their Android applications. 

## Getting Started

1. Obtain a partner Id from Wimika RMS Technologies

2. Implement a REST API endpoint that exposes [Wimika Partner Bank API](https://wimikabankservice.azurewebsites.net/swagger/index.html)

3. Embed Wimika Moneyguard in your Android Application,

## Requirements
- Android SDKv16 (Android 4.1 "Jelly Bean") or later

## Usage

### 0) Permissions

```xml
<uses-permission android:name="android.permission.INTERNET" />
```

### 1) Register or Login to create a MoneyGuard session


