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

public class Plane_Angle extends AppCompatActivity {
    private Spinner spinner1, spinner2;
    private EditText from;
    private TextView to;
    List<String> list1 = new ArrayList<String>();
    List<String> list2 = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plane__angle);
        from = (EditText) findViewById(R.id.from);
        to = (TextView) findViewById(R.id.to);
        spinner1 = (Spinner) findViewById(R.id.spinner1);
        from.addTextChangedListener(mTextEditorWatcher);
        list1.add("Degree");
        list1.add("Gradian");
        list1.add("Milliradian");
        list1.add("Minute of arc");
        list1.add("Radian");
        list1.add("Second of arc");
        ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, list1);
        dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(dataAdapter1);
        spinner2 = (Spinner) findViewById(R.id.spinner2);
        list2.add("Degree");
        list2.add("Gradian");
        list2.add("Milliradian");
        list2.add("Minute of arc");
        list2.add("Radian");
        list2.add("Second of arc");
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
                        b=b+(value*1.11111f);
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
                        b=b+value*17.4533f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==3)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*60;
                        to.setText(b+"");}
                    else
                    {}
                }

                else if(index2==4)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*0.0174533f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==5)
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*3600f;
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
                        b=b+value*0.9f;
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
                        b=b+value*15.708f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==3) //micro gram
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*54.0f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==4) //ounce
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*0.015708f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==5) //gram
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*3240.0f;
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
                        b=b+value*0.0572958f;
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
                        b=b+value*0.063662f;
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
                        b=b+value*3.43775f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==4)//ounce
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*0.001f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==5)//gram
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*206.265f;
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
                        b=b+value *0.0166667f;;
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
                        b=b+value*(0.0185185f);
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
                        b=b+value*(0.290888f);
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
                        b=b+value*(0.000290888f);
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==5)//gram
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*(60.0f);
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
                        b=b+value *57.2958f;;
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
                        b=b+value*(63.662f);
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
                        b=b+value*(1000.00f);
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==3)//micro gram
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*3437.75f;
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
                else if(index2==5)//gram
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*(206265.0f);
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
                        b=b+value *0.000277778f;;
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
                        b=b+value*(0.000308642f);
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
                        b=b+value*(0.00484814f);
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==3)//micro gram
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*0.0166667f;
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==4)//ounce
                {
                    if(from.getText().length()!=0)
                    {  float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value*(4.8481e-6f);
                        to.setText(b+"");}
                    else
                    {}
                }
                else if(index2==5)//gram
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
