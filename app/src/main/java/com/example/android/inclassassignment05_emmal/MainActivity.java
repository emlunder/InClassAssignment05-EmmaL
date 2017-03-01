package com.example.android.inclassassignment05_emmal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import static android.R.attr.name;
import static com.example.android.inclassassignment05_emmal.R.id.comments;
import static com.example.android.inclassassignment05_emmal.R.id.completed;
import static com.example.android.inclassassignment05_emmal.R.id.gradeNumber;
import static com.example.android.inclassassignment05_emmal.R.id.studentName;
import static com.example.android.inclassassignment05_emmal.R.id.subject;

public class MainActivity extends AppCompatActivity
{
    TextView className;
    EditText gradeNumber;
    EditText studentName;
    EditText subjectName;
    CheckBox completedBox;
    EditText commentsText;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        studentName = (EditText) findViewById(R.id.studentName);

        gradeNumber = (EditText) findViewById(R.id.gradeNumber);

        subjectName = (EditText) findViewById(R.id.subject);

        completedBox = (CheckBox) findViewById(completed);

        commentsText = (EditText) findViewById(comments);

    }

    //opens the second activity
    public void openSubmitList(View view)
    {
        String name = studentName.getText().toString();
        String grade = gradeNumber.getText().toString();
        int gradenum = Integer.parseInt(grade);
        String subject = subjectName.getText().toString();
        boolean completedWords = completedBox.isChecked();
        String commentsWords = commentsText.getText().toString();

        Student student = new Student(name, subject, gradenum, completedWords);

        Intent i = new Intent (this, SubmitScreen.class);
        i.putExtra(Keys.STUDENT, student);
        startActivity(i);
    }

}
