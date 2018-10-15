package com.raaziatariq.demorecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ListActivity extends AppCompatActivity implements ListContract.MainView {

    @BindView(R.id.recycler_View)
    RecyclerView recyclerView;
    ListPresenter listPresenter;
    MainAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        ButterKnife.bind(this);
        listPresenter= new ListPresenter(this);
    }
    @Override
    public void setRecyclerView() {

        if(listPresenter.getObject()==null)
            Log.i("MainView",listPresenter.getObject().toString());
        else {
            Log.i("MainView",listPresenter.getObject().toString());

        final LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        adapter= new MainAdapter(this, listPresenter.getObject());
        recyclerView.setAdapter(adapter);
        }
    }
    @Override
    public void onResume(){
        super.onResume();
        setRecyclerView();
    }

}
