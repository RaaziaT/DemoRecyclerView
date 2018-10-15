package com.raaziatariq.demorecyclerview;

import java.util.ArrayList;

/**
 * Created by Raazia Tariq on 10/11/2018.
 */

public interface ListContract {
    interface HorizontalRowView{
            void setImage(int image);
            void setTile(String tile);
            void setDescription(String description);
            void setPublishedDate(String publishedDate);
    }
    interface HorizontalRowPresenter{
        void onBindHorizontalRowViewAtPosition(int position, HorizontalRowView horizontalRowView);
        int getHorizontalRowsCount();
    }
    interface VerticalRowView{
        void setImage(int image);
        void setHeader(String header);
        void setSubHeader(String subHeader);
    }
    interface VerticalRowPresenter{
        void onBindVerticalRowViewAtPosition(int position, VerticalRowView verticalRowView);
        int getVerticalRowsCount();
    }
//    interface MainView{
//        ArrayList<HorizontalModel> getHorizontalData();
//        ArrayList<VerticalModel> getVerticalData();
//    }
}
