package com.example.alfat.converter;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    try
        {setContentView(R.layout.activity_main);
        String[] Unit_name={"Temperature","Time","Pressure","Weight","Speed","Plane Angle","Length","Energy","Volume","Data Transfer Rate"};
        ListAdapter Unit_name_adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,Unit_name);
        ListView Unit_listview=(ListView)findViewById(R.id.Unit_listView);
        Unit_listview.setAdapter(Unit_name_adapter);
        Unit_listview.setOnItemClickListener(new AdapterView.OnItemClickListener(){
                   @Override
                   public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                       String Unit=String.valueOf(adapterView.getItemAtPosition(i));
                       if(Unit=="Temperature")
                       {
                           Intent myIntent = new Intent(view.getContext(), Temperature.class);
                           startActivityForResult(myIntent, 0);
                       }
                       else if(Unit=="Time")
                       {
                           Intent myIntent = new Intent(view.getContext(), Time.class);
                           startActivityForResult(myIntent, 0);
                       }
                       else if(Unit=="Pressure")
                       {
                           Intent myIntent = new Intent(view.getContext(), Pressure.class);
                           startActivityForResult(myIntent, 0);
                       }
                       else if(Unit=="Weight")
                       {
                           Intent myIntent = new Intent(view.getContext(),Weight.class);
                           startActivityForResult(myIntent, 0);
                       }
                       else if(Unit=="Speed")
                       {
                           Intent myIntent = new Intent(view.getContext(),Speed.class);
                           startActivityForResult(myIntent, 0);
                       }
                       else if(Unit=="Plane Angle")
                       {
                           Intent myIntent = new Intent(view.getContext(),Plane_Angle.class);
                           startActivityForResult(myIntent, 0);
                       }
                       else if(Unit=="Length")
                       {
                           Intent myIntent = new Intent(view.getContext(),Length.class);
                           startActivityForResult(myIntent, 0);
                       }
                       else if(Unit=="Energy")
                       {
                           Intent myIntent = new Intent(view.getContext(),Energy.class);
                           startActivityForResult(myIntent, 0);
                       }
                       else if(Unit=="Volume")
                       {
                           Intent myIntent = new Intent(view.getContext(),Volume.class);
                           startActivityForResult(myIntent, 0);
                       }
                       else if(Unit=="Data Transfer Rate")
                       {
                           Intent myIntent = new Intent(view.getContext(),Data_transfer_rate.class);
                           startActivityForResult(myIntent, 0);
                       }

                   }
               }
        );
    }catch (Exception e)
    {
        e.printStackTrace();
    }
    }
}
