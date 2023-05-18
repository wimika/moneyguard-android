package com.wimika.moneyguard.models;

/**
 * Class for Modelling a Risk Event
 */
public class RiskEvent {

    private String _id;
    private String _caption;

    public RiskEvent()
    {

    }
    

    /**
     * A globally unique identifier for this RiskEvent
     */
    public String id()
    {
        return _id;
    }

    /**
     * A globally unique identifier for this RiskEvent
     */
    public String caption()
    {
        return _caption;
    }
}
