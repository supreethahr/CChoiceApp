package com.example.anew;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

import java.security.cert.Extension;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener, AdapterView.OnItemSelectedListener {
    //declare checkbox
    CheckBox checkboxAndriod, checkboxJava;

    //declare
    RadioButton rhMajor, rbMinor;
    Spinner spinCountry;

    ListView lvCountry;
    ArrayAdapter<String> countryAdapter;
    private Object AutoCompleteTextView;
    private Object  autoCompleteTxt;
    private Object autocompleteTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AutoCompleteTextView=autocompleteTextView;



        //initialize
        checkboxJava = (CheckBox) findViewById(R.id.checkboxJava);
        checkboxAndriod = (CheckBox) findViewById(R.id.checkboxAndroid);

        checkboxJava.setOnCheckedChangeListener(this);
        checkboxAndriod.setOnCheckedChangeListener(this);

//        rhMajor = (RadioButton) findViewById(R.id.rbMjor);
//        rbMinor = (RadioButton) findViewById(R.id.rbMinor);
//
//        rhMajor.setOnCheckedChangeListener(this);
//        rbMinor.setOnCheckedChangeListener(this);

        spinCountry = (Spinner) findViewById(R.id.spinCountry);
        lvCountry = (ListView) findViewById(R.id.lvCountry);
        countryAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item);
        countryAdapter.add("<--select the country-->");
        countryAdapter.add("India");
        countryAdapter.add("USA");
        countryAdapter.add("France");
        countryAdapter.add("UAE");
        spinCountry.setAdapter(countryAdapter);
        lvCountry.setAdapter(countryAdapter);
        spinCountry.setOnItemSelectedListener(this);
        //Listing adapter
        lvCountry.setAdapter(countryAdapter);
        autoCompleteTxt.setThreshold(1);
        autoCompleteTxt.setAdapter(countryAdapter);
    }

    @Override
    public void onCheckedChanged(CompoundButton cbd, boolean b) {
        switch (cbd.getId()) {
            case R.id.checkboxAndroid:
                Toast.makeText(this, "is android your skill" + b, Toast.LENGTH_LONG).show();
                break;
            case R.id.checkboxJava:
                Toast.makeText(this, "is android your skill" + b, Toast.LENGTH_LONG).show();
                break;


        }
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        Toast.makeText(this, "Selected Country" + countryAdapter.getItem(i), Toast.LENGTH_LONG).show();

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
