package com.wimika.moneyguard.models;

import java.util.List;

public class OnboardingInfo {

    private List<String> paragraphs;
    private MediaElement mediaElement; 

    public List<String> getParagraphs(){
        return this.paragraphs;
    }

    public MediaElement getMediaElement(){
        return this.mediaElement;
    }
}
