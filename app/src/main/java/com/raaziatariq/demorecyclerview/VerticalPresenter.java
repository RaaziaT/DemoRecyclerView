package com.raaziatariq.demorecyclerview;

import java.util.ArrayList;

/**
 * Created by Raazia Tariq on 10/11/2018.
 */

public class VerticalPresenter implements ListContract.VerticalRowPresenter {

    ArrayList<VerticalModel> verticalModels= new ArrayList<>();
    @Override
    public void onBindVerticalRowViewAtPosition(int position, ListContract.VerticalRowView verticalRowView) {
        verticalRowView.setHeader(verticalModels.get(position).getHeader());
        verticalRowView.setImage(verticalModels.get(position).getImage());
        verticalRowView.setSubHeader(verticalModels.get(position).getSubHeader());
    }

    @Override
    public int getVerticalRowsCount() {
        return verticalModels.size();
    }
}
