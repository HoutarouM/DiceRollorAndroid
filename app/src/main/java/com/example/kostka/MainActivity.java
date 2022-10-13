package com.example.kostka;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    public int randomNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button diceButton = findViewById(R.id.button);

        TextView diceTextView = findViewById(R.id.text_view);

        diceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                get random number
                randomNum = (int) (Math.random() * 6 + 1);

//                set random number to text view
                diceTextView.setText(Integer.toString(randomNum));
            }
        });
    }
}