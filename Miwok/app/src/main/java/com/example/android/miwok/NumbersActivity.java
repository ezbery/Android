package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        // Create a list of words
        ArrayList<String> words = new ArrayList();
        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");
        words.add("eight");
        words.add("nine");
        words.add("ten");

        // Find the root view so we can add child views to it
        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootview);

        // Create a variable to keep track of the current index position
        int index = 0;

        while (index < words.size()) {
            TextView wordView = new TextView(this);
            wordView.setText(words.get(index));
            rootView.addView(wordView);
            index++;
        }
    }
}
