package com.raaziatariq.demorecyclerview;
import java.util.ArrayList;

public class VerticalPresenter implements ListContract.VerticalRowPresenter {

@Override
public  ArrayList<VerticalModel> getVerticalData(){
    ArrayList<VerticalModel> verticalModels=new ArrayList<>();
    verticalModels.add(new VerticalModel("I","J",R.mipmap.ic_launcher));
    verticalModels.add(new VerticalModel("K","L",R.mipmap.ic_launcher));
    return  verticalModels;
}

    @Override
    public void onBindVerticalRowViewAtPosition(int position, ListContract.VerticalRowView verticalRowView) {
        verticalRowView.setHeader(getVerticalData().get(position).getHeader());
        verticalRowView.setImage(getVerticalData().get(position).getImage());
        verticalRowView.setSubHeader(getVerticalData().get(position).getSubHeader());
    }

    @Override
    public int getVerticalRowsCount() {
        return getVerticalData().size();
    }
}
