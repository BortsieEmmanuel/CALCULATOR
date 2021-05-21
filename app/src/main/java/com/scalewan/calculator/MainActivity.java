package com.scalewan.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bac, bc, bb1, bb2, bsin, bcos, btan, blog, bIn, bfact, bsquare, bsqrt, binv, bdiv, bmul, bplus, bmin, bpi, bdot, bequal;
    TextView tvsec, txtmain;
    String pi = "3.14159265";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

//        button hooks
        b0 = (Button) findViewById(R.id.b0);
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);
        bac = (Button) findViewById(R.id.bac);
        bc = (Button) findViewById(R.id.bc);
        bb1 = (Button) findViewById(R.id.bb1);
        bb2 = (Button) findViewById(R.id.bb2);
        bsin = (Button) findViewById(R.id.bsin);
        bcos = (Button) findViewById(R.id.bcos);
        btan = (Button) findViewById(R.id.btan);
        blog = (Button) findViewById(R.id.blog);
        bIn = (Button) findViewById(R.id.bIn);
        bfact = (Button) findViewById(R.id.bfact);
        bsquare = (Button) findViewById(R.id.bsquare);
        bsqrt = (Button) findViewById(R.id.bsqrt);
        binv = (Button) findViewById(R.id.binv);
        bdiv = (Button) findViewById(R.id.bdiv);
        bmul = (Button) findViewById(R.id.bmul);
        bplus = (Button) findViewById(R.id.bplus);
        bmin = (Button) findViewById(R.id.bmin);
        bpi = (Button) findViewById(R.id.bpi);
        bdot = (Button) findViewById(R.id.bdot);
        bequal = (Button) findViewById(R.id.bequal);

//        text views hooks
        tvsec = (TextView) findViewById(R.id.tvsec);
        txtmain = (TextView) findViewById(R.id.txtmain);

//        Onclick listener
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtmain.setText(txtmain.getText()+"1");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtmain.setText(txtmain.getText()+"2");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtmain.setText(txtmain.getText()+"3");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtmain.setText(txtmain.getText()+"4");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtmain.setText(txtmain.getText()+"5");
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtmain.setText(txtmain.getText()+"6");
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtmain.setText(txtmain.getText()+"7");
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtmain.setText(txtmain.getText()+"8");
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtmain.setText(txtmain.getText()+"9");
            }
        });

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtmain.setText(txtmain.getText()+"0");
            }
        });

        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtmain.setText(txtmain.getText()+".");
            }
        });

        bac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtmain.setText("");
                tvsec.setText("");
            }
        });

        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String val = txtmain.getText().toString();
                val = val.substring(0, val.length()-1);
                txtmain.setText(val);
            }
        });

        bplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtmain.setText(txtmain.getText()+"+");
            }
        });

        bmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtmain.setText(txtmain.getText()+"-");
            }
        });

        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtmain.setText(txtmain.getText()+"*");
            }
        });

        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtmain.setText(txtmain.getText()+"÷");
            }
        });

        bsqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String val = txtmain.getText().toString();
                double sqr = Math.sqrt(Double.parseDouble(val));
                txtmain.setText(String.valueOf(sqr));
            }
        });

        bb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtmain.setText(txtmain.getText()+"(");
            }
        });

        bb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtmain.setText(txtmain.getText()+")");
            }
        });

        bpi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvsec.setText(bpi.getText());
                txtmain.setText(txtmain.getText()+pi);
            }
        });

        bsin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtmain.setText(txtmain.getText()+"sin");
            }
        });

        bcos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtmain.setText(txtmain.getText()+"cos");
            }
        });

        btan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtmain.setText(txtmain.getText()+"tan");
            }
        });

        binv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtmain.setText(txtmain.getText()+"^"+"(-1)");
            }
        });

        bfact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int val = Integer.parseInt(txtmain.getText().toString());
                int fact = factorial(val);
                txtmain.setText(String.valueOf(fact));
                tvsec.setText(val+"!");
            }
        });

        bsquare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double d = Double.parseDouble(txtmain.getText().toString());
                double square = d *d;
                txtmain.setText(String.valueOf(square));
                tvsec.setText(d+"x²");
            }
        });


        blog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtmain.setText(txtmain.getText()+"log");
            }
        });

        bIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtmain.setText(txtmain.getText()+"In");
            }
        });

        bequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String val = txtmain.getText().toString();
                String kofi = val.replace('÷', '/').replace('×', '*');
                double result  = eval(kofi);
                txtmain.setText(String.valueOf(result));
                tvsec.setText(val);
            }
        });




    }

    private double eval(final  String kofi) {
        return new Object(){
            int pos = -1, ch;
            void nextChar(){
                ch = (++pos < kofi.length()) ? kofi.charAt(pos) : -1;
            }
            boolean eat(int charToEat){
                while (ch == ' ')nextChar();
                if (ch == charToEat){
                    nextChar();
                    return true;
                }
                return false;
            }
            double parse(){
                nextChar();
                double x = parseExpression();
                if (pos < kofi.length())throw new RuntimeException("Unexpected: "+(char)ch);
                return x;
            }
            double parseExpression(){
                double x =  parseTerm();
                for(;;){
                    if (eat('+')) x += parseTerm();
                    else if (eat('-')) x -= parseTerm();
                    else return x;
                }
            }
            double parseTerm(){
                double x = parseFactor();
                for(;;){
                    if (eat('*')) x *= parseFactor();
                    else if (eat('/')) x /= parseFactor();
                    else  return x;
                }
            }
            double parseFactor(){
                if (eat('+')) return parseFactor();
                if (eat('/')) return parseFactor();

                double x;
                int startPos = this.pos;
                if (eat('(')){
                    x = parseExpression();
                    eat(')');
                }
                else if ((ch >= '0' && ch  <='9') || ch == '.'){
                    while ((ch >= '0' && ch <= '9') || ch == '.')nextChar();
                    x = Double.parseDouble((kofi.substring(startPos, this.pos)));
                }else if (ch >= 'a' && ch <= 'z'){
                    while (ch >= 'a' && ch <= 'z')nextChar();
                    String func = kofi.substring(startPos, this.pos);
                    x = parseFactor();
                    if (func.equals("sqrt")) x = Math.sqrt(x);
                    else if (func.equals("sin")) x = Math.sin(Math.toRadians(x));
                    else if (func.equals("cos")) x = Math.cos(Math.toRadians(x));
                    else if (func.equals("tan")) x = Math.tan(Math.toRadians(x));
                    else if (func.equals("log")) x = Math.log10(x);
                    else if (func.equals("In")) x = Math.log(x);
                    else throw new RuntimeException("Unknown function:"+ func);
                } else {
                    throw new RuntimeException("Unexpected: "+(char)ch);
                }
                if (eat('^')) x = Math.pow(x, parseFactor());
                return x;
            }

        }.parse();
    }

    private int factorial(int val) {
        return (val==1 || val==0)?1 : val*factorial(val-1);
    }
    }
