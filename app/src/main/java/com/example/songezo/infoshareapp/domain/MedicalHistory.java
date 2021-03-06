package com.example.songezo.infoshareapp.domain;


import java.util.Date;
import java.util.Locale;

/**
 * Created by Songezo on 2016-12-09.
 */
public class MedicalHistory {
    private long id;
    private Date date;
    private String task;
    private String comments;

    public MedicalHistory(Builder builderObjt){
        id = builderObjt.id;
        date = builderObjt.date;
        task = builderObjt.task;
        comments = builderObjt.comments;
    }

    public MedicalHistory(Date date, String task, String comments, long id){
        this.id = id;
        this.date = date;
        this.task = task;
        this.comments = comments;
    }

    public Date getDate() {
        return date;
    }

    public String getTask() {
        return task;
    }

    public String getComments() {
        return comments;
    }

    public long getId() {
        return id;
    }

    private MedicalHistory(){
    }

    public static class Builder{
        private long id;
        private Date date;
        private String task;
        private String comments;

        public Builder date(Date date){
            this.date = date;
            return this;
        }

        public Builder task(String task){
            this.task = task;
            return this;
        }

        public Builder comments(String comments){
            this.comments = comments;
            return this;
        }

        public Builder id(long id){
            this.id = id;
            return this;
        }

        public Builder copyObj(MedicalHistory medicalHistoryObj){
            this.id = medicalHistoryObj.getId();
            this.date = medicalHistoryObj.getDate();
            this.task = medicalHistoryObj.getTask();
            this.comments = medicalHistoryObj.getComments();
            return this;
        }

        public MedicalHistory build(){
            return new MedicalHistory(this);
        }
    }


}
