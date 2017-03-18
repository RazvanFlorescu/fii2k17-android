package com.fiipractic.android.widgets.recyclerview;

import com.fiipractic.android.widgets.R;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by dorunechifor.
 */
public class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.ContactVH> {
    
    private List<Contact> mDataSet;
    
    public ContactsAdapter(@NonNull List<Contact> dataSet) {
        mDataSet = dataSet;
    }
    
    // Create new views (invoked by the layout manager)
    @Override
    public ContactVH onCreateViewHolder(ViewGroup parent, int viewType) {
        final View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_contact, parent, false);
        return new ContactVH(itemView);
    }
    
    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ContactVH holder, int position) {
        holder.bind(mDataSet.get(position));
    }
    
    // Return the size of the dataSet (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataSet.size();
    }
    
    // Provide a reference to the views for each data item
    static class ContactVH extends RecyclerView.ViewHolder {
        
        ContactVH(View itemView) {
            super(itemView);
            // TODO: 3/18/17 inflate views into member variables
        }
        
        void bind(@NonNull Contact contact) {
            // TODO: 3/18/17 bind views to actual data 
        }
    }
    
}
