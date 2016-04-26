package com.twu.biblioteca;

/**
 * Created by hjing on 4/26/16.
 */
public class Information {

    protected String name;
    protected String author;
    protected int yearPublished;
    protected boolean status=true;
    protected String lendBy;

    public String displayDetail() {
        String detail = this.name+"    "+this.author+"    "+this.yearPublished+"\n";
        return detail;
    }

    public void setStatus(boolean c) {
        status = c;
    }

    public boolean getStatus() {
        return status;
    }

    public void setLendBy(String name ) {
        this.lendBy = name;
    }

}
