package com.example.calculatorver2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Vibrator;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv_Input,tv_Output,tv_History;
    Button button_one,button_two,button_three,button_four,button_five,button_six,button_seven,button_eight,button_nine,button_zero;
    Button opDot,opC,opTimes,opMinus,opPlus,opEqual,opDivision,opPercentage,opHistory;
    String string_One,string_Two,string_Final,string_Operator,string_History;
    String string_Check_Percentage;
    double total;
    ImageButton opBackspace;
    Vibrator vibrator;
    String string_Opr_History=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vibrator = (Vibrator) getSystemService(VIBRATOR_SERVICE);
        tv_Input = findViewById(R.id.input);
        tv_Output = findViewById(R.id.output);
        tv_History=findViewById(R.id.histories);
        button_one = findViewById(R.id.numbone);
        button_two = findViewById(R.id.numbtwo);
        button_three = findViewById(R.id.numbthree);
        button_four = findViewById(R.id.numbfour);
        button_five = findViewById(R.id.numbfive);
        button_six = findViewById(R.id.numbsix);
        button_seven = findViewById(R.id.numbseven);
        button_eight = findViewById(R.id.numbeight);
        button_nine = findViewById(R.id.numbnine);
        button_zero = findViewById(R.id.numbzero);
        opDot = findViewById(R.id.opdot);
        opC = findViewById(R.id.opC);
        opTimes = findViewById(R.id.optimes);
        opMinus = findViewById(R.id.opminus);
        opPlus = findViewById(R.id.opplus);
        opEqual = findViewById(R.id.opequal);
        opDivision = findViewById(R.id.division);
        opPercentage = findViewById(R.id.percentage);
        opBackspace = findViewById(R.id.backspace);
        opHistory = findViewById(R.id.history);
        button_one.setOnClickListener(view -> {
            if(string_One!=null && string_Two==null && string_Operator==null){
                tv_Output.setText("");
                string_One=null;
                string_History=null;
                string_Opr_History=null;
            }

            if(string_Opr_History!=null){
                string_History+=string_Opr_History;
                string_Opr_History=null;
            }
            if(!tv_History.getText().toString().isEmpty()){
                tv_History.setText("");
                string_Opr_History=null;
            }

            tv_Input.setText(tv_Input.getText().toString() + "1");
            String test = tv_Input.getText().toString();

            if(tv_Input.getText().toString().charAt(0)=='0' && tv_Input.getText().toString().charAt(1)!='.'){
                test = test.substring(1, test.length());
            }
            if(!test.contains(".")){
                test = test.replaceAll("[,]","");
                StringBuilder stringbuild = new StringBuilder(test);
                int counter=test.length();
                //misalnya length 7, counter =4 1 111 111
                //loop 1
                //i=7-3 = 4
                //1111,111
                //loop 2
                //i=4-3 = 1
                //1,111,111
                for(int i=counter-3;i>0;i-=3){
                    stringbuild.insert(i,',');
                }
                tv_Input.setText(stringbuild);
            }


        });
        button_two.setOnClickListener(view -> {
            if(string_One!=null && string_Two==null && string_Operator==null){
                tv_Output.setText("");
                string_One=null;
                string_History=null;
                string_Opr_History=null;
            }
            if(string_Opr_History!=null){
                string_History+=string_Opr_History;
                string_Opr_History=null;
            }
            if(!tv_History.getText().toString().isEmpty()){
                tv_History.setText("");
                string_Opr_History=null;
            }
            tv_Input.setText(tv_Input.getText().toString() + "2");
            String test = tv_Input.getText().toString();
            if(tv_Input.getText().toString().charAt(0)=='0' && tv_Input.getText().toString().charAt(1)!='.'){
                test = test.substring(1, test.length());
            }
            if(!test.contains(".")) {
                test = test.replaceAll("[,]", "");
                StringBuilder stringbuild = new StringBuilder(test);
                int counter = test.length();
                for (int i = counter - 3; i > 0; i -= 3) {
                    stringbuild.insert(i, ',');
                }
                tv_Input.setText(stringbuild);
            }
        });
        button_three.setOnClickListener(view -> {
            if(string_One!=null && string_Two==null && string_Operator==null){
                tv_Output.setText("");
                string_One=null;
                string_History=null;
                string_Opr_History=null;
            }
            if(string_Opr_History!=null){
                string_History+=string_Opr_History;
                string_Opr_History=null;
            }
            if(!tv_History.getText().toString().isEmpty()){
                tv_History.setText("");
                string_Opr_History=null;
            }
            tv_Input.setText(tv_Input.getText().toString() + "3");
            String test = tv_Input.getText().toString();
            if(tv_Input.getText().toString().charAt(0)=='0' && tv_Input.getText().toString().charAt(1)!='.'){
                test = test.substring(1, test.length());
            }
            if(!test.contains(".")) {
                test = test.replaceAll("[,]", "");
                StringBuilder stringbuild = new StringBuilder(test);
                int counter = test.length();
                for (int i = counter - 3; i > 0; i -= 3) {
                    stringbuild.insert(i, ',');
                }
                tv_Input.setText(stringbuild);
            }
        });
        button_four.setOnClickListener(view -> {
            if(string_One!=null && string_Two==null && string_Operator==null){
                tv_Output.setText("");
                string_One=null;
                string_History=null;
                string_Opr_History=null;
            }
            if(string_Opr_History!=null){
                string_History+=string_Opr_History;
                string_Opr_History=null;
            }
            if(!tv_History.getText().toString().isEmpty()){
                tv_History.setText("");
                string_Opr_History=null;
            }
            tv_Input.setText(tv_Input.getText().toString() + "4");
            String test = tv_Input.getText().toString();
            if(tv_Input.getText().toString().charAt(0)=='0' && tv_Input.getText().toString().charAt(1)!='.'){
                test = test.substring(1, test.length());
            }
            if(!test.contains(".")) {
                test = test.replaceAll("[,]", "");
                StringBuilder stringbuild = new StringBuilder(test);
                int counter = test.length();
                for (int i = counter - 3; i > 0; i -= 3) {
                    stringbuild.insert(i, ',');
                }
                tv_Input.setText(stringbuild);
            }
        });
        button_five.setOnClickListener(view -> {
            if(string_One!=null && string_Two==null && string_Operator==null){
                tv_Output.setText("");
                string_One=null;
                string_History=null;
                string_Opr_History=null;
            }
            if(string_Opr_History!=null){
                string_History+=string_Opr_History;
                string_Opr_History=null;
            }
            if(!tv_History.getText().toString().isEmpty()){
                tv_History.setText("");
                string_Opr_History=null;
            }
            tv_Input.setText(tv_Input.getText().toString() + "5");
            String test = tv_Input.getText().toString();
            if(tv_Input.getText().toString().charAt(0)=='0' && tv_Input.getText().toString().charAt(1)!='.'){
                test = test.substring(1, test.length());
            }
            if(!test.contains(".")) {
                test = test.replaceAll("[,]", "");
                StringBuilder stringbuild = new StringBuilder(test);
                int counter = test.length();
                for (int i = counter - 3; i > 0; i -= 3) {
                    stringbuild.insert(i, ',');
                }
                tv_Input.setText(stringbuild);
            }
        });
        button_six.setOnClickListener(view -> {
            if(string_One!=null && string_Two==null && string_Operator==null){
                tv_Output.setText("");
                string_One=null;
                string_History=null;
                string_Opr_History=null;
            }
            if(string_Opr_History!=null){
                string_History+=string_Opr_History;
                string_Opr_History=null;
            }
            if(!tv_History.getText().toString().isEmpty()){
                tv_History.setText("");
                string_Opr_History=null;
            }
            tv_Input.setText(tv_Input.getText().toString() + "6");
            String test = tv_Input.getText().toString();
            if(tv_Input.getText().toString().charAt(0)=='0' && tv_Input.getText().toString().charAt(1)!='.'){
                test = test.substring(1, test.length());
            }
            if(!test.contains(".")) {
                test = test.replaceAll("[,]", "");
                StringBuilder stringbuild = new StringBuilder(test);
                int counter = test.length();
                for (int i = counter - 3; i > 0; i -= 3) {
                    stringbuild.insert(i, ',');
                }
                tv_Input.setText(stringbuild);
            }
        });
        button_seven.setOnClickListener(view -> {
            if(string_One!=null && string_Two==null && string_Operator==null){
                tv_Output.setText("");
                string_One=null;
                string_History=null;
                string_Opr_History=null;
            }
            if(string_Opr_History!=null){
                string_History+=string_Opr_History;
                string_Opr_History=null;
            }
            if(!tv_History.getText().toString().isEmpty()){
                tv_History.setText("");
                string_Opr_History=null;
            }
            tv_Input.setText(tv_Input.getText().toString() + "7");
            String test = tv_Input.getText().toString();
            if(tv_Input.getText().toString().charAt(0)=='0' && tv_Input.getText().toString().charAt(1)!='.'){
                test = test.substring(1, test.length());
            }
            if(!test.contains(".")) {
                test = test.replaceAll("[,]", "");
                StringBuilder stringbuild = new StringBuilder(test);
                int counter = test.length();
                for (int i = counter - 3; i > 0; i -= 3) {
                    stringbuild.insert(i, ',');
                }
                tv_Input.setText(stringbuild);
            }
        });
        button_eight.setOnClickListener(view -> {
            if(string_One!=null && string_Two==null && string_Operator==null){
                tv_Output.setText("");
                string_One=null;
                string_History=null;
                string_Opr_History=null;
            }
            if(string_Opr_History!=null){
                string_History+=string_Opr_History;
                string_Opr_History=null;
            }
            if(!tv_History.getText().toString().isEmpty()){
                tv_History.setText("");
                string_Opr_History=null;
            }
            tv_Input.setText(tv_Input.getText().toString() + "8");
            String test = tv_Input.getText().toString();
            if(tv_Input.getText().toString().charAt(0)=='0' && tv_Input.getText().toString().charAt(1)!='.'){
                test = test.substring(1, test.length());
            }
            if(!test.contains(".")) {
                test = test.replaceAll("[,]", "");
                StringBuilder stringbuild = new StringBuilder(test);
                int counter = test.length();
                for (int i = counter - 3; i > 0; i -= 3) {
                    stringbuild.insert(i, ',');
                }
                tv_Input.setText(stringbuild);
            }
        });
        button_nine.setOnClickListener(view -> {
            if(string_One!=null && string_Two==null && string_Operator==null){
                tv_Output.setText("");
                string_One=null;
                string_History=null;
                string_Opr_History=null;
            }
            if(string_Opr_History!=null){
                string_History+=string_Opr_History;
                string_Opr_History=null;
            }
            if(!tv_History.getText().toString().isEmpty()){
                tv_History.setText("");
                string_Opr_History=null;
            }
            tv_Input.setText(tv_Input.getText().toString() + "9");
            String test = tv_Input.getText().toString();
            if(tv_Input.getText().toString().charAt(0)=='0' && tv_Input.getText().toString().charAt(1)!='.'){
                test = test.substring(1, test.length());
            }
            if(!test.contains(".")) {
                test = test.replaceAll("[,]", "");
                StringBuilder stringbuild = new StringBuilder(test);
                int counter = test.length();
                for (int i = counter - 3; i > 0; i -= 3) {
                    stringbuild.insert(i, ',');
                }
                tv_Input.setText(stringbuild);
            }
        });
        button_zero.setOnClickListener(view -> {
            if (tv_Input.getText().toString().isEmpty() || tv_Input.getText().toString().equals("0")) {
                tv_Input.setText("0");
            } else if (tv_Input.getText().toString().charAt(0) != '0' || tv_Input.getText().toString().charAt(1)=='.') {
                tv_Input.setText(tv_Input.getText().toString() + "0");
            }
            if (string_One != null && string_Two == null && string_Operator == null) {
                tv_Output.setText("");
                string_One = null;
                string_History = null;
                string_Opr_History = null;
            }
            if (string_Opr_History != null) {
                string_History += string_Opr_History;
                string_Opr_History = null;
            }
            if (!tv_History.getText().toString().isEmpty()) {
                tv_History.setText("");
                string_Opr_History = null;
            }

            String test = tv_Input.getText().toString();
            if(!test.contains(".")) {
            test = test.replaceAll("[,]", "");
            StringBuilder stringbuild = new StringBuilder(test);
            int counter = test.length();
            for (int i = counter - 3; i > 0; i -= 3) {
                stringbuild.insert(i, ',');
            }
            tv_Input.setText(stringbuild);
        }
        });

        opDot.setOnClickListener(view -> {
            String test = tv_Input.getText().toString();
            if(string_One!=null && string_Two==null && string_Operator==null){
                tv_Output.setText("");
                string_One=null; string_History=null;
                string_Opr_History=null;
            }
            if(!tv_History.getText().toString().isEmpty()){
                string_History=null;
                tv_History.setText("");
                string_Opr_History=null;
            }
            if(string_Opr_History!=null){
                string_History+=string_Opr_History;
                string_Opr_History=null;
            }
            if (test.isEmpty()) {
                tv_Input.setText(tv_Input.getText().toString() + "0.");
            } else if (test.contains(".")) {
                tv_Input.getText();
            } else {
                tv_Input.setText(tv_Input.getText().toString() + ".");
            }
        });
        opC.setOnClickListener(view -> {
            tv_Input.setText("");
            string_One = null;
            string_Two = null;
            string_Operator = null;
            string_Final = null;
            total = 0;
            tv_Output.setText("");
            string_History=null;
            tv_History.setText("");
            vibrator.vibrate(100);
//            counter=0;
        });
        opBackspace.setOnClickListener(view -> {
            String test = tv_Input.getText().toString();

            if (!test.equals("")) {
                test = test.substring(0, test.length() - 1);
//                tv_Input.setText(test);
            }
            test = test.replaceAll("[,]","");
            StringBuilder stringbuild = new StringBuilder(test);
            int counter = test.length();
            for (int i = counter - 3; i > 0; i -= 3) {
                stringbuild.insert(i, ',');
            }
            tv_Input.setText(stringbuild);
        });

        opPlus.setOnClickListener(view -> {
            String test = tv_Input.getText().toString();
            // ambil substring
            if(!test.isEmpty()){
                string_History+=test;
            }
            test = test.replaceAll("[,]","");
            if (test.isEmpty()) {
                string_Operator = "+";
                tv_Input.setText("");
            } else {
                // ambil substring
                if (string_One == null && string_Two == null) {
                    string_One = test;
                    string_Operator = "+";
                    tv_Input.setText("");
                    tv_Output.setText("");
                } else if (string_One != null && string_Two == null) {
                    string_Two = test;
                    if (string_Operator == "+") {
                        if(string_One.equals("err")){
                            string_Final ="err";
                            tv_Output.setText(string_Final);
                            string_One="err";
                        }
                        else {
                            total = Double.parseDouble(string_One) + Double.parseDouble(string_Two);
                            if (total % 1 == 0) {
                                long value = (long) total;
                                string_Final = Long.toString(value);


                                StringBuilder stringbuild = new StringBuilder(string_Final);
                                int counter = string_Final.length();
                                for (int i = counter - 3; i > 0; i -= 3) {
                                    stringbuild.insert(i, ',');
                                }
                                tv_Output.setText(stringbuild);
                            } else {
                                string_Final = Double.toString(total);
                                int lengthindex = string_Final.indexOf(".");
                                StringBuilder stringbuild = new StringBuilder(string_Final);
                                for (int i = lengthindex - 3; i > 0; i -= 3) {
                                    stringbuild.insert(i, ',');
                                }
                                tv_Output.setText(stringbuild);
                            }
                            string_One = Double.toString(total);
                        }

                    } else if (string_Operator == "-") {
                        if(string_One.equals("err")){
                            string_Final ="err";
                            tv_Output.setText(string_Final);
                            string_One="err";
                        }
                        else{
                            total = Double.parseDouble(string_One) - Double.parseDouble(string_Two);
                            if (total % 1 == 0) {
                                long value = (long) total;
                                string_Final = Long.toString(value);


                                StringBuilder stringbuild = new StringBuilder(string_Final);
                                int counter = string_Final.length();
                                for (int i = counter - 3; i > 0; i -= 3) {
                                    stringbuild.insert(i, ',');
                                }
                                tv_Output.setText(stringbuild);
                            } else {
                                string_Final = Double.toString(total);
                                int lengthindex = string_Final.indexOf(".");
                                StringBuilder stringbuild = new StringBuilder(string_Final);
                                for (int i = lengthindex - 3; i > 0; i -= 3) {
                                    stringbuild.insert(i, ',');
                                }
                                tv_Output.setText(stringbuild);
                            }
                            string_One = Double.toString(total);
                        }

                    } else if (string_Operator == "x") {
                        if(string_One.equals("err")){
                            string_Final ="err";
                            tv_Output.setText(string_Final);
                            string_One="err";
                        }
                        else{
                            total = Double.parseDouble(string_One) * Double.parseDouble(string_Two);
                            if (total % 1 == 0) {
                                long value = (long) total;
                                string_Final = Long.toString(value);


                                StringBuilder stringbuild = new StringBuilder(string_Final);
                                int counter = string_Final.length();
                                for (int i = counter - 3; i > 0; i -= 3) {
                                    stringbuild.insert(i, ',');
                                }
                                tv_Output.setText(stringbuild);
                            } else {
                                string_Final = Double.toString(total);
                                int lengthindex = string_Final.indexOf(".");
                                StringBuilder stringbuild = new StringBuilder(string_Final);
                                for (int i = lengthindex - 3; i > 0; i -= 3) {
                                    stringbuild.insert(i, ',');
                                }
                                tv_Output.setText(stringbuild);
                            }
                            string_One = Double.toString(total);
                        }
                    } else if (string_Operator == "/") {
                        if(string_One.equals("err")){
                            string_Final ="err";
                            tv_Output.setText(string_Final);
                            string_One="err";
                        }
                        else{
                            if (string_Two.equals("0") || string_Two.equals("0.")) {
                                string_Final = "err";
                                tv_Output.setText(string_Final);
                                string_One="err";
                            } else {
                                total = Double.parseDouble(string_One) / Double.parseDouble(string_Two);
                                if (total % 1 == 0) {
                                    long value = (long) total;
                                    string_Final = Long.toString(value);


                                    StringBuilder stringbuild = new StringBuilder(string_Final);
                                    int counter = string_Final.length();
                                    for (int i = counter - 3; i > 0; i -= 3) {
                                        stringbuild.insert(i, ',');
                                    }
                                    tv_Output.setText(stringbuild);
                                } else {
                                    string_Final = Double.toString(total);
                                    int lengthindex = string_Final.indexOf(".");
                                    StringBuilder stringbuild = new StringBuilder(string_Final);
                                    for (int i = lengthindex - 3; i > 0; i -= 3) {
                                        stringbuild.insert(i, ',');
                                    }
                                    tv_Output.setText(stringbuild);
                                }
                                string_One = Double.toString(total);
                            }
                        }
                    }
                }
                string_Operator = "+";
                string_Two = null;
                string_Final = null;
                tv_Input.setText("");
            }
            string_Opr_History = "+";
        });
        opMinus.setOnClickListener(view -> {
            String test = tv_Input.getText().toString();
            if(!test.isEmpty()){
                string_History+=test;
            }
            test = test.replaceAll("[,]","");
            if (test.isEmpty()) {
                tv_Input.setText("");
                string_Operator = "-";
            } else {
                if (string_One == null && string_Two == null) {
                    string_One = test.substring(0);
                    string_Operator = "-";
                    tv_Input.setText("");
                    tv_Output.setText("");
                } else if (string_One != null && string_Two == null) {
                    string_Two = test.substring(0);
                    if (string_Operator == "+") {
                        if(string_One.equals("err")){
                            string_Final ="err";
                            tv_Output.setText(string_Final);
                            string_One="err";
                        }
                        else{
                            total = Double.parseDouble(string_One) + Double.parseDouble(string_Two);
                            if (total % 1 == 0) {
                                long value = (long) total;
                                string_Final = Long.toString(value);


                                StringBuilder stringbuild = new StringBuilder(string_Final);
                                int counter = string_Final.length();
                                for (int i = counter - 3; i > 0; i -= 3) {
                                    stringbuild.insert(i, ',');
                                }
                                tv_Output.setText(stringbuild);
                            } else {
                                string_Final = Double.toString(total);
                                int lengthindex = string_Final.indexOf(".");
                                StringBuilder stringbuild = new StringBuilder(string_Final);
                                for (int i = lengthindex - 3; i > 0; i -= 3) {
                                    stringbuild.insert(i, ',');
                                }
                                tv_Output.setText(stringbuild);
                            }
                            string_One = Double.toString(total);
                        }
                    } else if (string_Operator == "-") {
                        if(string_One.equals("err")){
                            string_Final ="err";
                            tv_Output.setText(string_Final);
                            string_One="err";
                        }
                        else{
                            total = Double.parseDouble(string_One) - Double.parseDouble(string_Two);
                            if (total % 1 == 0) {
                                long value = (long) total;
                                string_Final = Long.toString(value);


                                StringBuilder stringbuild = new StringBuilder(string_Final);
                                int counter = string_Final.length();
                                for (int i = counter - 3; i > 0; i -= 3) {
                                    stringbuild.insert(i, ',');
                                }
                                tv_Output.setText(stringbuild);
                            } else {
                                string_Final = Double.toString(total);
                                int lengthindex = string_Final.indexOf(".");
                                StringBuilder stringbuild = new StringBuilder(string_Final);
                                for (int i = lengthindex - 3; i > 0; i -= 3) {
                                    stringbuild.insert(i, ',');
                                }
                                tv_Output.setText(stringbuild);
                            }
                            string_One = Double.toString(total);
                        }
                    } else if (string_Operator == "x") {
                        if(string_One.equals("err")){
                            string_Final ="err";
                            tv_Output.setText(string_Final);
                            string_One="err";
                        }
                        else{
                            total = Double.parseDouble(string_One) * Double.parseDouble(string_Two);
                            if (total % 1 == 0) {
                                long value = (long) total;
                                string_Final = Long.toString(value);


                                StringBuilder stringbuild = new StringBuilder(string_Final);
                                int counter = string_Final.length();
                                for (int i = counter - 3; i > 0; i -= 3) {
                                    stringbuild.insert(i, ',');
                                }
                                tv_Output.setText(stringbuild);
                            } else {
                                string_Final = Double.toString(total);
                                int lengthindex = string_Final.indexOf(".");
                                StringBuilder stringbuild = new StringBuilder(string_Final);
                                for (int i = lengthindex - 3; i > 0; i -= 3) {
                                    stringbuild.insert(i, ',');
                                }
                                tv_Output.setText(stringbuild);
                            }
                            string_One = Double.toString(total);
                        }
                    } else if (string_Operator == "/") {
                        if(string_One.equals("err")){
                            string_Final ="err";
                            tv_Output.setText(string_Final);
                            string_One="err";
                        }
                        else{
                            if (string_Two.equals("0")|| string_Two.equals("0.")) {
                                string_Final = "err";
                                tv_Output.setText(string_Final);
                                string_One="err";
                            } else {
                                total = Double.parseDouble(string_One) / Double.parseDouble(string_Two);
                                if (total % 1 == 0) {
                                    long value = (long) total;
                                    string_Final = Long.toString(value);


                                    StringBuilder stringbuild = new StringBuilder(string_Final);
                                    int counter = string_Final.length();
                                    for (int i = counter - 3; i > 0; i -= 3) {
                                        stringbuild.insert(i, ',');
                                    }
                                    tv_Output.setText(stringbuild);
                                } else {
                                    string_Final = Double.toString(total);
                                    int lengthindex = string_Final.indexOf(".");
                                    StringBuilder stringbuild = new StringBuilder(string_Final);
                                    for (int i = lengthindex - 3; i > 0; i -= 3) {
                                        stringbuild.insert(i, ',');
                                    }
                                    tv_Output.setText(stringbuild);
                                }
                                string_One = Double.toString(total);
                            }
                        }
                    }
                    string_Operator = "-";
                    string_Two = null;
                    string_Final = null;
                    tv_Input.setText("");
                }

            }
            string_Opr_History="-";
        });
        opTimes.setOnClickListener(view -> {
            String test = tv_Input.getText().toString();
            if(!test.isEmpty()){
                string_History+=test;
            }
            test = test.replaceAll("[,]","");
            if (test.isEmpty()) {
                tv_Input.setText("");
                string_Operator = "x";
            } else {
                if (string_One == null && string_Two == null) {
                    string_One = test.substring(0);
                    string_Operator = "x";
                    tv_Input.setText("");
                    tv_Output.setText("");
                } else if (string_One != null && string_Two == null) {
                    string_Two = test.substring(0);
                    if (string_Operator == "+") {
                        if(string_One.equals("err")){
                            string_Final ="err";
                            tv_Output.setText(string_Final);
                            string_One="err";
                        }
                        else{
                            total = Double.parseDouble(string_One) + Double.parseDouble(string_Two);
                            if (total % 1 == 0) {
                                long value = (long) total;
                                string_Final = Long.toString(value);


                                StringBuilder stringbuild = new StringBuilder(string_Final);
                                int counter = string_Final.length();
                                for (int i = counter - 3; i > 0; i -= 3) {
                                    stringbuild.insert(i, ',');
                                }
                                tv_Output.setText(stringbuild);
                            } else {
                                string_Final = Double.toString(total);
                                int lengthindex = string_Final.indexOf(".");
                                StringBuilder stringbuild = new StringBuilder(string_Final);
                                for (int i = lengthindex - 3; i > 0; i -= 3) {
                                    stringbuild.insert(i, ',');
                                }
                                tv_Output.setText(stringbuild);
                            }
                            string_One = Double.toString(total);
                        }
                    } else if (string_Operator == "-") {
                        if(string_One.equals("err")){
                            string_Final ="err";
                            tv_Output.setText(string_Final);
                            string_One="err";
                        }
                        else{
                            total = Double.parseDouble(string_One) - Double.parseDouble(string_Two);
                            if (total % 1 == 0) {
                                long value = (long) total;
                                string_Final = Long.toString(value);


                                StringBuilder stringbuild = new StringBuilder(string_Final);
                                int counter = string_Final.length();
                                for (int i = counter - 3; i > 0; i -= 3) {
                                    stringbuild.insert(i, ',');
                                }
                                tv_Output.setText(stringbuild);
                            } else {
                                string_Final = Double.toString(total);
                                int lengthindex = string_Final.indexOf(".");
                                StringBuilder stringbuild = new StringBuilder(string_Final);
                                for (int i = lengthindex - 3; i > 0; i -= 3) {
                                    stringbuild.insert(i, ',');
                                }
                                tv_Output.setText(stringbuild);
                            }
                            string_One = Double.toString(total);
                        }

                    } else if (string_Operator == "x") {
                        if(string_One.equals("err")){
                            string_Final ="err";
                            tv_Output.setText(string_Final);
                            string_One="err";
                        }
                        else{
                            total = Double.parseDouble(string_One) * Double.parseDouble(string_Two);
                            if (total % 1 == 0) {
                                long value = (long) total;
                                string_Final = Long.toString(value);


                                StringBuilder stringbuild = new StringBuilder(string_Final);
                                int counter = string_Final.length();
                                for (int i = counter - 3; i > 0; i -= 3) {
                                    stringbuild.insert(i, ',');
                                }
                                tv_Output.setText(stringbuild);
                            } else {
                                string_Final = Double.toString(total);
                                int lengthindex = string_Final.indexOf(".");
                                StringBuilder stringbuild = new StringBuilder(string_Final);
                                for (int i = lengthindex - 3; i > 0; i -= 3) {
                                    stringbuild.insert(i, ',');
                                }
                                tv_Output.setText(stringbuild);
                            }
                            string_One = Double.toString(total);
                        }
                    } else if (string_Operator == "/") {
                        if(string_One.equals("err")){
                            string_Final ="err";
                            tv_Output.setText(string_Final);
                            string_One="err";
                        }
                        else{
                            if (string_Two.equals("0") || string_Two.equals("0.")) {
                                string_Final = "err";
                                tv_Output.setText(string_Final);
                                string_One="err";
                            } else {
                                total = Double.parseDouble(string_One) / Double.parseDouble(string_Two);
                                if (total % 1 == 0) {
                                    long value = (long) total;
                                    string_Final = Long.toString(value);


                                    StringBuilder stringbuild = new StringBuilder(string_Final);
                                    int counter = string_Final.length();
                                    for (int i = counter - 3; i > 0; i -= 3) {
                                        stringbuild.insert(i, ',');
                                    }
                                    tv_Output.setText(stringbuild);
                                } else {
                                    string_Final = Double.toString(total);
                                    int lengthindex = string_Final.indexOf(".");
                                    StringBuilder stringbuild = new StringBuilder(string_Final);
                                    for (int i = lengthindex - 3; i > 0; i -= 3) {
                                        stringbuild.insert(i, ',');
                                    }
                                    tv_Output.setText(stringbuild);
                                }
                                string_One = Double.toString(total);
                            }
                        }
                    }
                    string_Operator = "x";
                    string_Two = null;
                    string_Final = null;
                    tv_Input.setText("");
                }
            }
            string_Opr_History = "x";


        });
        opDivision.setOnClickListener(view -> {
            String test = tv_Input.getText().toString();
            if(!test.isEmpty()){
                string_History+=test;
            }
            test = test.replaceAll("[,]","");
//            test = test.replaceAll("[,]",".");
            if (test.isEmpty()) {
                tv_Input.setText("");
                string_Operator = "/";
            } else {
                if (string_One == null && string_Two == null) {
                    string_One = test;
                    string_Operator = "/";
                    tv_Input.setText("");
                    tv_Output.setText("");
                } else if (string_One != null && string_Two == null) {
                    string_Two = test;
//                    string_Opr_History="÷";
                    if (string_Operator == "+") {
                        if(string_One.equals("err")){
                            string_Final ="err";
                            tv_Output.setText(string_Final);
                            string_One="err";
                        }
                        else{
                            total = Double.parseDouble(string_One) + Double.parseDouble(string_Two);
                            if (total % 1 == 0) {
                                long value = (long) total;
                                string_Final = Long.toString(value);


                                StringBuilder stringbuild = new StringBuilder(string_Final);
                                int counter = string_Final.length();
                                for (int i = counter - 3; i > 0; i -= 3) {
                                    stringbuild.insert(i, ',');
                                }
                                tv_Output.setText(stringbuild);
                            } else {
                                string_Final = Double.toString(total);
                                int lengthindex = string_Final.indexOf(".");
                                StringBuilder stringbuild = new StringBuilder(string_Final);
                                for (int i = lengthindex - 3; i > 0; i -= 3) {
                                    stringbuild.insert(i, ',');
                                }
                                tv_Output.setText(stringbuild);
                            }
                            string_One = Double.toString(total);
                        }
                    } else if (string_Operator == "-") {
                        if(string_One.equals("err")){
                            string_Final ="err";
                            tv_Output.setText(string_Final);
                            string_One="err";
                        }
                        else{
                            total = Double.parseDouble(string_One) - Double.parseDouble(string_Two);
                            if (total % 1 == 0) {
                                long value = (long) total;
                                string_Final = Long.toString(value);


                                StringBuilder stringbuild = new StringBuilder(string_Final);
                                int counter = string_Final.length();
                                for (int i = counter - 3; i > 0; i -= 3) {
                                    stringbuild.insert(i, ',');
                                }
                                tv_Output.setText(stringbuild);
                            } else {
                                string_Final = Double.toString(total);
                                int lengthindex = string_Final.indexOf(".");
                                StringBuilder stringbuild = new StringBuilder(string_Final);
                                for (int i = lengthindex - 3; i > 0; i -= 3) {
                                    stringbuild.insert(i, ',');
                                }
                                tv_Output.setText(stringbuild);
                            }
                            string_One = Double.toString(total);
                        }
                    } else if (string_Operator == "x") {
                        if(string_One.equals("err")){
                            string_Final ="err";
                            tv_Output.setText(string_Final);
                            string_One="err";
                        }
                        else{
                            total = Double.parseDouble(string_One) * Double.parseDouble(string_Two);
                            if (total % 1 == 0) {
                                long value = (long) total;
                                string_Final = Long.toString(value);


                                StringBuilder stringbuild = new StringBuilder(string_Final);
                                int counter = string_Final.length();
                                for (int i = counter - 3; i > 0; i -= 3) {
                                    stringbuild.insert(i, ',');
                                }
                                tv_Output.setText(stringbuild);
                            } else {
                                string_Final = Double.toString(total);
                                int lengthindex = string_Final.indexOf(".");
                                StringBuilder stringbuild = new StringBuilder(string_Final);
                                for (int i = lengthindex - 3; i > 0; i -= 3) {
                                    stringbuild.insert(i, ',');
                                }
                                tv_Output.setText(stringbuild);
                            }
                            string_One = Double.toString(total);
                        }

                    } else if (string_Operator == "/") {
                        if(string_One.equals("err")){
                            string_Final ="err";
                            tv_Output.setText(string_Final);
                            string_One="err";
                        }
                        else{
                            if (string_Two.equals("0")|| string_Two.equals("0.")) {
                                string_Final = "err";
                                tv_Output.setText(string_Final);
                                string_One="err";
                            } else {
                                total = Double.parseDouble(string_One) / Double.parseDouble(string_Two);
                                if (total % 1 == 0) {
                                    long value = (long) total;
                                    string_Final = Long.toString(value);


                                    StringBuilder stringbuild = new StringBuilder(string_Final);
                                    int counter = string_Final.length();
                                    for (int i = counter - 3; i > 0; i -= 3) {
                                        stringbuild.insert(i, ',');
                                    }
                                    tv_Output.setText(stringbuild);
                                } else {
                                    string_Final = Double.toString(total);
                                    int lengthindex = string_Final.indexOf(".");
                                    StringBuilder stringbuild = new StringBuilder(string_Final);
                                    for (int i = lengthindex - 3; i > 0; i -= 3) {
                                        stringbuild.insert(i, ',');
                                    }
                                    tv_Output.setText(stringbuild);
                                }
                                string_One = Double.toString(total);
                            }
                        }
                    }
                    string_Two = null;
                    string_Final = null;
                    tv_Input.setText("");
                }
                string_Operator = "/";

            }
            string_Opr_History = "÷";
        });
        opPercentage.setOnClickListener(view -> {
            String test = tv_Input.getText().toString();
            if (test.isEmpty()) {
                tv_Input.setText("");
                tv_Output.setText("");
            } else if(string_Check_Percentage==test){
                //check apa yang di persen sama dengan test agar tidak bisa melakukan persen 2 kali
                tv_Input.getText();
            }else{
                string_Check_Percentage = test.substring(0);
                string_Check_Percentage = string_Check_Percentage.replaceAll("[,]","");
                double total = (Double.parseDouble(string_Check_Percentage)) / 100;
                if (total % 1 == 0) {
                    long value = (long) total;
                    string_Check_Percentage = Long.toString(value);

                    StringBuilder stringbuild = new StringBuilder(string_Check_Percentage);
                    int counter = string_Check_Percentage.length();
                    for (int i = counter - 3; i > 0; i -= 3) {
                        stringbuild.insert(i, ',');}
                    tv_Input.setText(stringbuild);
                }else {
                    string_Check_Percentage = Double.toString(total);
                    int lengthindex = string_Check_Percentage.indexOf(".");
                    StringBuilder stringbuild = new StringBuilder(string_Check_Percentage);
                    for (int i = lengthindex - 3; i > 0; i -= 3) {
                        stringbuild.insert(i, ',');
                    }
                    tv_Input.setText(stringbuild);
                }
            }
        });

        opEqual.setOnClickListener(view -> {
            vibrator.vibrate(100);
            String test = tv_Input.getText().toString();
            if(!test.isEmpty()){
                string_History+=test;
            }
            test = test.replaceAll("[,]","");
//            test = test.replaceAll("[,]",".");
            if (test.isEmpty()) {
            } else if (string_One==null && string_Operator!=null) {
                string_Two = test.substring(0);
                tv_Input.setText("");
                tv_Output.setText(string_Two);
                string_One=string_Two;
            } else {
                string_Two = test.substring(0);

                if (string_Operator == "+") {
                    if(string_One.equals("err")){
                    string_Final ="err";
                        tv_Output.setText(string_Final);
                    }else{
                        total = Double.parseDouble(string_One) + Double.parseDouble(string_Two);

                        if (total % 1 == 0) {
                            long value = (long) total;
                            string_Final = Long.toString(value);


                            StringBuilder stringbuild = new StringBuilder(string_Final);
                            int counter = string_Final.length();
                            for (int i = counter - 3; i > 0; i -= 3) {
                                stringbuild.insert(i, ',');
                            }
                            tv_Output.setText(stringbuild);
                        } else {
                            string_Final = Double.toString(total);
                            int lengthindex = string_Final.indexOf(".");
                            StringBuilder stringbuild = new StringBuilder(string_Final);
                            for (int i = lengthindex - 3; i > 0; i -= 3) {
                                stringbuild.insert(i, ',');
                            }
                            tv_Output.setText(stringbuild);
                        }
                    }
                    tv_Input.setText("");

                    string_One = string_Final;

                } else if (string_Operator == "-") {
                    if(string_One.equals("err")){
                        string_Final ="err";
                        tv_Output.setText(string_Final);
                    }
                    else{
                        total = Double.parseDouble(string_One) - Double.parseDouble(string_Two);
                        if(string_One.equals("err")){
                            string_Final ="err";
                            tv_Input.setText("err");
                        }
                        if (total % 1 == 0) {
                            long value = (long) total;
                            string_Final = Long.toString(value);


                            StringBuilder stringbuild = new StringBuilder(string_Final);
                            int counter = string_Final.length();
                            for (int i = counter - 3; i > 0; i -= 3) {
                                stringbuild.insert(i, ',');
                            }
                            tv_Output.setText(stringbuild);
                        } else {
                            string_Final = Double.toString(total);
                            int lengthindex = string_Final.indexOf(".");
                            StringBuilder stringbuild = new StringBuilder(string_Final);
                            for (int i = lengthindex - 3; i > 0; i -= 3) {
                                stringbuild.insert(i, ',');
                            }
                            tv_Output.setText(stringbuild);
                        }
                    }
                    tv_Input.setText("");

                    string_One = string_Final;
                } else if (string_Operator == "x") {
                    if(string_One.equals("err")){
                        string_Final ="err";
                        tv_Output.setText(string_Final);
                    }
                    else{
                        total = Double.parseDouble(string_One) * Double.parseDouble(string_Two);
                        if(string_One.equals("err")){
                            string_Final ="err";
                            tv_Input.setText("err");
                        }
                        if (total % 1 == 0) {
                            long value = (long) total;
                            string_Final = Long.toString(value);


                            StringBuilder stringbuild = new StringBuilder(string_Final);
                            int counter = string_Final.length();
                            for (int i = counter - 3; i > 0; i -= 3) {
                                stringbuild.insert(i, ',');
                            }
                            tv_Output.setText(stringbuild);
                        } else {
                            string_Final = Double.toString(total);
                            int lengthindex = string_Final.indexOf(".");
                            StringBuilder stringbuild = new StringBuilder(string_Final);
                            for (int i = lengthindex - 3; i > 0; i -= 3) {
                                stringbuild.insert(i, ',');
                            }
                            tv_Output.setText(stringbuild);
                        }
                    }
                    tv_Input.setText("");

//                    tv_Output.setText(string_Final);
                    string_One = string_Final;
                } else if (string_Operator == "/") {
                    if(string_One.equals("err")){
                        string_Final ="err";
                        tv_Output.setText(string_Final);
                    }
                    else{
                        if (string_Two.equals("0") || string_Two.equals("0.") ) {
                            string_Final = "err";
                            tv_Input.setText("");
                            tv_Output.setText(string_Final);
                        } else {
                            total = Double.parseDouble(string_One) / Double.parseDouble(string_Two);
                            if (total % 1 == 0) {
                                long value = (long) total;
                                string_Final = Long.toString(value);


                                StringBuilder stringbuild = new StringBuilder(string_Final);
                                int counter = string_Final.length();
                                for (int i = counter - 3; i > 0; i -= 3) {
                                    stringbuild.insert(i, ',');
                                }
                                tv_Output.setText(stringbuild);
                            } else {
                                string_Final = Double.toString(total);
                                int lengthindex = string_Final.indexOf(".");
                                StringBuilder stringbuild = new StringBuilder(string_Final);
                                for (int i = lengthindex - 3; i > 0; i -= 3) {
                                    stringbuild.insert(i, ',');
                                }
                                tv_Output.setText(stringbuild);
                            }
                        }
                    }
                    tv_Input.setText("");
                    string_One = string_Final;
                } else{
                    if(string_Two.contains(".")){
                            int lengthindex = string_Two.indexOf(".");
                            StringBuilder stringbuild = new StringBuilder(string_Two);
                            for (int i = lengthindex - 3; i > 0; i -= 3) {
                                stringbuild.insert(i, ',');
                            }
                            tv_Output.setText(stringbuild);
                    }else{
                        StringBuilder stringbuild = new StringBuilder(string_Two);
                        int counter = string_Two.length();
                        for (int i = counter - 3; i > 0; i -= 3) {
                            stringbuild.insert(i, ',');
                        }
                        tv_Output.setText(stringbuild);
                    }

                    tv_Input.setText("");
                    string_One=string_Two;
                }
                string_Two = null;
                string_Operator = null;
            }
        });
        opHistory.setOnClickListener(view -> {
            String test = tv_History.getText().toString();
            tv_Input.setText("");
            if(test.isEmpty() && string_Two==null && string_Operator==null){
                tv_History.setText("NO HISTORY");
            }
            if(string_History==null && test.isEmpty()){
                tv_History.setText("NO HISTORY");
            }else if (string_History==null && !test.isEmpty()){
                tv_History.setText("");
            }else if(string_History!=null && test.isEmpty()){
                if(string_History.charAt(4)=='+'||string_History.charAt(4)=='-' || string_History.charAt(4)=='x'|| string_History.charAt(4)=='÷'){
                    tv_History.setText(string_History.substring(5,string_History.length()));
                }else{
                    tv_History.setText(string_History.substring(4,string_History.length()));
                }
            } else if (string_History!=null && !test.isEmpty()) {
                tv_History.setText("");
            }else{
                tv_History.setText("NO HISTORY");
            }

        });
        }
    }
