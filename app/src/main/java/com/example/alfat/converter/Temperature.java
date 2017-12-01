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
public class Temperature extends AppCompatActivity {
    private Spinner spinner1, spinner2;
    private EditText from;
    private TextView to;
    List<String> list1 = new ArrayList<String>();
    List<String> list2 = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature);
        from = (EditText) findViewById(R.id.from);
        to = (TextView) findViewById(R.id.to);
        spinner1 = (Spinner) findViewById(R.id.spinner1);
        from.addTextChangedListener(mTextEditorWatcher);
        list1.add("Kelvin");
        list1.add("Celsius");
        list1.add("Fahrenheit");
        ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, list1);
        dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(dataAdapter1);
        spinner2 = (Spinner) findViewById(R.id.spinner2);
        list2.add("Kelvin");
        list2.add("Celsius");
        list2.add("Fahrenheit");
        ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, list2);
        dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(dataAdapter2);
        {
            try {
            spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long arg3) {
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
            public void onItemSelected(AdapterView<?> arg0, View arg1, int position1, long arg3) {
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
            int index2 = spinner2.getSelectedItemPosition();
            double resul=0;
            if(index1==0)
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
                        b=b+(value-273.15f);
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
                        b=b+((value-273.15f)*9)/5+32;
                        to.setText(b+"");}
                    else
                    {}
                }
            }
            else if (index1==1)
            {

                if(index2==0)
                {
                    if(from.getText().length()!=0)
                    { float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+value+273.15f;
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
                        b=b+value;
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
                        b=b+(9*value)/5+32;
                        to.setText(b+"");}
                    else
                    {}
                }

            }
           else if(index1==2)
            {
                if(index2==0)
                {
                    if(from.getText().length()!=0)
                    { float value = Float.parseFloat(from.getText().toString());
                        float b=0;
                        b=b+((value-32)*5)/9+273.15f;
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
                        b=b+(9*value)/5+32;
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
                getResult(); }catch (Exception e){
                Log.d("",e.getMessage());
            }
        }
    };
}
