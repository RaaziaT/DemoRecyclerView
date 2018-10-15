package com.raaziatariq.demorecyclerview;

import java.util.ArrayList;

/**
 * Created by Raazia Tariq on 10/11/2018.
 */

public class ListPresenter implements ListContract.MainPresenter {

    ListContract.MainView mainView;
    HorizontalPresenter horizontalPresenter;
    VerticalPresenter verticalPresenter;
    ArrayList<Object> objects = new ArrayList<>();

    public ListPresenter(ListContract.MainView mainView)
    {
        this.mainView= mainView;
        horizontalPresenter = new HorizontalPresenter();
        verticalPresenter = new VerticalPresenter();
    }
    @Override
    public ArrayList<Object> getObject() {
        objects.add(verticalPresenter.getVerticalData().get(0));
        objects.add(horizontalPresenter.getHorizontalData().get(0));
        return objects;
    }
}
