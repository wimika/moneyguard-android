package com.wimika.moneyguard.models;

public class SecurityModuleSummary {
    private String title;
    private Boolean isRequired;
    private MediaElement icon;
    private Boolean isCompleted;
    private String id;

    public String getid(){
        return this.id;
    }

    public String getTitle(){
        return this.title;
    }

    public Boolean getIsRequired(){
        return this.isRequired;
    }

    public MediaElement getIcon(){
        return this.icon;
    }

    public Boolean getIsCompleted(){
        return this.isCompleted;
    }
}
