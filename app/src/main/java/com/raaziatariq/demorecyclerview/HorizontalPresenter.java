package com.raaziatariq.demorecyclerview;

import java.util.ArrayList;

/**
 * Created by Raazia Tariq on 10/11/2018.
 */

public class HorizontalPresenter implements ListContract.HorizontalRowPresenter {
    private ArrayList<HorizontalModel> horizontalModels=new ArrayList<>();
    @Override
    public void onBindHorizontalRowViewAtPosition(int position, ListContract.HorizontalRowView horizontalRowView) {
    horizontalRowView.setImage(horizontalModels.get(position).getImages());
    horizontalRowView.setDescription(horizontalModels.get(position).getDesc());
    horizontalRowView.setTile(horizontalModels.get(position).getTitle());
    horizontalRowView.setPublishedDate(horizontalModels.get(position).getPubDate());
    }

    @Override
    public int getHorizontalRowsCount() {
        return horizontalModels.size();
    }
}
