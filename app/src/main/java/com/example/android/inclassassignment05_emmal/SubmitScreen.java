package com.example.android.inclassassignment05_emmal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SubmitScreen extends AppCompatActivity
{

    private TextView displayText;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submit_screen);

        displayText = (TextView) findViewById(R.id.display_text);

        Intent i = getIntent();

        Student student = (Student) i.getSerializableExtra(Keys.STUDENT);
        displayText.setText(("Student name: " + student.getName() + "\n" + "Subject: " + student.getSubject() + "\n" +
                "Grade on HW: " + student.getGrade() + "\n" + "Completed HW? " + student.isCompletedHw()));

    }

}
