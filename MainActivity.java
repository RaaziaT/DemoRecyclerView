package com.raaziatariq.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity implements MultiSpinner.MultiSpinnerListener {

    Spinner spnDepartments;
    ArrayAdapter<CharSequence> adapter1;
    List<String> items = new ArrayList<>();
    String allText = "Name";
    MultiSpinner multiSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spnDepartments = (Spinner) findViewById(R.id.spnDepartments);
        adapter1 = ArrayAdapter.createFromResource(this,R.array.Departments,
                android.R.layout.select_dialog_multichoice);
        adapter1.setDropDownViewResource(android.R.layout.simple_list_item_multiple_choice);
        spnDepartments.setAdapter(adapter1);

        items.add("Raazia");
        items.add("Raazia1");
        items.add("Raazia2");
        items.add("Raazia3");
        items.add("Raazia4");

        multiSpinner= (MultiSpinner) findViewById(R.id.multi_spinner);
        multiSpinner.setItems(items, allText, this);
//        spnDepartments.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//            }
//        });

    }

    @Override
    public void onItemsSelected(boolean[] selected) {

    }
}
