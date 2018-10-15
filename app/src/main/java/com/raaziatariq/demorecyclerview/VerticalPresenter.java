package com.raaziatariq.demorecyclerview;

import android.util.Log;

import java.util.ArrayList;

//import static com.raaziatariq.demorecyclerview.ListActivity.getHorizontalData;
import static com.raaziatariq.demorecyclerview.ListActivity.getVerticalData;

public class VerticalPresenter implements ListContract.VerticalRowPresenter {
   // ListContract.MainView mainView;
     public   ArrayList<VerticalModel> verticalModels;
        ListContract.VerticalRowView verticalRowView;
        VerticalPresenter()
        {

        }
//    public VerticalPresenter(ArrayList<VerticalModel> verticalModels)
//    {
//            this.verticalModels=verticalModels;
//    }

//    public  ArrayList<VerticalModel> getVerticalData(){
//          verticalModels=new ArrayList<>();
//        verticalModels.add(new VerticalModel("I","J",R.mipmap.ic_launcher));
//        verticalModels.add(new VerticalModel("K","L",R.mipmap.ic_launcher));
//        return  verticalModels;
//    }

    @Override
    public void onBindVerticalRowViewAtPosition(int position, ListContract.VerticalRowView verticalRowView) {
        verticalRowView.setHeader(getVerticalData().get(position).getHeader());
        verticalRowView.setImage(getVerticalData().get(position).getImage());
        verticalRowView.setSubHeader(getVerticalData().get(position).getSubHeader());
    }

    @Override
    public int getVerticalRowsCount() {
//        Log.i("Model Size","Size="+verticalModels.size());
//        if(verticalModels.size() != 0)
        return getVerticalData().size();
//        else return 2;
    }
}
