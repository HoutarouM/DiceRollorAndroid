package com.example.kostka;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<ImageView> diceImageViews = new ArrayList<>();
    ArrayList<Dice> rolledDices = new ArrayList<>();

    Button diceButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        diceImageViews.add(findViewById(R.id.imageView1));
        diceImageViews.add(findViewById(R.id.imageView2));
        diceImageViews.add(findViewById(R.id.imageView3));
        diceImageViews.add(findViewById(R.id.imageView4));
        diceImageViews.add(findViewById(R.id.imageView5));


        diceButton = findViewById(R.id.button);

        randomDices();


        for (int i = 0; i < diceImageViews.size(); i++) {
            ImageView diceImageView = diceImageViews.get(i);

            int id = i;

            diceImageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (diceImageView.getImageAlpha() == 50) {
                        diceImageView.setImageAlpha(255);

                        rolledDices.get(id).setClicked(false);
                    } else {
                        diceImageView.setImageAlpha(50);

                        rolledDices.get(id).setClicked(true);
                    }
                }
            });

            diceButton.setOnClickListener(view -> {
                randomDices();
            });
        }
    }

    private void randomDices() {
        if (rolledDices.size() == 0) {
            for (int i = 0; i < 5; i++) {
                Dice dice = new Dice();

                rolledDices.add(dice);

                diceImageViews.get(i).setImageResource(dice.getImageId());
            }
        } else {
            for (int i = 0; i < 5; i++) {
                Dice dice = rolledDices.get(i);
                if (dice.isClicked() == false) {
                    dice.setValue();

                    diceImageViews.get(i).setImageResource(dice.getImageId());
                }
            }
        }
    }
}