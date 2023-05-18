package com.wimika.moneyguard.models;

public class BankAccount {
    private String type;
    private String accountNumber;

    public BankAccount(String type, String accountNumber){
        this.type = type;
        this.accountNumber = accountNumber;
    }

    public String getType(){
        return this.type;
    }

    public String getAccountNumber(){
        return this.accountNumber;
    }
}
