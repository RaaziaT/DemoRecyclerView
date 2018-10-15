package com.raaziatariq.demorecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.lang.ref.Reference;
import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    HorizontalPresenter horizontalPresenter ;
    VerticalPresenter verticalPresenter;
    private ArrayList<Object> objects = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        RecyclerView recyclerView = findViewById(R.id.recycler_View);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        MainAdapter adapter = new MainAdapter(this, getObject());
        recyclerView.setAdapter(adapter);
    }

    private ArrayList<Object> getObject() {
        objects.add(getVerticalData().get(0));
        objects.add(getHorizontalData().get(0));
        return objects;
    }

    public static ArrayList<HorizontalModel>  getHorizontalData() {
        ArrayList<HorizontalModel> horizontalModels= new ArrayList<>();
        horizontalModels.add(new HorizontalModel(R.mipmap.ic_launcher,"A","B","C"));
        horizontalModels.add(new HorizontalModel(R.mipmap.ic_launcher,"D","E","F"));
        return horizontalModels;
    }
    public static ArrayList<VerticalModel> getVerticalData(){
        ArrayList<VerticalModel> verticalModels=new ArrayList<>();
        verticalModels.add(new VerticalModel("I","J",R.mipmap.ic_launcher));
        verticalModels.add(new VerticalModel("K","L",R.mipmap.ic_launcher));
        return  verticalModels;
    }

//    @Override
//    public void setData() {
//        horizontalPresenter =new HorizontalPresenter(getHorizontalData());
//        verticalPresenter= new VerticalPresenter(getVerticalData());
//    }
}
