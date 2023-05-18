package com.wimika.moneyguard.models;

import java.util.Date;
import java.util.List;

public class SecurityModule extends SecurityModuleSummary {

    private MediaElement content;
    private Date quizStarted;
    private Date quizCompleted;
    private String objective;
    private List<String> instructions;
    private List<SecurityModuleQuestion> questions;

    public String getObjective(){
        return this.objective;
    }

    public MediaElement getContent(){
        return this.content;
    }

    public SecurityModuleQuestion beginQuiz(){
        return null;
    }

    public SecurityModuleQuestion previousQuestion(){

        return null;
    }

    public String answerCurrentQuestion(String answer){
        return null;
    }

    public SecurityModuleQuestion nextQuestion(){
        return null;
    }


}
