package com.raaziatariq.demorecyclerview;

import android.util.Log;

import java.util.ArrayList;

import static com.raaziatariq.demorecyclerview.ListActivity.getHorizontalData;

/**
 * Created by Raazia Tariq on 10/11/2018.
 */

public class HorizontalPresenter implements ListContract.HorizontalRowPresenter {
   // ListContract.MainView mainView;
  public  ArrayList<HorizontalModel> horizontalModels;
    HorizontalPresenter()
    {

    }
//    public HorizontalPresenter(ArrayList<HorizontalModel> horizontalModels){
//        this.horizontalModels=horizontalModels;
//    }
//    public ArrayList<HorizontalModel>  getHorizontalData() {
//
//        horizontalModels=new ArrayList<>();
//        horizontalModels.add(new HorizontalModel(R.mipmap.ic_launcher,"A","B","C"));
//        horizontalModels.add(new HorizontalModel(R.mipmap.ic_launcher,"D","E","F"));
//        return horizontalModels;
//    }

    @Override
    public void onBindHorizontalRowViewAtPosition(int position, ListContract.HorizontalRowView horizontalRowView) {
    horizontalRowView.setImage(getHorizontalData().get(position).getImages());
    horizontalRowView.setDescription(getHorizontalData().get(position).getDesc());
    horizontalRowView.setTile(getHorizontalData().get(position).getTitle());
    horizontalRowView.setPublishedDate(getHorizontalData().get(position).getPubDate());
    }

    @Override
    public int getHorizontalRowsCount() {
//        Log.i("Model Size","Size="+horizontalModels.size());
//      if(horizontalModels.size()!=0)
        return getHorizontalData().size();
//      else return 2;
    }
}
