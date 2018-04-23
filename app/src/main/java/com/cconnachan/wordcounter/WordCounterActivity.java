package com.cconnachan.wordcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WordCounterActivity extends AppCompatActivity {

    private EditText wordsEditText;
    private TextView answerTextView;
    private Button button;
    private WordCounter wordCounter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_counter);

        wordsEditText = findViewById(R.id.wordsEditText);
        answerTextView = findViewById(R.id.answerTextView);
        button = findViewById(R.id.button);
        answerTextView.setText("The answer will go here.");
        wordCounter = new WordCounter();
    }

    public void onButtonClicked(View button){
        String wordsToCount = wordsEditText.getText().toString();
        Log.d(getClass().toString(), "The words to count are " + wordsToCount);
        answerTextView.setText(wordCounter.count(wordsToCount));
    }
}
