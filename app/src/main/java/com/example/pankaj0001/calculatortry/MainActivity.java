package com.example.pankaj0001.calculatortry;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button bn0,bn1,bn2,bn3,bn4,bn5,bn6,bn7,bn8,bn9,bnadd,bnmult,bnsub,bndiv,bnpt,bneq,bnc;
    TextView tv;
    int q=0,m,r=0;
    float a,b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bn0=findViewById(R.id.bn0);
        bn1=findViewById(R.id.bn1);
        bn2=findViewById(R.id.bn2);
        bn3=findViewById(R.id.bn3);
        bn4=findViewById(R.id.bn4);
        bn5=findViewById(R.id.bn5);
        bn6=findViewById(R.id.bn6);
        bn7=findViewById(R.id.bn7);
        bn8=findViewById(R.id.bn8);
        bn9=findViewById(R.id.bn9);
        bnadd=findViewById(R.id.bnadd);
        bnmult=findViewById(R.id.bnmult);
        bndiv=findViewById(R.id.bndiv);
        bnsub=findViewById(R.id.bnsub);
        bnpt=findViewById(R.id.bnpt);
        bneq=findViewById(R.id.bneq);
        tv =findViewById(R.id.tv);
        bnc=findViewById(R.id.bnc);


        bn0.setOnClickListener(this);
        bn1.setOnClickListener(this);
        bn2.setOnClickListener(this);
        bn3.setOnClickListener(this);
        bn4.setOnClickListener(this);
        bn5.setOnClickListener(this);
        bn6.setOnClickListener(this);
        bn7.setOnClickListener(this);
        bn8.setOnClickListener(this);
        bn9.setOnClickListener(this);
        bnadd.setOnClickListener(this);
        bnsub.setOnClickListener(this);
        bndiv.setOnClickListener(this);
        bnpt.setOnClickListener(this);
        bnmult.setOnClickListener(this);
        bneq.setOnClickListener(this);
        bnc.setOnClickListener(this);



tv.setText(""+q);

    }

    @Override
    public void onClick(View view) {


        switch (view.getId())
        {
         /*   case R.id.bn0 :tv.setText (bn0.getText().toString());
                break;
            case R.id.bn1 :tv.setText((bn1.getText().toString()));
                break;
            case R.id.bn2 :tv.setText((bn2.getText().toString()));
                break;
            case R.id.bn3 :tv.setText((bn3.getText().toString()));
                break;
            case R.id.bn4 :tv.setText((bn4.getText().toString()));
                break;
            case R.id.bn5 :tv.setText((bn5.getText().toString()));
                break;
            case R.id.bn6 :tv.setText((bn6.getText().toString()));
                break;
            case R.id.bn7 : tv.setText((bn7.getText().toString()));
                break;
            case R.id.bn8 : tv.setText((bn8.getText().toString()));
                break;
            case R.id.bn9 : tv.setText((bn9.getText().toString()));
                break;
            case R.id.bnadd : tv.setText((bnadd.getText().toString()));
                break;
            case R.id.bnsub : tv.setText((bnsub.getText().toString()));
                break;
            case R.id.bndiv : tv.setText((bndiv.getText().toString()));
                break;
            case R.id.bnmult : tv.setText((bnmult.getText().toString()));
                break;
            case R.id.bnpt : tv.setText((bnpt.getText().toString()));
                break;     */




         /*   case R.id.bn0 :  a= ( (Integer.parseInt(tv.getText().toString()))*10) + (Integer.parseInt(bn0.getText().toString()));
                tv.setText(""+a);
                break;
            case R.id.bn1 :  a =  ((Integer.parseInt(tv.getText().toString()))*10)+ (Integer.parseInt(bn1.getText().toString()));
                tv.setText(""+a);
                break;
            case R.id.bn2 : a=  (Integer.parseInt(tv.getText().toString()))*10+ (Integer.parseInt(bn2.getText().toString()));
                tv.setText(""+a);
                break;
            case R.id.bn3 :  a =  (Integer.parseInt(tv.getText().toString()))*10+ (Integer.parseInt(bn3.getText().toString()));
                tv.setText(""+a);
                break;
            case R.id.bn4 :  a=  (Integer.parseInt(tv.getText().toString()))*10+ (Integer.parseInt(bn4.getText().toString()));
                tv.setText(""+a);
                break;
            case R.id.bn5 : a =  (Integer.parseInt(tv.getText().toString()))*10+ (Integer.parseInt(bn5.getText().toString()));
                tv.setText(""+a);
                break;
            case R.id.bn6 : a =  (Integer.parseInt(tv.getText().toString()))*10+ (Integer.parseInt(bn6.getText().toString()));
                tv.setText(""+a);
                break;
            case R.id.bn7 : a =  (Integer.parseInt(tv.getText().toString()))*10+ (Integer.parseInt(bn7.getText().toString()));
                tv.setText(""+a);
                break;
            case R.id.bn8 : a =  (Integer.parseInt(tv.getText().toString()))*10+ (Integer.parseInt(bn8.getText().toString()));
                tv.setText(""+a);
                break;
            case R.id.bn9 : a =  (Integer.parseInt(tv.getText().toString()))*10+ (Integer.parseInt(bn9.getText().toString()));
                tv.setText(""+a);
                break;
            case R.id.bnadd : m=1  ;
                 b=a;
                tv.setText("0");
                break;
            case R.id.bnsub : m=2 ;
                b=a;
                tv.setText("0");
                break;
            case R.id.bndiv : m=3;
                b=a;
                tv.setText("0");
                break;
            case R.id.bnmult : m=4 ;
                b=a;
            tv.setText("0");
                break;
            case R.id.bneq :switch(m)
            {
                case 1:
                    a = a + b;
                    break;

                case 2:
                    a = b - a;
                    break;

                case 3:
                    a = b / a;
                    break;

                case 4:
                    a = a * b;
                    break;
            }
                tv.setText("value"+a);
                break;

            case R.id.bnc : a=0 ;
                b=0;
                tv.setText("0");
                break;

            case R.id.bnpt : r=1; ;

                tv.setText(""+a+".");
                break;


*/

            case R.id.bn0 :  a= ( (Float.parseFloat(tv.getText().toString()))*10) + (Integer.parseInt(bn0.getText().toString()));
              //  tv.setText(""+a);
                break;
            case R.id.bn1 :  a =  ((Float.parseFloat(tv.getText().toString()))*10)+ (Integer.parseInt(bn1.getText().toString()));
             //   tv.setText(""+a);
                break;
            case R.id.bn2 : a=  (Float.parseFloat(tv.getText().toString()))*10+ (Integer.parseInt(bn2.getText().toString()));
              //  tv.setText(""+a);
                break;
            case R.id.bn3 :  a =  (Float.parseFloat(tv.getText().toString()))*10+ (Integer.parseInt(bn3.getText().toString()));
              //  tv.setText(""+a);
                break;
            case R.id.bn4 :  a=  (Float.parseFloat(tv.getText().toString()))*10+ (Integer.parseInt(bn4.getText().toString()));
               // tv.setText(""+a);
                break;
            case R.id.bn5 : a =  (Float.parseFloat(tv.getText().toString()))*10+ (Integer.parseInt(bn5.getText().toString()));
               // tv.setText(""+a);
                break;
            case R.id.bn6 : a =  (Float.parseFloat(tv.getText().toString()))*10+ (Integer.parseInt(bn6.getText().toString()));
              //  tv.setText(""+a);
                break;
            case R.id.bn7 : a =  (Float.parseFloat(tv.getText().toString()))*10+ (Integer.parseInt(bn7.getText().toString()));
              //  tv.setText(""+a);
                break;
            case R.id.bn8 : a =  (Float.parseFloat(tv.getText().toString()))*10+ (Integer.parseInt(bn8.getText().toString()));
               // tv.setText(""+a);
                break;
            case R.id.bn9 : a =  (Float.parseFloat(tv.getText().toString()))*10+ (Integer.parseInt(bn9.getText().toString()));
               // tv.setText(""+a);
                break;
            case R.id.bnadd : m=1  ;r=0;
                b=a;
                tv.setText("0");
                break;
            case R.id.bnsub : m=2 ;r=0;
                b=a;
                tv.setText("0");
                break;
            case R.id.bndiv : m=3;r=0;
                b=a;
                tv.setText("0");
                break;
            case R.id.bnmult : m=4 ;r=0;
                b=a;
                tv.setText("0");
                break;
            case R.id.bneq : r=0;
                switch(m)
            {
                case 1:
                    a = a + b;
                    break;

                case 2:
                    a = b - a;
                    break;

                case 3:
                    a = b / a;
                    break;

                case 4:
                    a = a * b;
                    break;
            }
                tv.setText("value"+a);
                break;

            case R.id.bnc : a=0 ;
                b=0;
                tv.setText("0");
                break;

            case R.id.bnpt : r=1; ;

                tv.setText(""+a);
                break;





        }
if(view.getId()==R.id.bn0||view.getId()==R.id.bn1||view.getId()==R.id.bn2||view.getId()==R.id.bn3||view.getId()==R.id.bn4||view.getId()==R.id.bn5||view.getId()==R.id.bn6||view.getId()==R.id.bn7||view.getId()==R.id.bn8||view.getId()==R.id.bn9)
{
    if(r==0)
    {
        tv.setText(""+a);
    }

    else if(r==1)
    { a/=10;
        tv.setText(""+a );
    }
}

    }
}