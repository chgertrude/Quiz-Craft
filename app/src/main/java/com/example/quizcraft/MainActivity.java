package com.example.quizcraft;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String selectedTopicName = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final LinearLayout science = findViewById( R.id.scienceLayout);
        final LinearLayout logic = findViewById( R.id.logicLayout);
        final LinearLayout trivia = findViewById( R.id.triviaLayout);
        final LinearLayout programming = findViewById( R.id.progLayout);

        final Button startBtn = findViewById( R.id.startQuizBtn);

        science.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                selectedTopicName = "science";

                science.setBackgroundResource(R.drawable.round_back_white_stroke10);

                logic.setBackgroundResource(R.drawable.round_back_white10);
                trivia.setBackgroundResource(R.drawable.round_back_white10);
                programming.setBackgroundResource(R.drawable.round_back_white10);
            }
        });

        logic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                selectedTopicName = "logic";

                logic.setBackgroundResource(R.drawable.round_back_white_stroke10);

                science.setBackgroundResource(R.drawable.round_back_white10);
                trivia.setBackgroundResource(R.drawable.round_back_white10);
                programming.setBackgroundResource(R.drawable.round_back_white10);
            }
        });

        trivia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                selectedTopicName = "trivia";

                trivia.setBackgroundResource(R.drawable.round_back_white_stroke10);

                science.setBackgroundResource(R.drawable.round_back_white10);
                logic.setBackgroundResource(R.drawable.round_back_white10);
                programming.setBackgroundResource(R.drawable.round_back_white10);
            }
        });

        programming.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                selectedTopicName = "programming";

                programming.setBackgroundResource(R.drawable.round_back_white_stroke10);

                science.setBackgroundResource(R.drawable.round_back_white10);
                logic.setBackgroundResource(R.drawable.round_back_white10);
                trivia.setBackgroundResource(R.drawable.round_back_white10);
            }
        });

        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (selectedTopicName.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please Select a Topic", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(MainActivity.this, QuizActivity.class);
                    intent.putExtra("selectedTopic", selectedTopicName);
                    startActivity(intent);
                }
            }
        });
    }
}