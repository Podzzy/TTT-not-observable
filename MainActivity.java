package edu.csi5230.jj.ttt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button buttonStart = null;
    Button button1 = null;
    Button button2 = null;
    Button button3 = null;
    Button button4 = null;
    Button button5 = null;
    Button button6 = null;
    Button button7 = null;
    Button button8 = null;
    Button button9 = null;
    boolean player1 = true;
    TextView textStart = null;
    char[] answers = new char[9];




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ttt);

        buttonStart = (Button) findViewById(R.id.buttonStart);
        button1 = (Button)findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);
        button3 = (Button)findViewById(R.id.button3);
        button4 = (Button)findViewById(R.id.button4);
        button5 = (Button)findViewById(R.id.button5);
        button6 = (Button)findViewById(R.id.button6);
        button7 = (Button)findViewById(R.id.button7);
        button8 = (Button)findViewById(R.id.button8);
        button9 = (Button)findViewById(R.id.button9);
        textStart = (TextView)findViewById(R.id.textStart);




        buttonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start();
            }
        });

    }


    public void start(){

        player1 = true;
        textStart.setText("Player 1's Turn!");


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(player1 && !check(0)){

                    button1.setText("X");
                    player1 = false;
                    textStart.setText("Player 2's Turn!");
                    answers[0]= 'x';

                    if(winCheck())
                        return;

                }
                if(player1== false && !check(0)) {

                    button1.setText("O");
                    player1 = true;
                    textStart.setText("Player 1's Turn!");
                    answers[0] = 'o';

                    if(winCheck())
                        return;


                }
            }

        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(player1 && !check(1)){
                    button2.setText("X");
                    player1 = false;
                    textStart.setText("Player 2's Turn!");
                    answers[1]='x';

                    if(winCheck())
                        return;
                }
                if(!player1 && !check(1)){
                    button2.setText("O");
                    player1 = true;
                    textStart.setText("Player 1's Turn!");
                    answers[1]='o';

                    if(winCheck())
                        return;
                }
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(player1 && !check(2)){
                    button3.setText("X");
                    player1 = false;
                    textStart.setText("Player 2's Turn!");
                    answers[2]='x';

                    if(winCheck())
                        return;
                }
                if(!player1 && !check(2)){
                    button3.setText("O");
                    player1 = true;
                    textStart.setText("Player 1's Turn!");
                    answers[2]='o';

                    if(winCheck())
                        return;
                }
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(player1 && !check(3)){
                    button4.setText("X");
                    player1 = false;
                    textStart.setText("Player 2's Turn!");
                    answers[3]='x';

                    if(winCheck())
                        return;
                }
                if(!player1 && !check(3)){
                    button4.setText("O");
                    player1 = true;
                    textStart.setText("Player 1's Turn!");
                    answers[3]='o';

                    if(winCheck())
                        return;
                }
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(player1 && !check(4)){
                    button5.setText("X");
                    player1 = false;
                    textStart.setText("Player 2's Turn!");
                    answers[4]='x';

                    if(winCheck())
                        return;
                }
                if(!player1 && !check(4)){
                    button5.setText("O");
                    player1 = true;
                    textStart.setText("Player 1's Turn!");
                    answers[4]='o';

                    if(winCheck())
                        return;

                }

            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(player1 && !check(5)){
                    button6.setText("X");
                    player1 = false;
                    textStart.setText("Player 2's Turn!");
                    answers[5]='x';

                    if(winCheck())
                        return;
                }
                if(!player1 && !check(5)){
                    button6.setText("O");
                    player1 = true;
                    textStart.setText("Player 1's Turn!");
                    answers[5]='o';

                    if(winCheck())
                        return;
                }

            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(player1 && !check(6)){
                    button7.setText("X");
                    player1 = false;
                    textStart.setText("Player 2's Turn!");
                    answers[6]='x';

                    if(winCheck())
                        return;
                }
                if(!player1 && !check(6)){
                    button7.setText("O");
                    player1 = true;
                    textStart.setText("Player 1's Turn!");
                    answers[6]='o';

                    if(winCheck())
                        return;
                }

            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(player1 && !check(7)){
                    button8.setText("X");
                    player1 = false;
                    textStart.setText("Player 2's Turn!");
                    answers[7]='x';

                    if(winCheck())
                        return;
                }
                if(!player1 && !check(7)){
                    button8.setText("O");
                    player1 = true;
                    textStart.setText("Player 1's Turn!");
                    answers[7]='o';

                    if(winCheck())
                        return;
                }

            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(player1 && !check(8)){
                    button9.setText("X");
                    player1 = false;
                    textStart.setText("Player 2's Turn!");
                    answers[8]='x';

                    if(winCheck())
                        return;
                }
                if(!player1 && !check(8)){
                    button9.setText("O");
                    player1 = true;
                    textStart.setText("Player 1's Turn!");
                    answers[8]='o';

                    if(winCheck())
                        return;

                }

            }
        });
    }


    public boolean check(int i){
        if(answers[i]!= 0)
            return true;

        return false;
    }

    public boolean winCheck(){
        if(answers[0]=='x' && answers[1]=='x' && answers[2]=='x') {
            textStart.setText("Player 1 Wins!");
            return true;
        }
        if(answers[3]=='x' && answers[4]=='x' && answers[5]=='x') {
            textStart.setText("Player 1 Wins!");
            return true;
        }
        if(answers[6]=='x' && answers[7]=='x' && answers[8]=='x') {
            textStart.setText("Player 1 Wins!");
            return true;
        }
        if(answers[0]=='x' && answers[4]=='x' && answers[8]=='x') {
            textStart.setText("Player 1 Wins!");
            return true;
        }
        if(answers[2]=='x' && answers[4]=='x' && answers[6]=='x') {
            textStart.setText("Player 1 Wins!");
            return true;
        }
        if(answers[0]=='x' && answers[3]=='x' && answers[6]=='x') {
            textStart.setText("Player 1 Wins!");
            return true;
        }
        if(answers[1]=='x' && answers[4]=='x' && answers[7]=='x') {
            textStart.setText("Player 1 Wins!");
            return true;
        }
        if(answers[2]=='x' && answers[5]=='x' && answers[8]=='x') {
            textStart.setText("Player 1 Wins!");
            return true;
        }
        return false;
    }


}
