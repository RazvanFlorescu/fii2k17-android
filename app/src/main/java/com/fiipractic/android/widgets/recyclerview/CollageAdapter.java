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
        View vItem1, vItem2, vItem3, vItem4;

        public CollageVH(View itemView) {
            super(itemView);
            vItem1 = itemView.findViewById(R.id.vItem1);
            vItem2 = itemView.findViewById(R.id.vItem2);
            vItem3 = itemView.findViewById(R.id.vItem3);
            vItem4 = itemView.findViewById(R.id.vItem4);

        }

        void bind(int itemColor) {
            vItem1.setBackgroundColor(itemColor);
            vItem2.setBackgroundColor(itemColor+1);
            vItem3.setBackgroundColor(itemColor-1);
            vItem4.setBackgroundColor(itemColor+2);

        }
    }

}
