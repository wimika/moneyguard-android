package com.wimika.moneyguard.models;

public abstract class MediaElement {

    private ContentFormat contentFormat;
    private MediaElementType mediaElementType;
    
    public  ContentFormat getContentFormat(){
        return this.contentFormat;
    }

    public  MediaElementType getMediaElementType(){
        return this.mediaElementType;
    }


}
