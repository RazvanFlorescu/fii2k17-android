package com.fiipractic.android.widgets.recyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fiipractic.android.widgets.R;


/**
 * Created by dorunechifor.
 */
public class CollageAdapter extends RecyclerView.Adapter<CollageAdapter.CollageVH> {
    // TODO: 3/18/17 to be completed

    private int[] mDataSet;

    public CollageAdapter(int[] dataSet) {
        mDataSet = dataSet;
    }

    @Override
    public CollageVH onCreateViewHolder(ViewGroup parent, int viewType) {
        final View itemView = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.item_collage_background, parent, false);
        return new CollageVH(itemView);
    }


    @Override
    public int getItemCount() {
        return mDataSet.length;
    }

    @Override
    public void onBindViewHolder(CollageVH holder, int position) {
        holder.bind(mDataSet[position]);
    }

    static class CollageVH extends RecyclerView.ViewHolder {
        View vItem;

        public CollageVH(View itemView) {
            super(itemView);
            vItem = itemView.findViewById(R.id.vItem);
        }

        void bind(int itemColor) {
            vItem.setBackgroundColor(itemColor);
        }
    }

}
