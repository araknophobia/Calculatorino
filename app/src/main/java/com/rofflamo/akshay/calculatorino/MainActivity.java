package com.rofflamo.akshay.calculatorino;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.String;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    String lastop = null;
    CharSequence zero="0";
    Double result = Double.valueOf(0);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView tv = (TextView)findViewById(R.id.textView);



        final Button button0 = (Button)findViewById(R.id.button0);
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(lastop=="=") {
                    tv.setText("0");
                    result=Double.valueOf(0);
                    lastop = null;
                }
                if(tv.getText()=="0")
                    tv.setText("");

                tv.append("0");
            }
        });

        final Button button1 = (Button)findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(lastop=="=") {
                    tv.setText("0");
                    result=Double.valueOf(0);
                    lastop = null;setText("0");
                    result=Double.valueOf(0);
                    lastop = null;
                }
                if(Integer.valueOf(tv.toString())==0)
                    tv.setText("");

                tv.append("1");
            }
        });

        final Button button2 = (Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(lastop=="=") {
                    tv.setText("0");
                    result=Double.valueOf(0);
                    lastop = null;
                }
                if(tv.getText()=="0")
                    tv.setText("");

                tv.append("2");
            }
        });

        final Button button3 = (Button)findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(lastop=="=") {
                    tv.setText("0");
                    result=Double.valueOf(0);
                    lastop = null;
                }
                if(tv.getText()=="0")
                    tv.setText("");

                tv.append("3");
            }
        });

        final Button button4 = (Button)findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(lastop=="=") {
                    tv.setText("0");
                    result=Double.valueOf(0);
                    lastop = null;
                }
                if(tv.getText()=="0")
                    tv.setText("");

                tv.append("4");
            }
        });

        final Button button5 = (Button)findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(lastop=="=") {
                    tv.setText("0");
                    result=Double.valueOf(0);
                    lastop = null;
                }
                if(tv.getText()=="0")
                    tv.setText("");

                tv.append("5");
            }
        });

        final Button button6 = (Button)findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(lastop=="=") {
                    tv.setText("0");
                    result=Double.valueOf(0);
                    lastop = null;
                }
                if(tv.getText()=="0")
                    tv.setText("");

                tv.append("6");
            }
        });

        final Button button7 = (Button)findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(lastop=="=") {
                    tv.setText("0");
                    result=Double.valueOf(0);
                    lastop = null;
                }
                if(tv.getText()=="0")
                    tv.setText("");

                tv.append("7");
            }
        });

        final Button button8 = (Button)findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(lastop=="=") {
                    tv.setText("0");
                    result=Double.valueOf(0);
                    lastop = null;
                }
                if(tv.getText()=="0")
                    tv.setText("");

                tv.append("8");
            }
        });

        final Button button9 = (Button)findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(lastop=="=") {
                    tv.setText("0");
                    result=Double.valueOf(0);
                    lastop = null;
                }
                if(tv.getText()=="0")
                    tv.setText("");

                tv.append("9");
            }
        });

        final Button buttonclr = (Button)findViewById(R.id.buttonclr);
        buttonclr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText(zero);
                result=Double.valueOf(0);
                lastop=null;
            }
        });

        final Button buttonplus = (Button)findViewById(R.id.buttonplus);
        buttonplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tv.getText()!="0") {
                    if (lastop == null || lastop == "+") {
                        result = result + Double.parseDouble(tv.getText().toString());
                        lastop = "+";
                    } else if (lastop == "-") {
                        result = result - Double.parseDouble(tv.getText().toString());
                        lastop = "+";
                    } else if (lastop == "*") {
                        result = result * Double.parseDouble(tv.getText().toString());
                        lastop = "+";
                    } else if (lastop == "/") {
                        if (Double.parseDouble(tv.getText().toString()) == 0) {
                            Toast t1 = Toast.makeText(getApplicationContext(), "Cannot divide by zero!", Toast.LENGTH_SHORT);
                        } else {
                            result = result / Double.parseDouble(tv.getText().toString());
                            lastop = "+";
                        }

                    } else{
                        tv.setText("");
                        lastop="+";
                    }
                }
                tv.setText("0");

            }
        });

        final Button buttonminus = (Button)findViewById(R.id.buttonminus);
        buttonminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tv.getText()!=zero) {
                    Toast t2 = Toast.makeText(getApplicationContext(), "Minus", Toast.LENGTH_SHORT);
                    t2.show();
                    if (lastop == null || lastop == "+") {
                        result = result + Double.parseDouble(tv.getText().toString());
                        lastop = "-";
                    } else if (lastop == "-") {
                        result = result - Double.parseDouble(tv.getText().toString());
                        lastop = "-";
                    } else if (lastop == "*") {
                        result = result * Double.parseDouble(tv.getText().toString());
                        lastop = "-";
                    } else if (lastop == "/") {
                        if (Double.parseDouble(tv.getText().toString()) == 0) {
                            Toast t1 = Toast.makeText(getApplicationContext(), "Cannot divide by zero!", Toast.LENGTH_SHORT);
                        } else {
                            result = result / Double.parseDouble(tv.getText().toString());
                            lastop = "-";
                        }

                    } else{
                        tv.setText("");
                        lastop="-";
                    }
                }
                tv.setText("0");

            }
        });

        final Button buttonmul = (Button)findViewById(R.id.buttonmul);
        buttonmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tv.getText()!="0") {
                    if (lastop == null || lastop == "+") {
                        result = result + Double.parseDouble(tv.getText().toString());
                        lastop = "*";
                    } else if (lastop == "-") {
                        result = result - Double.parseDouble(tv.getText().toString());
                        lastop = "*";
                    } else if (lastop == "*") {
                        result = result * Double.parseDouble(tv.getText().toString());
                        lastop = "*";
                    } else if (lastop == "/") {
                        if (Double.parseDouble(tv.getText().toString()) == 0) {
                            Toast t1 = Toast.makeText(getApplicationContext(), "Cannot divide by zero!", Toast.LENGTH_SHORT);
                        } else {
                            result = result / Double.parseDouble(tv.getText().toString());
                            lastop = "*";
                        }

                    } else{
                        tv.setText("");
                        lastop="*";
                    }
                }
                tv.setText("0");

            }
        });

        final Button buttondiv = (Button)findViewById(R.id.buttondiv);
        buttondiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tv.getText()!="0") {
                    if (lastop == null || lastop == "+") {
                        result = result + Double.parseDouble(tv.getText().toString());
                        lastop = "/";
                    } else if (lastop == "-") {
                        result = result - Double.parseDouble(tv.getText().toString());
                        lastop = "/";
                    } else if (lastop == "*") {
                        result = result * Double.parseDouble(tv.getText().toString());
                        lastop = "/";
                    } else if (lastop == "/") {
                        if (Double.parseDouble(tv.getText().toString()) == 0) {
                            Toast t1 = Toast.makeText(getApplicationContext(), "Cannot divide by zero!", Toast.LENGTH_SHORT);
                        } else {
                            result = result / Double.parseDouble(tv.getText().toString());
                            lastop = "/";
                        }

                    } else{
                        tv.setText("");
                        lastop="/";
                    }
                }
                tv.setText("0");

            }
        });

        final Button buttondec = (Button)findViewById(R.id.buttondec);
        buttondec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                if(lastop=="=") {
                    tv.setText("0");
                    result=Double.valueOf(0);
                    lastop = null;
                }
                String s = new String(tv.getText().toString());
                CharSequence c = ".";
                if(!s.contains(c)){
                    tv.append(".");
                }
            }
        });

        final Button buttoneq = (Button)findViewById(R.id.buttoneq);
        buttoneq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tv.getText()!="") {
                    if (lastop == null || lastop == "+") {
                        result = result + Double.parseDouble(tv.getText().toString());
                        lastop = "=";
                    } else if (lastop == "-") {
                        result = result - Double.parseDouble(tv.getText().toString());
                        lastop = "=";
                    } else if (lastop == "*") {
                        result = result * Double.parseDouble(tv.getText().toString());
                        lastop = "=";
                    } else if (lastop == "/") {
                        if (Double.parseDouble(tv.getText().toString()) == 0) {
                            Toast t1 = Toast.makeText(getApplicationContext(), "Cannot divide by zero!", Toast.LENGTH_SHORT);
                            t1.show();
                        } else {
                            result = result / Double.parseDouble(tv.getText().toString());
                            lastop = "=";
                        }

                    }
                }
                tv.setText(result.toString());
            }
        });

    }
}
