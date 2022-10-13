package com.example.kostka;

import java.util.ArrayList;

public class Dice {
    private int value;
    private int imageId;
    private boolean isClicked;

    private ArrayList<Integer> diceImageIds = new ArrayList<>();

    public Dice() {
        setDiceImage();

        this.value = (int) (Math.random() * 6 + 1);
        this.isClicked = false;
        this.imageId = diceImageIds.get(this.value - 1);
    }

    private void setDiceImage() {
        diceImageIds.add(R.drawable.dice_1);
        diceImageIds.add(R.drawable.dice_2);
        diceImageIds.add(R.drawable.dice_3);
        diceImageIds.add(R.drawable.dice_4);
        diceImageIds.add(R.drawable.dice_5);
        diceImageIds.add(R.drawable.dice_6);
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public boolean isClicked() {
        return isClicked;
    }

    public void setClicked(boolean clicked) {
        isClicked = clicked;
    }
}
