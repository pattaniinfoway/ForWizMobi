package com.bu.forwizmobi.adapter;

import java.io.Serializable;

public class TimeLineModel implements Serializable {

    String message;
    String date;
    String status;



    public TimeLineModel( String message,String date,String status)
    {
        this.message=message;
        this.date=date;
        this.status=status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
