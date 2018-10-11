package com.raaziatariq.demorecyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Raazia Tariq on 10/11/2018.
 */

public class HorizontalAdapter extends RecyclerView.Adapter<HorizontalAdapter.HorizontalViewHolder> {

     HorizontalPresenter horizontalPresenter = new HorizontalPresenter();
    public class HorizontalViewHolder extends RecyclerView.ViewHolder implements ListContract.HorizontalRowView{

        @BindView(R.id.showTitle)
        TextView txtView_title;
        @BindView(R.id.description)
        TextView txtView_description;
        @BindView(R.id.published_date)
        TextView txtView_publisheddate;
        @BindView(R.id.image_view)
        ImageView imageView;
        public HorizontalViewHolder(View v){
            super(v);
            ButterKnife.bind(this,v);
        }
        @Override
        public void setImage(int image) {
                imageView.setImageResource(image);
        }

        @Override
        public void setTile(String tile) {
            txtView_title.setText(tile);
        }

        @Override
        public void setDescription(String description) {
                txtView_description.setText(description);
        }

        @Override
        public void setPublishedDate(String publishedDate) {
                txtView_publisheddate.setText(publishedDate);
        }
    }
    public HorizontalAdapter(HorizontalPresenter horizontalRowPresenter)
    {
        this.horizontalPresenter=horizontalRowPresenter;
    }
    @Override
    public HorizontalAdapter.HorizontalViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new HorizontalViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.horizontal_row, parent, false));
    }

    @Override
    public void onBindViewHolder(HorizontalViewHolder holder, int position) {
        horizontalPresenter.onBindHorizontalRowViewAtPosition(position,holder);
    }

    @Override
    public int getItemCount() {
       return horizontalPresenter.getHorizontalRowsCount();
    }
}
