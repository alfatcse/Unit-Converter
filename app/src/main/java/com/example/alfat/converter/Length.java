package com.example.alfat.converter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Length extends AppCompatActivity {
    private Spinner spinner1, spinner2;
    private EditText from;
    private TextView to;
    List<String> list1 = new ArrayList<String>();
    List<String> list2 = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length);
        from = (EditText) findViewById(R.id.from);
        to = (TextView) findViewById(R.id.to);
        spinner1 = (Spinner) findViewById(R.id.spinner1);
        from.addTextChangedListener(mTextEditorWatcher);
        list1.add("Kilometre");
        list1.add("Metre");
        list1.add("Centimetre");
        list1.add("Millimetre");
        list1.add("Micrometre");
        list1.add("Nanometre");
        list1.add("Mile");
        list1.add("Yard");
        list1.add("Foot");
        list1.add("Inch");
        list1.add("Nautical mile");
        ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, list1);
        dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(dataAdapter1);
        spinner2 = (Spinner) findViewById(R.id.spinner2);
        list2.add("Kilometre");
        list2.add("Metre");
        list2.add("Centimetre");
        list2.add("Millimetre");
        list2.add("Micrometre");
        list2.add("Nanometre");
        list2.add("Mile");
        list2.add("Yard");
        list2.add("Foot");
        list2.add("Inch");
        list2.add("Nautical mile");
        ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, list2);
        dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(dataAdapter2);
        {
            try {
                spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long arg3) {
                        list1.get(position);
                        Log.d("spinner 1 "," "+spinner1.getSelectedItem().toString());
                        getResult();
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> arg0) {
                    }
                });
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> arg0, View arg1, int position1, long arg3) {
                Log.d("spinner 2 "," "+spinner2.getSelectedItem().toString());
                getResult();
            }
            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
            }
        });
    }
    private  double getResult()
    {
        try{
            int index1 = spinner1.getSelectedItemPosition();
            int index2 = spinner2.getSelectedItemPosition();
            double resul=0;
            if(index1==0) //pound index
            {
                if(index2==0)
                {
                    if(from.getText().length()!=0)
                    { float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value;
                        to.setText(b+"");}
                    else
                    {
                    }
                }
                else if(index2==1)
                {
                    if(from.getText().length()!=0)
                    {float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+(value*1000.0f);
                        to.setText(b+"");}
                    else
                    {

                    }
                }
                else if(index2==2)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*100000.0f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==3)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*1e+6f;
                        to.setText(b+"");}
                    else
                    {}
                }

                else if(index2==4)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*1e+9f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==5)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*1e+12f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==6)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*0.621371f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==7)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*1093.61f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==8)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*3280.84f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==9)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*3280.84f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==10)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*0.539957f;
                        to.setText(b+"");}
                    else
                    {}
                }
            }
            else if (index1==1) //metric ton index
            {

                if(index2==0)//pound
                {
                    if(from.getText().length()!=0)
                    { float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*0.001f;
                        to.setText(b+"");}
                    else
                    {

                    }
                }
                else if(index2==1)   //metric ton
                {
                    if(from.getText().length()!=0)
                    {float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value;
                        to.setText(b+"");}
                    else
                    {

                    }
                }
                else if(index2==2) //kg
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*100.0f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==3) //micro gram
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*1000.0f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==4) //ounce
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*1e+6f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==5)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*1e+9f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==6)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*0.000621371f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==7)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*1.09361f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==8)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*3.28084f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==9)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*39.3701f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==10)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*0.000539957f;
                        to.setText(b+"");}
                    else
                    {}
                }
            }
            if(index1==2)//kg index
            {
                if(index2==0)//pound
                {
                    if(from.getText().length()!=0)
                    { float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*1e-5f;
                        to.setText(b+"");}
                    else
                    {

                    }
                }
                else if(index2==1)//metric ton
                {
                    if(from.getText().length()!=0)
                    {float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*0.01f;
                        to.setText(b+"");}
                    else
                    {

                    }
                }
                else if(index2==2)//kg
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==3)//micro gram
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*10.0f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==4)//ounce
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*10000.0f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==5)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*1e+7f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==6)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*6.2137e-6f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==7)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*0.0109361f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==8)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*0.0328084f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==9)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*0.393701f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==10)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*5.3996e-6f;
                        to.setText(b+"");}
                    else
                    {}
                }
            }
            if(index1==3)//micro gram index
            {
                if(index2==0)//pound
                {
                    if(from.getText().length()!=0)
                    { float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value *1e-6f;;
                        to.setText(b+"");}
                    else
                    {

                    }
                }
                else if(index2==1)//metric ton
                {
                    if(from.getText().length()!=0)
                    {float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*0.001f;
                        to.setText(b+"");}
                    else
                    {

                    }
                }
                else if(index2==2)//kg
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*0.1f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==3)//micro gram
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*10.0f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==4)//ounce
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*1000.0f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==5)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*1e+7f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==6)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*6.2137e-6f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==7)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*0.0109361f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==8)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*0.0328084f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==9)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*0.393701f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==10)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*5.3996e-6f;
                        to.setText(b+"");}
                    else
                    {}
                }
            }
            if(index1==4)//micro gram index
            {
                if(index2==0)//pound
                {
                    if(from.getText().length()!=0)
                    { float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*1e-6f;
                        to.setText(b+"");}
                    else
                    {

                    }
                }
                else if(index2==1)//metric ton
                {
                    if(from.getText().length()!=0)
                    {float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*0.001f;
                        to.setText(b+"");}
                    else
                    {

                    }
                }
                else if(index2==2)//kg
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*.1f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==3)//micro gram
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==4)//ounce
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*1000.0f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==5)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*1e+6f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==6)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*6.2137e-7f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==7)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*0.00109361f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==8)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*0.00328084f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==9)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*0.0393701f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==10)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*5.3996e-7f;
                        to.setText(b+"");}
                    else
                    {}
                }
            }
            if(index1==5)//micro gram index
            {
                if(index2==0)//pound
                {
                    if(from.getText().length()!=0)
                    { float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value *1e-12f;;
                        to.setText(b+"");}
                    else
                    {

                    }
                }
                else if(index2==1)//metric ton
                {
                    if(from.getText().length()!=0)
                    {float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*1e-9f;
                        to.setText(b+"");}
                    else
                    {

                    }
                }
                else if(index2==2)//kg
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*1e-7f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==3)//micro gram
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*1e-6f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==4)//ounce
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*000.001f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==5)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==6)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*6.2137e-13f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==7)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*1.0936e-9f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==8)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*3.2808e-9f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==9)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*3.937e-8f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==10)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*5.3996e-13f;
                        to.setText(b+"");}
                    else
                    {}
                }
            }
            if(index1==6)//micro gram index
            {
                if(index2==0)//pound
                {
                    if(from.getText().length()!=0)
                    { float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value *1.60934f;;
                        to.setText(b+"");}
                    else
                    {

                    }
                }
                else if(index2==1)//metric ton
                {
                    if(from.getText().length()!=0)
                    {float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*1609.34f;
                        to.setText(b+"");}
                    else
                    {

                    }
                }
                else if(index2==2)//kg
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*160934f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==3)//micro gram
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*1.609e+6f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==4)//ounce
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*1.609e+9f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==5)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*1.609e+12f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==6)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==7)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*1760f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==8)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*5280f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==9)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*63360f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==10)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*0.868976f;
                        to.setText(b+"");}
                    else
                    {}
                }
            }

            if(index1==7)//micro gram index
            {
                if(index2==0)//pound
                {
                    if(from.getText().length()!=0)
                    { float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value *0.0009144f;;
                        to.setText(b+"");}
                    else
                    {

                    }
                }
                else if(index2==1)//metric ton
                {
                    if(from.getText().length()!=0)
                    {float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*0.9144f;
                        to.setText(b+"");}
                    else
                    {

                    }
                }
                else if(index2==2)//kg
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*91.44f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==3)//micro gram
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*914.4f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==4)//ounce
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*914400f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==5)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*9.144e+8f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==6)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*0.000568182f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==7)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==8)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*3.0f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==9)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*36.0f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==10)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*0.000493737f;
                        to.setText(b+"");}
                    else
                    {}
                }
            }
            if(index1==8)//micro gram index
            {
                if(index2==0)//pound
                {
                    if(from.getText().length()!=0)
                    { float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value *0.0003048f;;
                        to.setText(b+"");}
                    else
                    {

                    }
                }
                else if(index2==1)//metric ton
                {
                    if(from.getText().length()!=0)
                    {float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*0.3048f;
                        to.setText(b+"");}
                    else
                    {

                    }
                }
                else if(index2==2)//kg
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*30.48f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==3)//micro gram
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*304.8f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==4)//ounce
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*304800f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==5)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*3.048e+8f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==6)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*0.000189394f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==7)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*0.333333f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==8)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==9)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*12f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==10)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*0.000164579f;
                        to.setText(b+"");}
                    else
                    {}
                }
            }
            if(index1==9)//micro gram index
            {
                if(index2==0)//pound
                {
                    if(from.getText().length()!=0)
                    { float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value *2.54e-5f;;
                        to.setText(b+"");}
                    else
                    {

                    }
                }
                else if(index2==1)//metric ton
                {
                    if(from.getText().length()!=0)
                    {float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*0.0254f;
                        to.setText(b+"");}
                    else
                    {

                    }
                }
                else if(index2==2)//kg
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*2.54f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==3)//micro gram
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*25.4f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==4)//ounce
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*25400f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==5)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*2.54e+7f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==6)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*1.5783e-5f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==7)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*0.0277778f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==8)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*0.0833333f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==9)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==10)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*1.3715e-5f;
                        to.setText(b+"");}
                    else
                    {}
                }
            }
            if(index1==10)//micro gram index
            {
                if(index2==0)//pound
                {
                    if(from.getText().length()!=0)
                    { float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value *1.852f;;
                        to.setText(b+"");}
                    else
                    {

                    }
                }
                else if(index2==1)//metric ton
                {
                    if(from.getText().length()!=0)
                    {float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*1852f;
                        to.setText(b+"");}
                    else
                    {

                    }
                }
                else if(index2==2)//kg
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*185200f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==3)//micro gram
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*1.852e+6f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==4)//ounce
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*1.852e+9f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==5)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*1.852e+12f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==6)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*1.15078f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==7)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*2025.37f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==8)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*6076.12f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==9)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*72913.4f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==10)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value;
                        to.setText(b+"");}
                    else
                    {}
                }
            }

            return resul;
        }catch (Exception e){
            Log.d("",e.getMessage());
        }
        return 0;
    }
    private final TextWatcher mTextEditorWatcher = new TextWatcher() {

        public void beforeTextChanged(CharSequence s, int start, int count, int after)
        {
            to.setText("");
        }
        public void onTextChanged(CharSequence s, int start, int before, int count)
        {

        }
        public void afterTextChanged(Editable s)
        {
            try {
                getResult();
            }catch (Exception e){
                Log.d("",e.getMessage());
            }
        }
    };
}
