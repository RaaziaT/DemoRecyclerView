package com.raaziatariq.demorecyclerview;

import java.util.ArrayList;

/**
 * Created by Raazia Tariq on 10/11/2018.
 */

public class HorizontalPresenter implements ListContract.HorizontalRowPresenter {
    @Override
    public ArrayList<HorizontalModel>  getHorizontalData() {
        ArrayList<HorizontalModel> horizontalModels= new ArrayList<>();
        horizontalModels.add(new HorizontalModel(R.mipmap.ic_launcher,"A","B","C"));
        horizontalModels.add(new HorizontalModel(R.mipmap.ic_launcher,"D","E","F"));
        return horizontalModels;
    }

    @Override
    public void onBindHorizontalRowViewAtPosition(int position, ListContract.HorizontalRowView horizontalRowView) {
    horizontalRowView.setImage(getHorizontalData().get(position).getImages());
    horizontalRowView.setDescription(getHorizontalData().get(position).getDesc());
    horizontalRowView.setTile(getHorizontalData().get(position).getTitle());
    horizontalRowView.setPublishedDate(getHorizontalData().get(position).getPubDate());
    }

    @Override
    public int getHorizontalRowsCount() {
        return getHorizontalData().size();
    }
}
