package com.example.problem2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView imgYourMove, imgComputerMove;
    Button btnRock, btnPaper, btnScissor,btnYes;
    String YourChoice = "";
    String ComputerChoice = "";
    String result;
    int max = 5;
    Random r = new Random();
    int ComputerMove, YourScoreCount = 0, ComputerScoreCount = 0, Count = 0;
    TextView tvResult, tvYourScore, tvComputerScore, tvGameOver;
    FloatingActionButton fbRestart;
    boolean restart = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgYourMove = findViewById(R.id.imgYourMove);
        imgComputerMove = findViewById(R.id.imgComputerMove);
        btnRock = findViewById(R.id.btnRock);
        btnPaper = findViewById(R.id.btnPaper);
        btnScissor = findViewById(R.id.btnScissor);
        tvResult = findViewById(R.id.tvResult);
        tvYourScore = findViewById(R.id.tvYourScore);
        tvComputerScore = findViewById(R.id.tvComputerScore);
        tvGameOver = findViewById(R.id.tvGameOver);
        fbRestart = findViewById(R.id.fbRestart);
        btnYes=findViewById(R.id.btnYes);


        btnRock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YourChoice = "Rock";
                imgYourMove.setImageResource(R.drawable.rock);
                if (YourScoreCount < max && ComputerScoreCount < max) {

                    Calculate();
                } else {

                    if (YourScoreCount < ComputerScoreCount) {
                        tvGameOver.setText("Want to Play Again?");
                        btnYes.setVisibility(View.VISIBLE);
                        btnYes.setText("Yes");

                            btnYes.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    Restart();
                                }
                            });

                        tvResult.setText(result + " !!");

                        Toast.makeText(MainActivity.this, "Game Over !! You Lose !!", Toast.LENGTH_SHORT).show();
                    } else {
                        tvGameOver.setText("Want to Play Again?");
                        btnYes.setVisibility(View.VISIBLE);

                        btnYes.setText("Yes");
                        btnYes.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Restart();
                            }
                        });

                        tvResult.setText(result + " !!");

                        Toast.makeText(MainActivity.this, "Game Over !! You Win !!", Toast.LENGTH_SHORT).show();

                    }
                }
            }
        });
        btnPaper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YourChoice = "Paper";
                imgYourMove.setImageResource(R.drawable.paper);
                if (YourScoreCount < max && ComputerScoreCount < max) {

                    Calculate();
                } else {

                    if (YourScoreCount < ComputerScoreCount) {
                        tvGameOver.setText("Want to Play Again?");
                        btnYes.setVisibility(View.VISIBLE);

                        btnYes.setText("Yes");

                        btnYes.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Restart();
                            }
                        });

                        tvResult.setText(result + " !!");

                        Toast.makeText(MainActivity.this, "Game Over !! You Lose !!", Toast.LENGTH_SHORT).show();
                    } else {
                        tvGameOver.setText("Want to Play Again?");
                        btnYes.setVisibility(View.VISIBLE);

                        btnYes.setText("Yes");

                        btnYes.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Restart();
                            }
                        });
                        tvResult.setText(result + " !!");

                        Toast.makeText(MainActivity.this, "Game Over !! You Win !!", Toast.LENGTH_SHORT).show();

                    }
                }
            }
        });
        btnScissor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YourChoice = "Scissor";
                imgYourMove.setImageResource(R.drawable.scissor);
                if (YourScoreCount < max && ComputerScoreCount < max) {

                    Calculate();
                } else {

                    if (YourScoreCount < ComputerScoreCount) {
                        tvGameOver.setText("Want to Play Again?");
                        btnYes.setVisibility(View.VISIBLE);

                        btnYes.setText("Yes");

                        btnYes.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Restart();
                            }
                        });

                        tvResult.setText(result + " !!");

                        Toast.makeText(MainActivity.this, "Game Over !! You Lose !!", Toast.LENGTH_SHORT).show();
                    } else {
                        tvGameOver.setText("Want to Play Again?");
                        btnYes.setVisibility(View.VISIBLE);

                        btnYes.setText("Yes");

                        btnYes.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Restart();
                            }
                        });
                        tvResult.setText(result + " !!");

                        Toast.makeText(MainActivity.this, "Game Over !! You Win !!", Toast.LENGTH_SHORT).show();

                    }
                }
            }
        });



fbRestart.setOnClickListener(new View.OnClickListener()

    {
        @Override
        public void onClick (View v){
Restart();
        }
    });
}

    public void Calculate () {
        Count++;
            ComputerMove = r.nextInt(3);

            if (ComputerMove == 0) {
                ComputerChoice = "Rock";
                imgComputerMove.setImageResource(R.drawable.rock);
            } else if (ComputerMove == 1) {
                ComputerChoice = "Paper";
                imgComputerMove.setImageResource(R.drawable.paper);
            } else if (ComputerMove == 2) {
                ComputerChoice = "Scissor";
                imgComputerMove.setImageResource(R.drawable.scissor);
            }

            if (YourChoice.equals("Rock") && ComputerChoice.equals("Rock")) {
                result = "Draw";
            }
            if (YourChoice.equals("Rock") && ComputerChoice.equals("Paper")) {
                result = "You Lose";
            }
            if (YourChoice.equals("Rock") && ComputerChoice.equals("Scissor")) {
                result = "You Win";
            }
            //Paper
            if (YourChoice.equals("Paper") && ComputerChoice.equals("Rock")) {
                result = "You Win";
            }
            if (YourChoice.equals("Paper") && ComputerChoice.equals("Paper")) {
                result = "Draw";
            }
            if (YourChoice.equals("Paper") && ComputerChoice.equals("Scissor")) {
                result = "You Lose";
            }
            //Scissor
            if (YourChoice.equals("Scissor") && ComputerChoice.equals("Rock")) {
                result = "You Lose";
            }
            if (YourChoice.equals("Scissor") && ComputerChoice.equals("Paper")) {
                result = "You Win";
            }
            if (YourChoice.equals("Scissor") && ComputerChoice.equals("Scissor")) {
                result = "Draw";
            }
            tvGameOver.setText(result+" Round "+Count+" !!!");

            if (!result.equals("Draw")) {
                if (result.equals("You Win")) {


                    YourScoreCount++;
                    tvYourScore.setText("Your Score " + YourScoreCount + "/"+max);


                }
                if (result.equals("You Lose")) {

                    ComputerScoreCount++;
                    tvComputerScore.setText("Computer Score " + ComputerScoreCount + "/"+max);


                }
            } else {
                Toast.makeText(MainActivity.this, "Draw !!", Toast.LENGTH_SHORT).show();
            }




    }
    public void Restart()
    {
        imgYourMove.setImageResource(android.R.color.transparent);
        imgComputerMove.setImageResource(android.R.color.transparent);
        btnYes.setVisibility(View.GONE);
        Toast.makeText(this, "Restarted ", Toast.LENGTH_LONG).show();
        Count=0;
        YourScoreCount=0;
        ComputerScoreCount=0;
        tvResult.setText("");
        tvGameOver.setText("");
tvYourScore.setText("Your Score 0/"+max);
tvComputerScore.setText("Your Score 0/"+max);


    }



}
