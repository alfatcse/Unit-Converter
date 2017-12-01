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
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Time extends AppCompatActivity {
    private Spinner spinner1, spinner2;
    private EditText from;
    private TextView to;
    List<String> list1 = new ArrayList<String>();
    List<String> list2 = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time);
        from = (EditText) findViewById(R.id.from);
        to = (TextView) findViewById(R.id.to);
        spinner1 = (Spinner) findViewById(R.id.spinner1);
        from.addTextChangedListener(mTextEditorWatcher);
        list1.add("NanoSecond");
        list1.add("MicroSecond");
        list1.add("MilliSecond");
        list1.add("Second");
        list1.add("Minute");
        list1.add("Hour");
        list1.add("Day");
        list1.add("Week");
        list1.add("Month");
        list1.add("Year");
        list1.add("Decade");
        list1.add("Century");
        ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, list1);
        dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(dataAdapter1);
        spinner2 = (Spinner) findViewById(R.id.spinner2);
        list2.add("NanoSecond");
        list2.add("MicroSecond");
        list2.add("MilliSecond");
        list2.add("Second");
        list2.add("Minute");
        list2.add("Hour");
        list2.add("Day");
        list2.add("Week");
        list2.add("Month");
        list2.add("Year");
        list2.add("Decade");
        list2.add("Century");
        ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, list2);
        dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(dataAdapter2);
        {
            try {
                spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> arg0, View arg1, int index1, long arg3) {
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
            }}
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> arg0, View arg1, int index2, long arg3) {
                Log.d("spinner 2 "," "+spinner2.getSelectedItem().toString());
                getResult();
            }
            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
            }
        });
    }
    private  double getResult(){
        try {
            int index1 = spinner1.getSelectedItemPosition();
            int index2 = spinner2.getSelectedItemPosition();;
            double resul=0;
            if(index1==0)
            {
                if(index2==1)
                {
                    if(from.getText().length()!=0)
                    {
                        float value = Float.parseFloat(from.getText().toString());
                        float result=value/1000.0f;
                        to.setText(result+"");
                    }
                    else
                    {

                    }

                }
                else  if(index2==0)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+value;
                        to.setText(b+"");
                    }
                    else
                    {

                    }

                }
                else  if(index2==2)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value/1000000.0f);
                        to.setText(b+"");
                    }
                    else
                    {
                    }

                }
                else  if(index2==3)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value/1000000000.0f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }

                }
                else  if(index2==3)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value/600000000000.0f);
                        to.setText(b+"");
                    }
                    else
                    {
                        Toast.makeText(Time.this,"",Toast.LENGTH_LONG).show();
                    }

                }
                else  if(index2==4)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value/3600000000000.0f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                else  if(index2==5)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value/86400000000000.0f);
                        to.setText(b+"");
                    }
                    else
                    {
                        Toast.makeText(Time.this,"",Toast.LENGTH_LONG).show();
                    }

                }
                else  if(index2==6)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value/(7*(86400000000000.0f)));
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                else  if(index2==7)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value/(30*(86400000000000.0f)));
                        to.setText(b+"");
                    }
                    else
                    {

                    }

                }
                else  if(index2==8)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value/(365*(86400000000000.0f)));
                        to.setText(b+"");
                    }
                    else
                    {
                    }

                }
                else  if(index2==9)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value/(3650*(86400000000000.0f)));
                        to.setText(b+"");
                    }
                    else
                    {

                    }

                }
                else  if(index2==10)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value/(36500*(86400000000000.0f)));
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }

            }
            else if(index1==1)
            {

                if(index2==1)
                {
                    if(from.getText().length()!=0)
                    {

                        float value = Float.parseFloat(from.getText().toString());
                        float result=value;
                        to.setText(result+"");
                    }
                    else
                    {

                    }

                }
                else  if(index2==0)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+value*1000.0f;
                        to.setText(b+"");
                    }
                    else
                    {

                    }

                }
                else  if(index2==2)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*0.001f);
                        to.setText(b+"");
                    }
                    else
                    {
                    }

                }
                else  if(index2==3)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*0.000001f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                else  if(index2==4)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*0.00000001667f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                else  if(index2==5)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*0.0000000002778f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                else  if(index2==6)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*0.000000000011574f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                else  if(index2==7)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*0.0000000000016534f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }

                }
                else  if(index2==8)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*0.00000000000038052f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }

                }
                else  if(index2==9)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*.00000000000003171f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }

                }
                else  if(index2==10)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*0.000000000000003171f);
                        to.setText(b+"");
                    }
                    else
                    {
                    }
                }
                else  if(index2==11)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*0.0000000000000003171f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
            }
            else  if(index1==2)
            {
                if(index2==0)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*1000000.0f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==1)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*10000.0f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==2)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*1.0f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==3)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*0.0001f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==4)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value *0.000001667f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==5)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*0.000000027778f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==6)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*1.1574e-8f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==7)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*16534e-9f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==8)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*3.8052e-10f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==9)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*3.171e-11f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==10)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*3.171e-12f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==11)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*3.171e-13f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
            }
            else  if(index1==3)
            {
                if(index2==0)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*1e+9f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==1)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*1e+6f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==2)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*1000.0f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==3)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*1.0f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==4)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value *0.0166667f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==5)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*0.000000027778f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==6)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*1.1574e-5f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==7)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*1.6534e-6f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==8)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*3.8052e-7f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==9)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*3.171e-8f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==10)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*3.171e-9f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==11)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*3.171e-10f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
            }
            else  if(index1==4)
            {
                if(index2==0)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*6e+10f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==1)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*6e+7f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==2)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*60000.0f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==3)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*60.0f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==4)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value *1.0f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==5)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*0.0166667f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==6)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*0.000694444f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==7)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*9.9206e-5f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==8)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*2.2831e-5f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==9)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*1.9026e-6f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==10)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*1.9026e-7f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==11)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*1.9026e-8f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
            }
            else  if(index1==5)
            {
                if(index2==0)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*3.6e+12f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==1)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*3.6e+9f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==2)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*3.6e+6f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==3)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*3600f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==4)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value *60.0f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==5)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*1.0f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==6)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*0.0416667f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==7)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*0.00595238f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==8)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*0.00136986f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==9)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*0.000114155f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==10)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*1.1416e-5f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==11)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*1.1416e-6f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
            }
            else  if(index1==6)
            {
                if(index2==0)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*8.64e+13f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==1)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*8.64e+10f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==2)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*8.64e+7f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==3)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*86400f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==4)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value *1440.0f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==5)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*24.0f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==6)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*1.0f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==7)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*0.142857f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==8)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*0.0328767f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==9)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*0.00273973f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==10)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*0.000273973f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==11)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*2.7397e-5f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
            }
            else  if(index1==7)
            {
                if(index2==0)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*6.048e+14f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==1)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*6.048e+11f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==2)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*6.048e+8f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==3)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*604800f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==4)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value *10080.0f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==5)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*168.0f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==6)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*7.0f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==7)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*1.0f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==8)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*0.230137f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==9)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*0.0191781f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==10)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*0.00191781f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==11)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*0.000191781f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
            }
            else  if(index1==8)
            {
                if(index2==0)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*2.628e+15f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==1)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*2.628e+12f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==2)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*2.628e+9f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==3)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*2.628e+6f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==4)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value *43800.0f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==5)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*730.001f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==6)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*30.4167f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==7)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*4.34524f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==8)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*1.0f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==9)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*0.0833334f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==10)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*0.00833334f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==11)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*0.000833334f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
            }
            else  if(index1==9)
            {
                if(index2==0)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*3.154e+16f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==1)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*3.154e+13f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==2)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*3.154e+10f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==3)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*3.154e+7f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==4)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value *525600.0f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==5)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*8760.00f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==6)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*365.0f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==7)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*52.1429f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==8)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*12.0f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==9)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*0.00833334f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==10)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*0.00833334f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==11)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*0.000833334f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
            }
            else  if(index1==10)
            {
                if(index2==0)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*3.154e+17f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==1)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*3.154e+14f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==2)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*3.154e+11f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==3)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*5.256e+6f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==4)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value *5.256e+6f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==5)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*87600.00f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==6)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*3650.0f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==7)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*521.429f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==8)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*120.0f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==9)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*10.00f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==10)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*1.0f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==11)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*0.1f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
            }
            else  if(index1==11)
            {
                if(index2==0)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*3.154e+18f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==1)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*3.154e+15f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==2)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*3.154e+12f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==3)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*3.154e+9f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==4)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value *5.256e+7f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==5)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*876000.00f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==6)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*36500.0f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==7)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*5214.29f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==8)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*1200.0f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==9)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*100.00f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==10)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*10.0f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
                }
                if(index2==11)
                {
                    if(from.getText().length()!=0)
                    {
                        float b=0;
                        float value = Float.parseFloat(from.getText().toString());
                        b=b+(value*1.f);
                        to.setText(b+"");
                    }
                    else
                    {

                    }
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
