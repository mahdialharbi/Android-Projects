package com.example.mahdialharbi.colortapgameofficial;

import android.app.ActionBar;
import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.StringTokenizer;


public class MainActivity extends AppCompatActivity {

    List<Integer> rgbColors = new ArrayList<Integer>();

    Set<Integer> finalColors = new HashSet<Integer>();

    List<Integer> rgbColorsRandom = new ArrayList<Integer>();

    List<String> colorStrings = new ArrayList<String>();

    List<Integer> colorRGB = new ArrayList<Integer>();

    Map<Integer,String> correctColor = new HashMap<Integer,String>();

    Random rand = new Random();

    int answerLocation;

    int generatedColor;

    int scoreTracker = 0;

    int randomColorDisplay;

    String stringGeneratedColor;

    String randomColor;

    Button buttonOne, buttonTwo, buttonThree, buttonFour;

    TextView scoreText, timerText, randomColorText;

    int score = 0;

    /*public void generateNewColor() {
        buttonOne.setBackgroundColor(rgbColors.get(new Random().nextInt(rgbColors.size())));
        buttonTwo.setBackgroundColor(rgbColors.get(new Random().nextInt(rgbColors.size())));
        buttonThree.setBackgroundColor(rgbColors.get(new Random().nextInt(rgbColors.size())));
        buttonFour.setBackgroundColor(rgbColors.get(new Random().nextInt(rgbColors.size())));

    }*/



    public void generateNewColor() {

        answerLocation = rand.nextInt(4);

        randomColor = colorStrings.get(new Random().nextInt(colorStrings.size()));

        finalColors.clear();

        colorRGB.clear();
        // generateNewColor();



        randomColorText.setTextColor(rgbColorsRandom.get(new Random().nextInt(rgbColorsRandom.size())));

        //randomColorText.setBackgroundColor(rgbColorsRandom.get(new Random().nextInt(rgbColorsRandom.size())));

        ColorDrawable colorTextBackground = (ColorDrawable) randomColorText.getBackground();

       // int backgroundColor = colorTextBackground.getColor();

        int foregroundColor = randomColorText.getCurrentTextColor();

//        randomColorDisplay = rgbColorsRandom.get(new Random().nextInt(rgbColorsRandom.size()));

//        randomColorText.setText(Integer.toHexString(randomColorDisplay));

        //Log.i("Random String Color", randomColor);

//        Log.i("Random Color Display", Integer.toHexString(randomColorDisplay));

        generatedColor = Color.parseColor(randomColor);

        stringGeneratedColor = Integer.toHexString(generatedColor);

        //Log.i("Converted String Color", stringGeneratedColor);

        //Log.i("Random Button Color", Integer.toHexString(((ColorDrawable) buttonOne.getBackground()).getColor()));


        finalColors.addAll(colorRGB);
//        colorRGB.clear();
//        colorRGB.addAll(finalColors);
        //System.out.println("Initial Size: " + finalColors.size());

        while (finalColors.size() != 4) {
            finalColors.add(rgbColorsRandom.get(new Random().nextInt(rgbColorsRandom.size())));
        }

        if (finalColors.size() == 4) {
            colorRGB.clear();
            colorRGB.addAll(finalColors);
        }

        buttonOne.setBackgroundColor(colorRGB.get(0));
        buttonTwo.setBackgroundColor(colorRGB.get(1));
        buttonThree.setBackgroundColor(colorRGB.get(2));
        buttonFour.setBackgroundColor(colorRGB.get(3));

        for (int i = 0; i < 4; i++) {


            if (i == answerLocation) {
//                System.out.println(i);
                //colorRGB.add(randomColorDisplay);
                randomColorDisplay = colorRGB.get(i);
                randomColorText.setText(Integer.toHexString(randomColorDisplay));
                //Log.i("Random Color Display", Integer.toHexString(randomColorDisplay));
                randomColorText.setText(Integer.toHexString(colorRGB.get(i)));
                System.out.println("Answer Color: " + (Integer.toHexString(colorRGB.get(i))));

            }
//            else {

//                colorRGB.add(rgbColors.get(new Random().nextInt(rgbColors.size())));
//
//                System.out.println("Other Color: " + (Integer.toHexString(colorRGB.get(i))));
//
//                if (colorRGB.get(i) == randomColorDisplay) {
//                    colorRGB.add(rgbColors.get(new Random().nextInt(rgbColors.size())));
//                }
//
//            }
        }

        //backgroundColor = 0xffffff00;
        //foregroundColor = 0xffffffff;

       // System.out.println("Background Color: " + backgroundColor);
        //System.out.println("Foreground Color: " + foregroundColor);

        Log.i("Correct Answer: ", randomColorText.toString());


        if(Integer.toHexString(randomColorDisplay).equals("ff000000")){
            randomColorText.setText("Black");
        }else if(Integer.toHexString(randomColorDisplay).equals("ff0000ff")){
            randomColorText.setText("Blue");
        }else if(Integer.toHexString(randomColorDisplay).equals("ff888888")){
            randomColorText.setText("Grey");
        }else if(Integer.toHexString(randomColorDisplay).equals("ff00ff00")){
            randomColorText.setText("Green");
        }else if(Integer.toHexString(randomColorDisplay).equals("ffff0000")){
            randomColorText.setText("Red");
        }else if(Integer.toHexString(randomColorDisplay).equals("ffffffff")){
            randomColorText.setText("White");
        }else if(Integer.toHexString(randomColorDisplay).equals("ffffff00")){
            randomColorText.setText("Yellow");
        }

      // if(backgroundColor == foregroundColor){
         //  randomColorText.setTextColor(0xffffff00);
       //    randomColorText.setBackgroundColor(0xff000000);
       //}

       //if(backgroundColor == -256 && foregroundColor == -1){
         //  randomColorText.setTextColor(0xffffff00);
          // randomColorText.setBackgroundColor(0xff000000);
       //}

        //randomColorDisplay = rgbColors.get(new Random().nextInt(rgbColors.size()));

        //randomColorText.setText(Integer.toHexString(randomColorDisplay));

        //Log.i("Random Color Display", Integer.toHexString(randomColorDisplay));

        // buttonOne.setBackgroundColor(colorRGB.get(0));
        // buttonTwo.setBackgroundColor(colorRGB.get(1));
        //buttonThree.setBackgroundColor(colorRGB.get(2));
        //buttonFour.setBackgroundColor(colorRGB.get(3));

//        System.out.println(((ColorDrawable) buttonOne.getBackground()).getColor());
//        System.out.println(((ColorDrawable) buttonTwo.getBackground()).getColor());
//        System.out.println(((ColorDrawable) buttonThree.getBackground()).getColor());
//        System.out.println(((ColorDrawable) buttonFour.getBackground()).getColor());
    }


    public void chosenAnswer(View view) {

        //Log.i("Tag", (String) view.getTag());
        //randomColor = colorStrings.get(new Random().nextInt(colorStrings.size()));
        //System.out.println(randomColor);

        if (view.getTag().toString().equals(Integer.toString(answerLocation))) {

            Log.i("Random Color Chosen", "Correct!");

            score++;

            scoreTracker++;

        } else {

            Log.i("Random Color Chosen", "Incorrect");

            score = 0;

            scoreTracker = 0;

        }

        generateNewColor();

        scoreText.setText(Integer.toString(score));

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);

        buttonOne = (Button) findViewById(R.id.button1);
        buttonTwo = (Button) findViewById(R.id.button2);
        buttonThree = (Button) findViewById(R.id.button3);
        buttonFour = (Button) findViewById(R.id.button4);

        //timerText = (TextView) findViewById(R.id.timeText);

        randomColorText = (TextView) findViewById(R.id.colorText);

        scoreText = (TextView) findViewById(R.id.scoreText);

        rgbColors.add(0xff000000);
        rgbColors.add(0xff0000ff);
        rgbColors.add(0xff888888);
        rgbColors.add(0xff00ff00);
        rgbColors.add(0xffff0000);
        rgbColors.add(0xffffffff);
        rgbColors.add(0xffffff00);

        rgbColorsRandom.add(0xff000000);
        rgbColorsRandom.add(0xff0000ff);
        rgbColorsRandom.add(0xff888888);
        rgbColorsRandom.add(0xff00ff00);
        rgbColorsRandom.add(0xffff0000);
        rgbColorsRandom.add(0xffffffff);
        rgbColorsRandom.add(0xffffff00);

        colorStrings.add("#000000");
        colorStrings.add("#0000ff");
        colorStrings.add("#ffff00");
        colorStrings.add("#888888");
        colorStrings.add("#ff0000");
        colorStrings.add("#ffffff");
        colorStrings.add("#00ff00");

        correctColor.put(0, "Blue");
        correctColor.put(1, "Black");
        correctColor.put(2, "White");
        correctColor.put(3, "Yellow");
        correctColor.put(4, "Red");
        correctColor.put(5, "Grey");
        correctColor.put(6, "Green");

        generateNewColor();


/*            new CountDownTimer(3100, 1000) {

                @Override
                public void onTick(long millisUntilFinished) {

                        timerText.setText(String.valueOf(millisUntilFinished / 1000));

                        if (scoreTracker == 0) {

                        }

                }

                @Override
                public void onFinish() {

                    timerText.setText("Game Over!");

                }
            }.start();

            */


    }
}
