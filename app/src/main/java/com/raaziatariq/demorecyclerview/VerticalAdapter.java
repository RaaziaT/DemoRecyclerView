package com.raaziatariq.demorecyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Raazia Tariq on 10/11/2018.
 */

public class VerticalAdapter extends RecyclerView.Adapter<VerticalAdapter.VerticalViewHolder> {

     VerticalPresenter verticalPresenter;

    public VerticalAdapter(VerticalPresenter verticalPresenter){
        this.verticalPresenter=verticalPresenter;
    }
    @Override
    public VerticalViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new VerticalViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.vertical_row, parent, false));
    }

    @Override
    public void onBindViewHolder(VerticalViewHolder holder, int position) {
       verticalPresenter.onBindVerticalRowViewAtPosition(position,holder);
    }

    @Override
    public int getItemCount() {
        return verticalPresenter.getVerticalRowsCount();
    }

    public class VerticalViewHolder extends RecyclerView.ViewHolder implements ListContract.VerticalRowView {

        @BindView(R.id.image)
        ImageView imageView;
        @BindView(R.id.title)
        TextView txtView_title;
        @BindView(R.id.description)
        TextView txtView_description;
        public VerticalViewHolder(View v){
            super(v);
            ButterKnife.bind(this,v);
        }
        @Override
        public void setImage(int image) {
            imageView.setImageResource(image);
        }

        @Override
        public void setHeader(String header) {
            txtView_title.setText(header);
        }

        @Override
        public void setSubHeader(String subHeader) {
            txtView_description.setText(subHeader);
        }
    }
}
