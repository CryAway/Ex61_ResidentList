package com.example.ex61;

import java.util.ArrayList;

public class President {
    private String Name;
    private int dayS;
    private int dayE;
    private String Des;

    public President(String Name, int dayS, int dayE, String Des)
    {
        this.Name=Name;
        this.dayE=dayE;
        this.dayS=dayS;
        this.Des=Des;
    }
    public String getName(){return Name;}
    public String getDes(){return Des;}
    public String getdayE(){return(Integer.toString(dayE));}
    public String getdayS(){return(Integer.toString(dayS));}

    public String toString() {return this.Name;}
}
