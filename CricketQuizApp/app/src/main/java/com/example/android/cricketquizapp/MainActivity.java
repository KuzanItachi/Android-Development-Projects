package com.example.android.cricketquizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int score=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private void displaymessage(String message)
    {
        TextView scr=findViewById(R.id.your_score);
        scr.setText(message);
    }
    // This function is calculating and showing the score of the player
    public void checkscore(View view)
    {
            RadioButton q1= findViewById(R.id.q1_a);
            RadioButton q2= findViewById(R.id.q2_b);
            RadioButton q4= findViewById(R.id.q4_b);
            RadioButton q5= findViewById(R.id.q5_c);
            if(q1.isChecked()) score+=1;
            if(q2.isChecked()) score+=1;
            if(q4.isChecked()) score+=1;
            if(q5.isChecked()) score+=1;
            CheckBox q3_A= findViewById(R.id.q3_a);
            CheckBox q3_B= findViewById(R.id.q3_b);
            CheckBox q3_C= findViewById(R.id.q3_c);
            CheckBox q3_D= findViewById(R.id.q3_d);
            if(q3_A.isChecked() && q3_B.isChecked() && q3_C.isChecked() && !q3_D.isChecked()) score+=1;
            EditText q6=findViewById(R.id.q6_a);
            String s1=q6.getText().toString();
            String s2="Virat Kohli";
            if(s1.equalsIgnoreCase(s2)) score+=1;
            String message="Your Score is "+score+"/6\n";
            if(score>=4) {message+="Good Work.Keep";}
            else {message+="Need to improve your score";}
            displaymessage(message);
            if(score==0) {
                Toast.makeText(this, "You need to learn more about Cricket", Toast.LENGTH_SHORT).show();}
            else if(score==6) {Toast.makeText(this, "Excellent You have a good knowledge", Toast.LENGTH_SHORT).show();}
            else {Toast.makeText(this, "You are good but try gaining more knowledge", Toast.LENGTH_SHORT).show();}

            score=0;


    }

}
