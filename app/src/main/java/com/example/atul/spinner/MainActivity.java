package com.example.atul.spinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    Spinner spinner;
    String list[] = {"item 1","item 2","item 3","item 4","item 5","item 6"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<String> ad = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,list);
        spinner.setAdapter(ad);
        spinner.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        switch (i){
            case 0:
                Toast.makeText(this, "Item 1", Toast.LENGTH_SHORT).show();
                break;
            case 1:
                Toast.makeText(this, "Item 2", Toast.LENGTH_SHORT).show();
                break;
            case 2:
                Toast.makeText(this, "Item 3", Toast.LENGTH_SHORT).show();
                break;
            case 3:
                Toast.makeText(this, "Item 4", Toast.LENGTH_SHORT).show();
                break;
            case 4:
                Toast.makeText(this, "Item 5", Toast.LENGTH_SHORT).show();
                break;
            case 5:
                Toast.makeText(this, "Item 6", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
