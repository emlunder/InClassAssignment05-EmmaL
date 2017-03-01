package com.example.android.inclassassignment05_emmal;

import java.io.Serializable;

/**
 * Created by default on 2/27/17.
 */

public class Student implements Serializable
{
    private String name;
    private String subject;
    private int grade;
    private boolean completedHw;

    public Student(String name, String subject, int grade, boolean completedHw)
    {
        this.name = name;
        this.subject = subject;
        this.grade = grade;
        this.completedHw = completedHw;
    }

    public String getName()
    {
        return name;
    }

    public String getSubject()
    {
        return subject;
    }

    public int getGrade()
    {
        return grade;
    }

    public boolean isCompletedHw()
    {
        return completedHw;
    }
}
