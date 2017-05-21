package com.example.what.firstcalctutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {




    public void operatorEvaluation () {

        if (addition){
            workingValue = valueA + valueB;
            valueA = workingValue;
            addition = false;
        }

        if (subtraction){
            workingValue = valueA - valueB;
            valueA = workingValue;
            subtraction = false;
        }

        if (multiplication){
            workingValue = valueA * valueB;
            valueA = workingValue;
            multiplication = false;
        }

        if (division){
            workingValue = valueA / valueB;
            valueA = workingValue;
            division = false;
        }




    }




    public enum OperatorEnum{
        add, subtract, divide, multiply
    }
    OperatorEnum operator;
    double valueA = 888;
    double valueB = 888;

    double workingValue;

    boolean addition = false;
    boolean subtraction = false;
    boolean multiplication = false;
    boolean division = false;

    TextView displayView;

    Button fiveButton;

    Button addButton;

    Button fourButton;

    Button clearButton;

    Button oneButton;
    Button twoButton;
    Button threeButton;
    Button sixButton;
    Button sevenButton;
    Button eightButton;
    Button nineButton;
    Button zeroButton;

    Button equalsButton;

    Button divideButton;
    Button multiplyButton;
    Button subtractButton;

//    Button fiveButton = (Button) findViewById(R.id.five);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        displayView = new TextView(this);

        displayView = (TextView) findViewById(R.id.displayView) ;



//         fiveButton = (Button) findViewById(R.id.five);
//
//
//            fiveButton.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view){
//
////                    displayView.setText("5");
//
//
////                    ((TextView)findViewById(R.id.displayView)).setText("5");
////
////                    TextView text=(TextView)findViewById(R.id.displayView);
////                    text.setText("5");
//
//
//                if (Double.isNaN(valueA)){
//                    valueA = 5;
//                    workingValue = valueA;
//                        displayView.setText(Double.toString(workingValue));
//////                    Display.setText(String.valueOf(workingValue));
////
//////                    ((TextView)findViewById(R.id.textview)).setText("5");
////
//////                    TextView text=(TextView)findViewById(R.id.displayView);
//////                    text.setText("5");
////
//                }
////
//                else{
//                    valueB = 5;
//                    displayView.setText(Double.toString(valueB));
////                    Display.setText(String.valueOf(valueB));
//                }
//
//
//                }
//
//            });
//
//
//        fourButton = (Button) findViewById(R.id.four);
//
//        fourButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view){
////                    displayView.setText("5");
////                    ((TextView)findViewById(R.id.displayView)).setText("5");
////
////                    TextView text=(TextView)findViewById(R.id.displayView);
////                    text.setText("5");
//
//                if (Double.isNaN(valueA)){
//                    valueA = 4;
//                    workingValue = valueA;
//                    displayView.setText(Double.toString(workingValue));
//
//////                    Display.setText(String.valueOf(workingValue));
////////                    ((TextView)findViewById(R.id.textview)).setText("5");
////////                    TextView text=(TextView)findViewById(R.id.displayView);
//////                    text.setText("5");
////
//                }
//
//                else{
//                    valueB = 4;
//                    displayView.setText(Double.toString(valueB));
////                    Display.setText(String.valueOf(valueB));
//                }
//
//
//            }
//
//        });



//        oneButton = (Button) findViewById(R.id.one);
//        oneButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view){
//
//                if (Double.isNaN(valueA)){
//                    valueA = 1;
//                    workingValue = valueA;
//                    displayView.setText(Double.toString(workingValue));
//                }
//                else{
//                    valueB = 1;
//                    displayView.setText(Double.toString(valueB));
//                }
//
//                if (addition){
//                    workingValue = valueA + valueB;
//                }
//
//            }
//
//        });


        twoButton = (Button) findViewById(R.id.two);
        twoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){

                if (valueA == 888){
                    valueA = 2;
                    workingValue = valueA;
                    displayView.setText(Double.toString(workingValue));
                }
                else{
                    valueB = 2;
                    displayView.setText(Double.toString(valueB));

                    operatorEvaluation();
                }


            }

        });


        threeButton = (Button) findViewById(R.id.three);
        threeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){

                if (valueA == 888){
                    valueA = 3;
                    workingValue = valueA;
                    displayView.setText(Double.toString(workingValue));
                }
                else{
                    valueB = 3;
                    displayView.setText(Double.toString(valueB));

                    operatorEvaluation();
                }


            }

        });


        fourButton = (Button) findViewById(R.id.four);
        fourButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){

                if (valueA == 888){
                    valueA = 4;
                    workingValue = valueA;
                    displayView.setText(Double.toString(workingValue));
                }
                else{
                    valueB = 4;
                    displayView.setText(Double.toString(valueB));

                    operatorEvaluation();
                }


                          }

        });


        fiveButton = (Button) findViewById(R.id.five);
        fiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){

                if (valueA == 888){
                    valueA = 5;
                    workingValue = valueA;
                    displayView.setText(Double.toString(workingValue));
                }
                else{
                    valueB = 5;
                    displayView.setText(Double.toString(valueB));

                    operatorEvaluation();
                }



            }

        });


        sixButton = (Button) findViewById(R.id.six);
        sixButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){

                if (valueA == 888){
                    valueA = 6;
                    workingValue = valueA;
                    displayView.setText(Double.toString(workingValue));
                }
                else{
                    valueB = 6;
                    displayView.setText(Double.toString(valueB));

                    operatorEvaluation();
                }



            }

        });



        sevenButton = (Button) findViewById(R.id.seven);
        sevenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){

                if (valueA == 888){
                    valueA = 7;
                    workingValue = valueA;
                    displayView.setText(Double.toString(workingValue));
                }
                else{
                    valueB = 7;
                    displayView.setText(Double.toString(valueB));

                    operatorEvaluation();
                }



            }

        });


        eightButton = (Button) findViewById(R.id.eight);
        eightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){

                if (valueA == 888){
                    valueA = 8;
                    workingValue = valueA;
                    displayView.setText(Double.toString(workingValue));
                }
                else{
                    valueB = 8;
                    displayView.setText(Double.toString(valueB));

                    operatorEvaluation();
                }


            }

        });

        nineButton = (Button) findViewById(R.id.nine);
        nineButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){

                if (valueA == 888){
                    valueA = 9;
                    workingValue = valueA;
                    displayView.setText(Double.toString(workingValue));
                }
                else{
                    valueB = 9;
                    displayView.setText(Double.toString(valueB));

                    operatorEvaluation();
                }



            }

        });


        zeroButton = (Button) findViewById(R.id.zero);
        zeroButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){

                if (valueA == 888){
                    valueA = 0;
                    workingValue = valueA;
                    displayView.setText(Double.toString(workingValue));
                }
                else{
                    valueB = 0;
                    displayView.setText(Double.toString(valueB));

                    operatorEvaluation();
                }


            }

        });



        oneButton = (Button) findViewById(R.id.one);
        oneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){

                if (valueA == 888){
                    valueA = 1;
                    workingValue = valueA;
                    displayView.setText(Double.toString(valueA));
                }
                else{
                    valueB = 1;
                    displayView.setText(Double.toString(valueB));

                    operatorEvaluation();
                }


            }

        });


        addButton = (Button) findViewById(R.id.add);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){

                if (valueB == 888){
                    addition = true;
                    displayView.setText(Double.toString(valueA));
//                    Display.setText(String.valueOf(valueA));
                }

                else{
                    addition = true;
//                    workingValue = valueA + valueB;
                    displayView.setText(Double.toString(workingValue));
//                    Display.setText(String.valueOf(workingValue));
//                    valueA = workingValue;
                }
            }

        });


        equalsButton = (Button) findViewById(R.id.equals);
        equalsButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                displayView.setText(Double.toString(workingValue));


            }
        });


        subtractButton = (Button) findViewById(R.id.subtract);
        subtractButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){

                if (valueB == 888){
                    subtraction = true;
                    displayView.setText(Double.toString(valueA));
//                    Display.setText(String.valueOf(valueA));
                }

                else{
                    subtraction = true;
//                    workingValue = valueA - valueB;  //this should be workingValue = valueA(eNum).ValueB or something like that.
                    displayView.setText(Double.toString(workingValue));
//                    Display.setText(String.valueOf(workingValue));
//                    valueA = workingValue;
//                    valueB = Double.NaN;    would this help stop loop?
                }
            }

        });

        divideButton = (Button) findViewById(R.id.divide);
        divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){

                if (valueB == 888){
                    division = true;
                    displayView.setText(Double.toString(valueA));
//                    Display.setText(String.valueOf(valueA));
                }

                else{
                    division = true;
//                    workingValue = valueA / valueB;
                    displayView.setText(Double.toString(workingValue));
//                    Display.setText(String.valueOf(workingValue));
//                    valueA = workingValue;
                }
            }

        });


        multiplyButton = (Button) findViewById(R.id.multiply);
        multiplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){

                if (valueB == 888){
                    multiplication = true;
                    displayView.setText(Double.toString(valueA));
//                    Display.setText(String.valueOf(valueA));
                }

                else{
                    multiplication = true;
//                    workingValue = valueA * valueB;
                    displayView.setText(Double.toString(workingValue));
//                    Display.setText(String.valueOf(workingValue));
//                    valueA = workingValue;
                }
            }

        });

        clearButton = (Button) findViewById(R.id.clear);
        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){

                valueA = 888;
                valueB = 888;
                workingValue = 0;
                displayView.setText(Double.toString(0));
            }

        });











    }
}
