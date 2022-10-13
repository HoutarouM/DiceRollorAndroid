package com.example.kostka;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public int randomNum;
    public ArrayList<Integer> diceImageIds = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button diceButton = findViewById(R.id.button);

        TextView diceTextView = findViewById(R.id.text_view);
        ImageView diceImageView = findViewById(R.id.imageView);

        diceImageIds.add(R.drawable.dice_1);
        diceImageIds.add(R.drawable.dice_2);
        diceImageIds.add(R.drawable.dice_3);
        diceImageIds.add(R.drawable.dice_4);
        diceImageIds.add(R.drawable.dice_5);
        diceImageIds.add(R.drawable.dice_6);

        diceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                get random number
                randomNum = (int) (Math.random() * 6 + 1);

//                set random number to text view
                diceTextView.setText(Integer.toString(randomNum));

                diceImageView.setImageResource(diceImageIds.get(randomNum - 1));
            }
        });
    }
}