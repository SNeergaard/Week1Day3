package com.example.calculator1;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6,
            btn7, btn8, btn9, btnAdd, btnSub, btnDiv,
            btnMult, btnDec, btnClr, btnEqu, btnpi, btne;
    TextView screen;

    float mValueOne, mValueTwo;

    boolean Add, Sub, Multi, Div;

    String screenString;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0 = (Button)findViewById(R.id.btn0);
        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3);
        btn4 = (Button)findViewById(R.id.btn4);
        btn5 = (Button)findViewById(R.id.btn5);
        btn6 = (Button)findViewById(R.id.btn6);
        btn7 = (Button)findViewById(R.id.btn7);
        btn8 = (Button)findViewById(R.id.btn8);
        btn9 = (Button)findViewById(R.id.btn9);
        btnDec = (Button)findViewById(R.id.btnDec);
        btnAdd = (Button)findViewById(R.id.btnAdd);
        btnSub = (Button)findViewById(R.id.btnSub);
        btnDiv = (Button)findViewById(R.id.btnDiv);
        btnMult = (Button)findViewById(R.id.btnMult);
        btnClr = (Button)findViewById(R.id.btnClr);
        btnEqu = (Button) findViewById(R.id.btnEqu);
        btne = (Button) findViewById(R.id.btne);
        btnpi = (Button) findViewById(R.id.btnpi);
        screen = (TextView) findViewById(R.id.screen);
        screenString="";

        int orientation = getResources().getConfiguration().orientation;
        if(orientation == Configuration.ORIENTATION_LANDSCAPE){
            btnpi.setVisibility(View.VISIBLE);
            btne.setVisibility(View.VISIBLE);
        }
        else{
            btnpi.setVisibility(View.GONE);
            btne.setVisibility(View.GONE);
        }

        btn1.setOnClickListener(myListener);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { ;
                screen.setText(screen.getText() + "1");
            }
        });

        btn2.setOnClickListener(myListener);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen.setText(screen.getText() + "2");
            }
        });

        btn3.setOnClickListener(myListener);

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen.setText(screen.getText() + "3");
            }
        });

        btn4.setOnClickListener(myListener);

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen.setText(screen.getText() + "4");
            }
        });

        btn5.setOnClickListener(myListener);

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen.setText(screen.getText() + "5");
            }
        });

        btn6.setOnClickListener(myListener);

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen.setText(screen.getText() + "6");
            }
        });

        btn7.setOnClickListener(myListener);

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen.setText(screen.getText() + "7");
            }
        });

        btn8.setOnClickListener(myListener);

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen.setText(screen.getText() + "8");
            }
        });

        btn9.setOnClickListener(myListener);

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen.setText(screen.getText() + "9");
            }
        });

        btn0.setOnClickListener(myListener);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen.setText(screen.getText() + "0");
            }
        });

        btne.setOnClickListener(myListener);

        btne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen.setText(screen.getText() + "2.718");
            }
        });

        btnpi.setOnClickListener(myListener);

        btnpi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen.setText(screen.getText() + "3.141");
            }
        });

        btnAdd.setOnClickListener(myListener);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (screen == null) {
                    screen.setText("");
                } else {
                    mValueOne = Float.parseFloat(screen.getText() + "");
                    Add = true;
                    screen.setText(null);
                }
            }
        });

        btnSub.setOnClickListener(myListener);

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(screen.getText() + "");
                Sub = true;
                screen.setText(null);
            }
        });

        btnMult.setOnClickListener(myListener);

        btnMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(screen.getText() + "");
                Multi = true;
                screen.setText(null);
            }
        });

        btnDiv.setOnClickListener(myListener);

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    mValueOne = Float.parseFloat(screen.getText() + "");
                    Div = true;
                    screen.setText(null);
            }
        });

        btnEqu.setOnClickListener(myListener);

        btnEqu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                mValueTwo = Float.parseFloat(screen.getText().toString());

                    if (Add) {
                        screen.setText(mValueOne + mValueTwo + "");
                        Add = false;
                    }

                    if (Sub) {
                        screen.setText(mValueOne - mValueTwo + "");
                        Sub = false;
                    }

                    if (Multi) {
                        screen.setText(mValueOne * mValueTwo + "");
                        Multi = false;
                    }

                    if (Div) {
                        screen.setText(mValueOne / mValueTwo + "");
                        Div = false;
                        if(mValueTwo == 0){
                            screen.setText(0);
                        }
                    }

                } catch (Exception e) {
                    screen.setText("0");
                }
            }
        });

        btnClr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen.setText("");
            }
        });

        btnDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen.setText(screen.getText() + ".");
            }
        });

    }


    private View.OnClickListener myListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (screen.getText().toString().equals("Infinity")) {
                screen.setText("");

            }
        }
    };
}
