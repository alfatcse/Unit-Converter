package com.example.alfat.converter;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
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

public class Data_transfer_rate extends AppCompatActivity {
    private Spinner spinner1, spinner2;
    private EditText from;
    private TextView to;
    List<String> list1 = new ArrayList<String>();
    List<String> list2 = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_transfer_rate);
        from = (EditText) findViewById(R.id.from);
        to = (TextView) findViewById(R.id.to);
        spinner1 = (Spinner) findViewById(R.id.spinner1);
        from.addTextChangedListener(mTextEditorWatcher);
        list1.add("Bit per second");//1
        list1.add("Kilobit per second");//2
        list1.add("Kilobyte per second");//3
        list1.add("Kibibit per second");//4
        list1.add("Megabit per second");//5
        list1.add("Megabyte per second");//6
        list1.add("Mebibit per second");//7
        list1.add("Gigabit per second");//8
        list1.add("Gigabyte per second");//9
        list1.add("Gibibit per second");//10
        list1.add("Terabit per second");//11
        list1.add("Terabyte per second"); //12
        list1.add("Tebibit per second");//13
        ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, list1);
        dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(dataAdapter1);
        spinner2 = (Spinner) findViewById(R.id.spinner2);
        list2.add("Bit per second");//1
        list2.add("Kilobit per second");//2
        list2.add("Kilobyte per second");//3
        list2.add("Kibibit per second");//4
        list2.add("Megabit per second");//5
        list2.add("Megabyte per second");//6
        list2.add("Mebibit per second");//7
        list2.add("Gigabit per second");//8
        list2.add("Gigabyte per second");//9
        list2.add("Gibibit per second");//10
        list2.add("Terabit per second");//11
        list2.add("Terabyte per second"); //12
        list2.add("Tebibit per second");//13
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
                        b=b+(value*4.0f);
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
                        b=b+value*8.0f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==3)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*15.7725f;
                        to.setText(b+"");}
                    else
                    {}
                }

                else if(index2==4)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*128.0f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==5)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*256f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==6)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*768.0f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==7)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*0.00378541f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==8)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*3.78541f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==9)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*3785.41f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==10)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*0.832674f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==11)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*3.3307f;
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
                        b=b+value*0.25f;
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
                        b=b+value*2.0f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==3) //micro gram
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*3.94314f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==4) //ounce
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*32.0f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==5)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*64.0f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==6)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*192.0f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==7)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*0.000946353f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==8)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*0.946353f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==9)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*946.353f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==10)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*0.208169f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==11)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*0.832674f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==12)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*1.66535f;
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
                        b=b+value*0.125f;
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
                        b=b+value*0.5f;
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
                        b=b+value*1.97157f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==4)//ounce
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*16f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==5)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*32f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==6)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*96f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==7)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*0.000473176f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==8)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*0.473176f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==9)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*473.176f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==10)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*0.104084f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==11)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*0.416337f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==12)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*0.832674f;
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
                        b=b+value *0.0634013f;;
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
                        b=b+value*0.253605f;
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
                        b=b+value*0.50721f;
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
                        b=b+value*8.11537f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==5)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*16.2307f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==6)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*48.6922f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==7)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*0.00024f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==8)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*0.24f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==9)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*240f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==10)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*0.0527926f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==11)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*0.21117f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==12)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*0.422341f;
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
                        b=b+value*0.0078125f;
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
                        b=b+value*0.03125f;
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
                        b=b+value*0.0625f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==3)//micro gram
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*0.123223f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==4)//ounce
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==5)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*2f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==6)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*6f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==7)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*2.9574e-5f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==8)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*0.0295735f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==9)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*29.5735f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==10)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*0.00650527f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==11)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*0.0260211f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==12)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*0.0520421f;
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
                        b=b+value *0.00390625f;;
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
                        b=b+value*0.015625f;
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
                        b=b+value*0.03125f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==3)//micro gram
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*0.0616115f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==4)//ounce
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*0.5f;
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
                        b=b+value*3f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==7)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*1.4787e-5f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==8)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*0.0147868f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==9)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*14.7868f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==10)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*0.00325263f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==11)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*0.0130105f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==12)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*0.0260211f;
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
                        b=b+value *0.00130208f;;
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
                        b=b+value*0.00520833f;
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
                        b=b+value*0.0104167f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==3)//micro gram
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*0.0205372f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==4)//ounce
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*0.166667f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==5)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*0.333333f;
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
                        b=b+value*4.9289e-6f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==8)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*0.00492892f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==9)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*4.92892f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==10)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*0.00108421f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==11)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*0.00433684f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==12)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*0.00867369f;
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
                        b=b+value *264.172f;;
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
                        b=b+value*1056.69f;
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
                        b=b+value*2113.38f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==3)//micro gram
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*4166.67f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==4)//ounce
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*33814f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==5)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*67628f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==6)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*202884f;
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
                        b=b+value*1000.0f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==9)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*1e+6f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==10)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*219.969f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==11)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*879.877f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==12)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*1759.75f;
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
                        b=b+value *0.264172f;;
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
                        b=b+value*1.05669f;
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
                        b=b+value*2.11338f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==3)//micro gram
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*4.16667f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==4)//ounce
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*33.814f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==5)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*67.628f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==6)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*202.884f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==7)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*0.001f;
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
                        b=b+value*1000f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==10)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*0.219969f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==11)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*0.879877f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==12)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*1.75975f;
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
                        b=b+value *0.000264172f;;
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
                        b=b+value*0.00105669f;
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
                        b=b+value*0.00211338f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==3)//micro gram
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*0.00416667f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==4)//ounce
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*0.033814f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==5)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*0.067628f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==6)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*0.202884f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==7)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*1e-6f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==8)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*0.001f;
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
                        b=b+value*0.000219969f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==11)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*0.000879877f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==12)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*0.00175975f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==13)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*0.00351951f;
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
                        b=b+value *1.20095f;;
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
                        b=b+value*4.8038f;
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
                        b=b+value*9.6076f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==3)//micro gram
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*18.942f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==4)//ounce
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*153.722f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==5)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*307.443f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==6)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*922.33f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==7)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*0.00454609f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==8)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*4.54609f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==9)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*4546.09f;
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
                else if(index2==11)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*04f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==12)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*8f;
                        to.setText(b+"");}
                    else
                    {}
                }
            }
            if(index1==11)//micro gram index
            {
                if(index2==0)//pound
                {
                    if(from.getText().length()!=0)
                    { float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value *0.300237f;;
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
                        b=b+value*1.20095f;
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
                        b=b+value*2.4019f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==3)//micro gram
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*4.73551f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==4)//ounce
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*38.4304f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==5)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*76.8608f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==6)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*230.582f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==7)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*0.00113652f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==8)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*1.13652f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==9)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*1136.52f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==10)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*0.25f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==11)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==12)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*2f;
                        to.setText(b+"");}
                    else
                    {}
                }
            }
            //////////////////Need to start from here/////////
             if(index1==12)//micro gram index
            {
                if(index2==0)//pound
                {
                    if(from.getText().length()!=0)
                    { float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value *0.150119f;;
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
                        b=b+value*0.600475f;
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
                        b=b+value*1.20095f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==3)//micro gram
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*2.36776f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==4)//ounce
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*19.2152f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==5)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*38.4304f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==6)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*115.291f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==7)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*0.000568261f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==8)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*0.568261f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==9)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*568.261f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==10)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*0.125f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==11)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*0.5f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==12)
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
